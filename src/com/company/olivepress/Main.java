package com.company.olivepress;

import com.company.olives.Olive;
import com.company.press.OlivePress;

public class Main {

	public static void main(String[] args) {
		Olive[] olives = {new Olive(), new Olive(), new Olive()};
		OlivePress press = new OlivePress();
		press.getOlives(olives);
	}

}
