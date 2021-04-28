package com.company.StringExamples;

public class WordCountWithSplit {
    public static int wordCount(String input) {
        if (input == null || input.isEmpty())
        {
            return 0;

        }

        String[] words = input.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("This is me collins"));
        System.out.println(wordCount("Hi, there I'm called collins chuwa wandji "));
    }
}
