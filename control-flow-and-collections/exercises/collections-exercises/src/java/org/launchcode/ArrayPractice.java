package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8 };
        for(int number : intArray) {
            if (number % 2 != 0) {
            System.out.println(number);
            }
        }

        String prompt = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] promptSplit = prompt.split("\\.");
        System.out.println(Arrays.toString(promptSplit));
    }
}
