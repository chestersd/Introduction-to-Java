package com.epam.basics;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        double result;
        double numA;
        double numB;
        double numC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A");
        double string = scanner.nextDouble();
        numA = string;

        System.out.println("Enter number B");
        string = scanner.nextDouble();
        numB = string;

        System.out.println("Enter number C");
        string = scanner.nextDouble();
        numC = string;

        result = (numB + Math.sqrt(Math.pow(numB, 2) + 4 * numA * numC) / 2 * numA)
        - Math.pow(numA, 3) * numC + Math.pow(numB, -2);

        System.out.println("Result is " + result);
    }
}
