package App;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Manager Class the defines all the functions needed for the Generics BinarySearchTree App
 */
public class GenericsKbBSTApp
{
    /**
     * Stores a {@link BinarySearchTree} Object of type {@link Generic}
     */
    private BinarySearchTree<Generic> bst = new BinarySearchTree<>();

    //Reads in data from file and populates the BST

    /**
     *  Constructor method
     * @param file the path of the text file holding knowledge base
     */
    public GenericsKbBSTApp(String file)
    {
        readFile(file);
    }

    /**
     * method to reads in data from text file to the array of generics objects
     * @param file the path of the text file holding knowledge base
     */
    public void readFile(String file)
    {
        try
        {
            BufferedReader ff= new BufferedReader(new FileReader(file));
            String line;
            while((line = ff.readLine()) != null)
            {
                String temp []= line.split("\\t");
                String term = temp[0];
                String sentence = temp[1];
                double confidence = Double.parseDouble(temp[2]);
                BSTNode<Generic> present = bst.search(new Generic(term,sentence,confidence));
                if(present == null)
                    bst.insert(new Generic(term, sentence, confidence));
                else if(present.getData().getConfidence_score() <=confidence)
                    present.getData().update(sentence, confidence);
            }
            ff.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Uses the search function of the {@link BinarySearchTree} to finds a {@link BSTNode} with the same term
     * @param term the statement of the term given if the term is on the database
     * @return the statement of the term given if the term is on the database
     */
    public String display(String term)
    {
        BSTNode<Generic> node = bst.search(new Generic(term,"",0));
        if( node != null)
            return node.getData().toString();
        return null;
    }

    /**
     * @param term the term in which the statement is going to be displayed
     * @param sentence the sentence in which the statement is going to be displayed
     * @return the confidence score of the term if the term is in the database.
     */
    public String display(String term, String sentence)
    {
        BSTNode<Generic> node = bst.search(new Generic(term,"",0));
        if(node != null)
        {
            if(node.getData().getSentence().equals(sentence))
            {
                DecimalFormat deci = new DecimalFormat("0.00");
                //change decimal separator to a point(.)
                deci.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                return deci.format(node.getData().getConfidence_score());
            }
            return null;
        }
        return null;
    }

    /**
     * Method that allows the user to input a new term and statement into the database
     * @param term the term to be inserted into the knowledge base
     * @param sentence the sentence of the term to be inserted into the knowledge base
     * @param confidence the confidence score of the term to be inserted into the knowledge base
     * @return return a {@link String} representing the outcome of the user add method
     */
    public String userAdd(String term,String sentence, double confidence)
    {
        Generic insert = new Generic(term,sentence,confidence);
        BSTNode<Generic> node = bst.search(insert);
        if(node == null)
        {
            bst.insert(insert);
            return "A new term was added to the database";
        }
        else if(node.getData().getConfidence_score() <=confidence)
        {
            node.getData().update(sentence, confidence);
            return "The term in the database was updated";
        }
        return "The confidence score inputed is lower than the existing score";
    }


    /**
     * Method to create a {@link TableModel} to add terms to table
     * @param table a {@link JTable} where the terms will be displayed in GUI
     * @return TableModel with terms
     */
    public TableModel populateTable(JTable table)
    {
        ArrayList<Generic> genericArr= bst.getTableData();
        DefaultTableModel model =(DefaultTableModel) table.getModel();
        model.setRowCount(0);
        Object rowData [] = new Object[3];
        for(int i =0; i < genericArr.size(); i++)
        {
            rowData[0] = genericArr.get(i).getTerm();
            rowData[1] = genericArr.get(i).getSentence();
            rowData[2] = genericArr.get(i).getConfidence_score();
            model.addRow(rowData);
        }
        return model;
    }
}