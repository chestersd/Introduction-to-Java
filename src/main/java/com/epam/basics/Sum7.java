package com.epam.basics;

import java.util.Scanner;

public class Sum7 {
    public static void main(String[] args) {

        int valueX;
        int valueY;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of X");
        valueX = scanner.nextInt();
        System.out.println("Enter value of Y");
        valueY = scanner.nextInt();

        if ((valueX >= (-4) && valueX <= 4) && (valueY >= (-3) && valueY <= 4)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
