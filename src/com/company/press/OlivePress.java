package com.company.press;

import com.company.olives.Olive;

public class OlivePress {
	public void getOlives(Olive[] olives) {
		for (Olive olive : olives) {
			olive.crush();
		}
	}

}
