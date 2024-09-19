package org.launchcode;
import java.util.Scanner;

public class SearchForTerm {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String prompt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("Here's the prompt: " + prompt);
        System.out.println("What word do you want to look for in the prompt?");
        String word = input.nextLine();
        System.out.println(prompt.indexOf(word));
        System.out.println(word.length());

        String finalPrompt = prompt.replace(word, "");
        System.out.println(finalPrompt);

    }
}
