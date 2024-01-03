package com.org.java;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class WordCount {
	
	public static void main(String[] args) throws Exception {
		File file = new File("pg98.txt");
		Scanner fScanner = new Scanner(file);
		
		char[] vowels  = {'a', 'e', 'i', 'o', 'u'};
		
		int words = 0;
		int cons = 0;
		int numberVowels = 0;
		
		while (fScanner.hasNextLine()) {
			String line = fScanner.nextLine();
			
			words += line.split(" ").length;
			
			for (int i = 0; i<line.length(); i++){
				char ch = line.charAt(i);
				if (contains(vowels, ch)){
					numberVowels ++;
				} else
					cons++;
			}
			
		}
		System.out.println("The file contains " + words + " words.");
		System.out.println("The file contains " + numberVowels + " number of vowels.");
		System.out.println("The file contains " + cons + " number of consonants.");
		
	}
	
	private static boolean contains(char[] array, char ch) {
		for (char c : array) {
			if (c == ch) {
				return true;
			}
		}
		return false;
	}
}
