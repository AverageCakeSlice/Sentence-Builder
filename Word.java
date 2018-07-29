// Class Word
// Instantiates the arrays that contain individual words to be built with SentenceBuilder.
// Aaron Roach - CSIS 312-B02

public class Word
{
    // instance variables
    private String[] articles = {"the", "a", "one", "some", "any"};
    private String[] nouns = {"boy", "girl", "dog", "town", "car"};
    private String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] prepositions = {"to", "from", "over", "under", "on"};

    // get methods
    public String getArticle(int i)
    {
        return this.articles[i];
    }

    public String getNoun(int i)
    {
        return this.nouns[i];
    }

    public String getVerb(int i)
    {
        return this.verbs[i];
    }

    public String getPreposition(int i)
    {
        return this.prepositions[i];
    }
}// End of class Word