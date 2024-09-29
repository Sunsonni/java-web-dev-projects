package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>(
                Arrays.asList(1, 2, 5, 5, 6, 8, 9, 10, 56, 4, 5, 8 ));
        System.out.println("integers: " + integers);
        int sum = sumOfAllEven(integers);
        System.out.println("Sum of all even numbers equals " + sum);

        Scanner input = new Scanner(System.in);
        int length;
        String prompt = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        System.out.println("What length word do you want to find?");
        length = input.nextInt();
        ArrayList<String> listOfWords = new ArrayList<String>(
                Arrays.asList(prompt.replaceAll("[,.]", "").split(" ")));
        ArrayList<String> nLetterList = nLetterWords(listOfWords, length);
        for(String word : nLetterList) {
         System.out.println(word);
        }
    }

    public static int sumOfAllEven (ArrayList<Integer> list){
        int sum = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static ArrayList<String> nLetterWords (ArrayList<String> list, int length){
        ArrayList<String> words = new ArrayList<>();
        for(String word : list){
            if(word.length() == length)
            {
                words.add(word);
            }
        }
        return words;
    }
}
