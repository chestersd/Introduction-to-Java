package com.epam.basics;

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {

        double result;
        double valueX;
        double valueY;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value X");
        double string = scanner.nextDouble();
        valueX = string;

        System.out.println("Enter value Y");
        string = scanner.nextDouble();
        valueY = string;

        result = (Math.sin(valueX) + Math.cos(valueY)) /
                (Math.cos(valueX) - Math.sin(valueY) *
                        Math.tan(valueX * valueY));

        System.out.println("Result is " + result);
    }
}
