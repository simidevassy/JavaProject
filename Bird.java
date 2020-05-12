package com.que1;

//public abstract class Bird extends Animal {
public abstract class Bird extends Animal implements Singers{
	
	public boolean fly() {//check type specify
		System.out.println("Bird can fly");
		return false;
	}

	public abstract void sound() ;

	@Override
	public void sing() {
		System.out.println("Bird can sing");
		
	}
	
}
