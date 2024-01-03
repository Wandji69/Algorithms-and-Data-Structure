package com.java;

import java.util.Scanner;

public class LinearArraySearch {

	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array value");
		for (int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number to search");
		int search = sc.nextInt();
		for (int j=0; j<size; j++)
		{
			if (arr[j] == search)
			{
				j = j + 1;
				System.out.println("Successful Search " + search + " found at " + j + " position ");
				System.exit(0);
			}
		}
		System.out.println("Failure!, Number Not found");
	}

}
