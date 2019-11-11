package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        boolean negRadius = true;
        Scanner in = new Scanner(System.in);
        System.out.print("What is the radius?");
        double radius = in.nextDouble();

        if(radius >= 0) {
            negRadius = false;
        }
        while(negRadius) {
            System.out.print("Error: the radius cannot be negative. ");
            System.out.print("Please enter a positive radius: ");
            radius = in.nextDouble();

            if(radius >= 0) {
                negRadius = false;
            }
        }
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle of radius " + radius + " is " + area);
    }
}
