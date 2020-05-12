package com.que2;

import com.que1.Bird;
import com.que1.Swimmers;

public class Duck extends Bird implements Swimmers{



	@Override
	public void sound() {
		System.out.println("Duck can sound Quack, quack");
	}

	@Override
	public boolean swim() {
		System.out.println("Duck can swim");
		return true;
		
	}
	
	@Override
	public boolean fly() {
		System.out.println("Duck can fly");
		return true;
	}
	

}
