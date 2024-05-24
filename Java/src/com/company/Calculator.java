package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) {
        String s1 = getInput("Enter a number: ");
        String s2 = getInput("Enter a number: ");
        String operations = getInput("Enter 1=Add, 2=Subtract 3=Multiply, 4=Divide ");

        int operationsInt = Integer.parseInt(operations);
        double result = 0;

        switch (operationsInt) {
            case 1:
                result = addTwoValues(s1, s2);
                break;
            case 2:
                result = subTwoValues(s1, s2);
                break;
            case 3:
                result = MultiplyTwoValues(s1, s2);
                break;
            case 4:
                result = divideTwoValues(s1, s2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operationsInt);
        }
        System.out.println("Calculation is " + result);
    }

    private static double MultiplyTwoValues(String s1, String s2) {
        double m1 = Double.parseDouble(s1);
        double m2 = Double.parseDouble(s2);

        double result = m1 * m2;
        return result;

    }

    private static double divideTwoValues(String s1, String s2) {
        double dd1 = Double.parseDouble(s1);
        double dd2 = Double.parseDouble(s2);

        double result;
        if (dd1 > dd2) {
            result = dd1 / dd2;
        } else {
            result = dd2 / dd1;
        }
        return result;
    }

    private static double addTwoValues(String s1, String s2) throws NumberFormatException {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);

        double result = d1 + d2;
        return result;

    }

    private static double subTwoValues(String s1, String s2) throws NumberFormatException {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);

        double result;
        if (d1 > d2) {
            result = d1 - d2;
        } else {
            result = d2 - d1;
        }
        return result;

    }

    public static  String getInput(String prompt) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(prompt);
        System.out.flush();

        try {
            return stdin.readLine();

        } catch (Exception e) {
            final String s = "Error: " + e.getMessage();
            return s;
        }
    }

    /*
    private static double addTwoMultiples(double ... values) {
        double result = 0d;
        for (double d: values) {
            result += d;
        }
        return result;
    }
     */

}
