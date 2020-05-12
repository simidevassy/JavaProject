package com.que3;

import com.que1.Bird;

public class TestParrot {

	public static void main(String[] args) {
		
		
		Bird bird = new ParrotNCat();
		bird.sound();

		Bird bird1 = new ParrotNDog();
		bird1.sound();
		
		Bird bird2 = new ParrotNRooster();
		bird2.sound();
		
		
		
		//similar to this we can create new class for the parrot which lives near a Duck
	}

}
