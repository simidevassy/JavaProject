package com.que6;

import com.que1.Animal;

public abstract class Insect extends Animal{

   abstract boolean isFly();
   boolean isWalk() {
		return false;
	};
   boolean makeSound() {
	   return false;
   };


	
}
