package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        input.close();
        double area = Math.PI * radius * radius;

        if (radius < 0) {
            System.out.println("Please enter a valid number");
        } else {
            System.out.println("The area of a circle of radius is: " + area);
        }
    }
}
