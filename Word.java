// Class Word
// Instantiates the arrays that contain individual words to be built with SentenceBuilder.
// Aaron Roach - CSIS 312-D02

import java.util.Random;

public class Word
{

    // instance variables
    private String[] articles;
    private String[] nouns;
    private String[] verbs;
    private String[] prepositions;
    private Random randomWord = new Random();

    // default constructor, requires four arrays of strings to be passed as arguments.
    public Word(String[] articles, String[] nouns, String[] verbs, String[] prepositions)
    {
        this.articles = articles;
        this.nouns = nouns;
        this.verbs = verbs;
        this.prepositions = prepositions;
    }

    // get methods
    public String getArticle()
    {
        return this.articles[this.randomWord.nextInt(articles.length)];
    }

    public String getNoun()
    {
        return this.nouns[this.randomWord.nextInt(nouns.length)];
    }

    public String getVerb()
    {
        return this.verbs[this.randomWord.nextInt(verbs.length)];
    }

    public String getPreposition()
    {
        return this.prepositions[this.randomWord.nextInt(prepositions.length)];
    }

}// End of class Word