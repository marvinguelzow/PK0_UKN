import java.util.Random;

public class Exampleclass {

    public static void main(String[] args) {
        words();
    }
    
    private static void words() {
        String[] pronouns = {"I", "You", "They"};
        String[] nouns = {"He", "She", "John", "Donald Trump", "Hillary Clinton"};
        String[] verbs = {"eat", "drive", "say", "love", "hate", "approve", "mention", "export"};
        String[] objects = {"mexican people", "a car", "Döner", "foreign policy", "Putin"};
        String[] adverbs = {"quickly", "slowly", "loudly", "carefully", "in an offensive way"};
        
        Random randomGenerator = new Random();
        String sentence = "";
        
        boolean doPronoun = false; // Warum das extra anlegen?
        
        if (randomGenerator.nextFloat() > 0.5f)
        {
            doPronoun = true;
        }
        
        if (doPronoun)
        {
            sentence += pronouns[randomGenerator.nextInt(pronouns.length)]; // Funktion hierfür?
        }
        else
        {
            sentence += nouns[randomGenerator.nextInt(nouns.length)]; // fehlerquelle!
        }
        
        sentence += " " + verbs[randomGenerator.nextInt(verbs.length)];
        
        if (!doPronoun)
        {
            sentence += "s";
        }
        
        sentence += " " + objects[randomGenerator.nextInt(objects.length)];
        sentence += " " + adverbs[randomGenerator.nextInt(adverbs.length)] + ".";
        
        System.out.println(sentence);
    }
    
    private static String getRandom(String[] source, Random rg)
    {
        return source[rg.nextInt(source.length)];
    }

    public void numbers() {
        for(int i = 0; i < 10; ++i)
        {
            for(int j = 0; j < 10; ++j) 
            {
                if ((i * j) % 3 == 1)
                {
                    System.out.println("> " + i * j);
                }
                else if ((i * j % 7 == 0))
                {
                    System.out.println(">> " + i * j);
                }
                else 
                {
                    System.out.println(i * j);
                }
            }
        }
    }
}
