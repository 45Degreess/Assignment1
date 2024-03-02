package App;//Class used to store the term, the generic sentence and the confidence score
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Generic implements Comparable<Generic>
{
    private String term,sentence;
    private double confidence_score;

    public Generic(String term,String sentence, double confidence_score)
    {
        this.term = term;
        this.sentence = sentence;
        this.confidence_score = confidence_score;
    }

    //copy constructor
    public Generic(Generic other)
    {
        new Generic(other.term,other.sentence,other.confidence_score);
    }

    //Method to access the term value
    public String getTerm()
    {
        return term;
    }

    //Method to access the generic sentence
    public String getSentence()
    {
        return sentence;
    }

    //Method to access the confidence score
    public double getConfidence_score()
    {
        //Return confidence score rounded of to 3 decimal places
        DecimalFormat deci = new DecimalFormat("0.000");
        deci.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        confidence_score = Double.parseDouble(deci.format(confidence_score));
        return confidence_score;
    }

    //Method that checks if the term parsed through is the same as the term of the Generic object
    public boolean equals(String term)
    {
        return this.term.equalsIgnoreCase(term);
    }

    //Method to update the sentence given the term
    public void update(String inSentence,double inConfidence)
    {
        sentence = inSentence;
        confidence_score = inConfidence;
    }

    public String toString()
    {
        DecimalFormat deci = new DecimalFormat("0.00");
        //change decimal separator to a point(.)
        deci.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        return sentence + " (Confidence score: "+ deci.format(confidence_score) +")";
    }

    public int compareTo(Generic other)
    {
            return term.compareTo(other.term);
    }
}
