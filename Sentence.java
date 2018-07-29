// Sentence
// Creates structured sentences from random verbs, nouns, and other parts of speech contained in the Word class.
// Aaron Roach - CSIS 312-D02



public class Sentence
{

    // instance variables
    private String[] articles = {"the", "a", "one", "some", "any"};
    private String[] nouns = {"boy", "girl", "dog", "town", "car"};
    private String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] prepositions = {"to", "from", "over", "under", "on"};
    private Word word = new Word(getArticleArray(), getNounArray(), getVerbArray(), getPrepositionArray());


    // get methods
    public String[] getArticleArray()
    {
        return this.articles;
    }

    public String[] getNounArray()
    {
        return this.nouns;
    }

    public String[] getVerbArray()
    {
        return this.verbs;
    }

    public String[] getPrepositionArray()
    {
        return this.prepositions;
    }

    public Word getWord()
    {
        return this.word;
    }

    // set methods
    public void setArticleArray(String[] articles)
    {
        this.articles = articles;
    }

    public void setNounArray(String[] nouns)
    {
        this.nouns = nouns;
    }

    public void setVerbArray(String[] verbs)
    {
        this.verbs = verbs;
    }

    public void setPrepositionArray(String[] prepositions)
    {
        this.prepositions = prepositions;
    }

    public void setWord(Word word)
    {
        this.word = word;
    }


    // getSentence method
    // generates a string of random words from the arrays provided in class Word, and concatenates and formats
    // according to sentence structure conventions.
    public StringBuilder getSentence()
    {
        StringBuilder sentence = new StringBuilder("");
        sentence.append(getWord().getArticle())
                .append(" ")
                .append(getWord().getNoun())
                .append(" ")
                .append(getWord().getVerb())
                .append(" ")
                .append(getWord().getPreposition())
                .append(" ")
                .append(getWord().getArticle())
                .append(" ")
                .append(getWord().getNoun())
                .append(".")
                .setCharAt(0, Character.toUpperCase(sentence.charAt(0))); // capitalizes the first character of the completed string.
        return sentence;
    }
    
}// End of class Sentence