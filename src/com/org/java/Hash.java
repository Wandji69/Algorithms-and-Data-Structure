package com.company;

import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Cameroon", "Douala");
		map.put("South-West", "Buea");
		map.put("East", "Yaounde");
		System.out.println(map);

		map.put("Buea", "molyko");
		System.out.println(map);

		String cap = map.get("South-West");
		System.out.println("The capital of South-West is " + cap);

		String rm = map.remove("Cameroon");
		System.out.println(new StringBuilder().append("this key has been remove ").append(rm).toString());
	}

}
