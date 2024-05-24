package com.company.StringExamples;

import java.util.StringTokenizer;

public class WordCount {
    public static int count(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        StringTokenizer tokens = new StringTokenizer(input);
        return tokens.countTokens();
    }

    public static void main(String[] args) {
        System.out.println(count("this is me on the move to be better"));
        System.out.println("Holla! this is mi amigo");
    }
}
