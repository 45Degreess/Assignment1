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
import java.util.Locale;

/**
 * Manager Class the defines all the functions needed for the Generics Array App
 */
public class GenericsKbArrayApp
{
    /**
     * Stores an array of {@link Generic} objects
     */
    private Generic[] genericArr = new Generic[2000000];
    /**
     * Stores the current of amount of elements in the array
     */
    private int size = 0; // Variable storing the amount of elements in the array
    /**
     * Stores the index in the array of an elements after a search has been done
     */
    private int searchIndex = -1;

    /**
     * Constructor method
     * @param textFile the path of the text file holding knowledge base
     */
    public GenericsKbArrayApp(String textFile)
    {
        readFile(textFile);
    }

    /**
     * method to reads in data from text file to the array of generics objects
     * @param textFile the path of the text file holding knowledge base
     */
    public void readFile(String textFile)
    {
        try
        {
            BufferedReader ff = new BufferedReader(new FileReader(textFile));
            String line;
            while((line = ff.readLine()) != null)
            {
                String temp []= line.split("\\t");
                String term = temp[0];
                String sentence = temp[1];
                double confidence = Double.parseDouble(temp[2]);
                Generic present = search(term);
                if(present == null)
                {
                    genericArr[size] = new Generic(term, sentence, confidence);
                    size++;
                }
                else
                {
                    if(present.getConfidence_score() <= confidence)
                    {
                        genericArr[searchIndex].update(sentence, confidence);
                        searchIndex = -1;
                    }
                }
            }
            ff.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Linear search that goes through the array sequentially until the term is found
     * @param term holds the term to be searched for
     * @return a {@link Generic} Object if term is found else return null
     */
    private Generic search(String term)
    {
        for (int i = 0; i <size; i++)
        {
            if(genericArr[i].equals(term))
            {
                searchIndex = i;
                return genericArr[i];
            }
        }
        searchIndex = -1;
        return null;
    }

    /**
     * @paramthe statement of the term given if the term is on the database
     * @return  the statement of the term given if the term is on the database
     */
    public String display(String term)
    {
        Generic temp = search(term);
        if(temp != null)
        {
            return temp.toString();
        }
        return "The term is not in the database";
    }

    /**
     * @param term the term in which the statement is going to be displayed
     * @param sentence the sentence in which the statement is going to be displayed
     * @return the confidence score of the term if the term is in the database.
     */
    public String display(String term, String sentence)
    {
        Generic temp = search(term);
        if(temp != null)
        {
            if(temp.getSentence().equalsIgnoreCase(sentence))
            {
                DecimalFormat deci = new DecimalFormat("0.00");
                //change decimal separator to a point(.)
                deci.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                return "The confidence score for the term and statement is: "+deci.format(temp.getConfidence_score());
            }
            return "Term found but statement is not in the database";
        }
        return "The term is not in the database";
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
        Generic present = search(term);
        if(present == null)
        {
            genericArr[size] = new Generic(term, sentence, confidence);
            size++;
            return "A new term was added to the database";
        }
        else
        {
            if(present.getConfidence_score() <= confidence)
            {
                genericArr[searchIndex].update(sentence, confidence);
                searchIndex = -1;
                return "The term in the database was updated";
            }
            return "The confidence score inputed is lower than the existing score";
        }
    }

    /**
     * Method to create a {@link TableModel} to add terms to table
     * @param table a {@link JTable} where the terms will be displayed in GUI
     * @return TableModel with terms
     */
    public TableModel populateTable(JTable table)
    {
        DefaultTableModel model =(DefaultTableModel) table.getModel();
        model.setRowCount(0);
        Object rowData [] = new Object[3];

        for(int i =0; i < size; i++)
        {
            rowData[0] = genericArr[i].getTerm();
            rowData[1] = genericArr[i].getSentence();
            rowData[2] = genericArr[i].getConfidence_score();
            model.addRow(rowData);
        }
        return model;
    }
}