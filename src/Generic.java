//Class used to store the term, the generic sentence and the confidence score
public class Generic
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
        return confidence_score;
    }

    //Method that checks if the term parsed through is the same as the term of the Generic object
    public boolean equals(String term)
    {
        return this.term.equals(term);
    }

    //Method to update the sentence given the term
    public void update(String inSentence,double inConfidence)
    {
        sentence = inSentence;
        confidence_score = inConfidence;
    }
}
