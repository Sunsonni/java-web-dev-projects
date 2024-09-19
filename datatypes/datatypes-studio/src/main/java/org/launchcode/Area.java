package org.launchcode;
import java.util.Scanner;

public class Area {
    public static final double PI = 3.14159;
    public static void main (String[] args) {
        Double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        area = Circle.getArea(radius);
        System.out.println("The area of the circle with a radius of " + radius + " is: " + area);
        input.close();
    }
}
