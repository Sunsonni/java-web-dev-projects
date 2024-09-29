import java.io.IOException;
import java.nio.charset.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Paths;
import java.nio.file.Path;

public class charactersInString {
    public static void main (String[] arg){
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

    //items for reading from user input
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input the line you want to know the character count for: ");
//        String line = input.nextLine();

        try {
    //reading from file
            Path filepath = Paths.get("/Users/sonnienguyen/Desktop/Java Projects/java-web-dev-projects/control-flow-and-collections/studio/counting-characters/src/main/java/test.txt");
            String content = Files.readString(filepath, StandardCharsets.UTF_8);
            HashMap<Character, Integer> countCharMap = new HashMap<Character, Integer>();
    //counting characters
            char[] charactersInString = content.replaceAll("[^a-zA-Z0-9]","").toUpperCase().toCharArray();
            for(char c : charactersInString) {
                if(countCharMap.containsKey(c)) {
                    countCharMap.put(c, countCharMap.get(c) + 1);
                } else {
                    countCharMap.put(c, 1);
                }
            }
    //outputting characters
            for(Map.Entry<Character, Integer> entry : countCharMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
