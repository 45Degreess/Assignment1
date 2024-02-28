
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class GenericsKB_BST
{
    private BinarySearchTree<Generic> bst = new BinarySearchTree<>();

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
                bst.insert(new Generic(term, sentence, confidence));
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
        return node.getData().toString();
    }
}
