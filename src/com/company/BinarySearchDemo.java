package com.company;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int arr [] = {23, 12, 34, 45, 7};
		int num_search = 23;
		Arrays.sort(arr);
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		// ft: first, lt:last, md: middle
		int ft = 0;
		int lt = arr.length - 1;
		int md = (ft + lt)/2;
		while (ft <= lt)
		{
			if (arr[md] < num_search)
			{
				ft = md + 1;
			}
			else if (arr[md] == num_search) {
				System.out.println("Item found at location" +" "+ md +" "+ num_search);
				System.exit(0);
			}
			else
			{
				lt = md - 1;
			}
			md = (ft + lt)/2;
		}
		System.out.println("the search is unsuccessful, number not found");
	}
}
