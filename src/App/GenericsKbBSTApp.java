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

public class GenericsKbBSTApp
{
    private BinarySearchTree<Generic> bst = new BinarySearchTree<>();

    //Reads in data from file and populates the BST
    public GenericsKbBSTApp(String file)
    {
        readFile(file);
    }

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

    public String display(String term)
    {
        BSTNode<Generic> node = bst.search(new Generic(term,"",0));
        if( node != null)
            return node.getData().toString();
        return null;
    }

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