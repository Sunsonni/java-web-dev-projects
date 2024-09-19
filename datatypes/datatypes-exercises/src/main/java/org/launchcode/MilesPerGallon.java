package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double milesDriven = input.nextDouble();
        System.out.println("How much gas did you use?");
        double gasUsedGallons = input.nextDouble();
        input.close();
        double milesPerGallon = milesDriven/gasUsedGallons;
        System.out.println("You've driven " + milesPerGallon + " miles per gallon of gas.");
    }
}
