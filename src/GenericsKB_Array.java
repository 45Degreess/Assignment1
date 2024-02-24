
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class GenericsKB_Array
{
    private Generic [] genericArr = new Generic[2000000];
    private int size = 0; // Variable storing the amount of elements in the array
    //reads in data from text file to the array of generics objects
    public void readData(String textFile)
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
                genericArr[size] = new Generic(term,sentence,confidence);
                size++;
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
}

