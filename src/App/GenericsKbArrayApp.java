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

public class GenericsKbArrayApp
{
    private Generic[] genericArr = new Generic[2000000];
    private int size = 0; // Variable storing the amount of elements in the array
    private int searchIndex = -1; //Holds the index in the array of a variable found in array

    //reads in data from text file to the array of generics objects
    public GenericsKbArrayApp(String textFile)
    {
        readFile(textFile);
    }

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

    //Linear search that goes through the array sequentially until the term is found, returns a null String if nothing is found
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

    //returns the statement of the term given if the term is on the database
    public String display(String term)
    {
        Generic temp = search(term);
        if(temp != null)
        {
            return temp.toString();
        }
        return "The term is not in the database";
    }

    //returns the confidence score of the term if the term is in the database.
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