package com.que4;

import com.que1.Animal;
import com.que1.Swimmers;

public class Fish extends Animal implements Swimmers{

	private String name;
	private String feature;
	private String behaviour;
	
	
	public Fish(String name ,String feature,String behaviour) {
		
		this.name = name;
		this.feature = feature;
		this.behaviour = behaviour;
		
	}
	
	public Fish() {
		
	}
	

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String toString() {
		System.out.println(name +" "+feature +" and "+behaviour);
		return "";
	}

	
	/*public void feature() {
		System.out.println("Fish feature" );
	}
	
	
	public void behaviour() {
		System.out.println("Fish behaviour" );
	}
*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}
	
	
	
}
