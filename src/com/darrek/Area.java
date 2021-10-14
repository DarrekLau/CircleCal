package com.darrek;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        int diameter;
        double area, circumference;

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter the circle's diameter: ");
        diameter = scanner.nextInt();

        area = Math.PI * Math.pow(diameter/2 , 2);
        circumference = 2 * Math.PI * (diameter/2);

        System.out.println ("The area of the circle is: " + area);
        System.out.println ("The circumference of the circle is :" + circumference);

        scanner.close();
    }

}
