package com.que4;

import com.que1.Animal;

public class TestFish {

	public static void main(String args[]) {
		
	Fish clownfish = new Clownfish("ClownFish", "are small and colourful (orange)", "make jokes");
		
	Fish shark = new Shark("Shark", "is large and grey", "eat other fish");	
	
	
	System.out.println(clownfish.toString());
	
	System.out.println(shark.toString());
	
	}
}
