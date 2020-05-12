package com.que5;

import com.que1.Animal;
import com.que1.Swimmers;

public class Dolphins extends Animal implements Swimmers{

	@Override
	public boolean swim() {
		System.out.println("Dolphins can swim");
		return true;	
	}
	
	public Dolphins() {
		
	}

}
