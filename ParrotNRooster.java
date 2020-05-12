package com.que3;

import com.que1.Bird;
import com.que2.Rooster;

public class ParrotNRooster extends Bird {

	Rooster rooster;
	@Override
	public void sound() {
		rooster = new Rooster();
		rooster.sound();
		
	}

}
