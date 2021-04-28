package com.company;

import java.util.Arrays;
/*
* Bubble sorting arrays using built in Java methods.
 */
public class BubbleSortMethod2 {
    public static void main(String[] args) {
        int [] arr = {23, 2, 1, 4, 60, 10};
        Arrays.sort(arr);

        for (int i : arr) {
            String s = i + " ";
            System.out.print(s);
        }
    }
}
