package com.epam.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sum4 {
    public static void main(String[] args) {
        double result;
        double number;
        double numberN;
        String resultValue;
        String text;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number type of nnn.ddd");
        text = scanner.nextLine();
        number = Double.parseDouble(text);

        numberN = (int)number;
        result = numberN / 1000 + (number - numberN) * 1000;

        DecimalFormat decimalFormat = new DecimalFormat( ".###" );
        resultValue = decimalFormat.format(result);
        System.out.println("Number " + number + " looks opposite as " + resultValue);

    }
}
