package com.que2;

import com.que1.Bird;

public class Chicken extends Bird {

	
	
	private Rooster rooster ;
	

	
	
	public Chicken(Rooster object) {
		
		this.rooster = new Rooster();
		rooster.sound();
	}

	public Chicken() {
	}
	
	@Override
	public void sound() {
	System.out.println("Chicken can sounds Cluck, cluck");
	}

	



}
