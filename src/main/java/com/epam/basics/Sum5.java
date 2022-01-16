package com.epam.basics;

import java.util.Scanner;

public class Sum5 {
    public static void main(String[] args) {

        int number;
        int hours;
        int minutes;
        int seconds;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number");
        number = scanner.nextInt();

        seconds = number % 60;
        hours = number / 3600;
        minutes = (number - (hours * 3600) - seconds) / 60;

        System.out.println(number + " seconds are " + hours + "h " + minutes + "m " + seconds + "s");

    }
}
