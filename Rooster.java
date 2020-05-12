package com.que2;

import com.que1.Bird;

public class Rooster extends Bird {
	
	private String lang = " Cock-a-doodle-doo";
	
	public Rooster(String lang) {
		this.lang = lang;
	}
	
	public Rooster() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sound() {
	System.out.println("Rooster sounds" +lang);
	}

	
}
