package com.epam.basics;

import java.util.Scanner;

public class Sum1 {
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

        result = ((numA - 3) * numB / 2) + numC;

        System.out.println("Z equals " + result);
    }
}
