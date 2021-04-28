package com.company;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements of the array");

		//array is Initialized
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		//sorting array using bubble sort
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

				}
			}
		}
		System.out.println("Sorted array is ");
		for (int i:arr) System.out.print(i + " ");
	}
}
