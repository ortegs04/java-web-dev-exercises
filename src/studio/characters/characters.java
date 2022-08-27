package studio.characters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class characters {
    public static void characterCount(String inputString){


        HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();
        Scanner input = new Scanner(System.in);
        char[] charactersInString = inputString.toCharArray();


        for (char t : charactersInString)
        {
            if(characterCount.containsKey(t))
            {
                characterCount.put(t, characterCount.get(t)+1);
            }
            else
            {
                characterCount.put(t, 1);
            }
        }
        System.out.println(inputString+"\n : "+characterCount);
    }

    public static void main(String[] args)
    {
        characterCount("If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there");

    }
}

