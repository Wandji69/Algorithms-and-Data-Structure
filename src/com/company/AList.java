package com.company;

import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Cameroon");
		list.add("Douala");
		list.add("Buea");

		System.out.println(list);
		list.add("Yaounde");
		System.out.println(list);
	}

}
