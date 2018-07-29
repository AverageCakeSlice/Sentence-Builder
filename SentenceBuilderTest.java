// Class SentenceBuilderTest
// Tests the functionality of class Sentence by instantiating a sentence object and
// invoking it's getSentence() method.
// Aaron Roach - CSIS 312-D02

public class SentenceBuilderTest
{
    public static void main(String[] args)
    {
        System.out.printf("%nAaron Roach - Assignment 4%n%n");

        //  loop prints the string representation of a randomly-generated, formatted StringBuilder object twenty times.
        for (int i = 0; i < 20; i++)
        {
            Sentence mySentence = new Sentence();
            System.out.printf("%s%n", mySentence.getSentence().toString());
        }

        System.out.printf("%n");
    }
}// End of class SentenceBuilderTest