package App;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class GenericsKB_BST
{
    private BinarySearchTree<Generic> bst = new BinarySearchTree<>();

    //Reads in data from file and populates the BST
    public GenericsKB_BST(String file)
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
                else if(present.getData().getConfidence_score() <confidence)
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

    public void userAdd(String term,String sentence, double confidence)
    {
        Generic insert = new Generic(term,sentence,confidence);
        BSTNode<Generic> node = bst.search(insert);
        if(node == null)
            bst.insert(insert);
        else if(node.getData().getConfidence_score() <confidence)
            node.getData().update(sentence, confidence);
    }
}