package com.que7;

import java.lang.reflect.Method;
import java.util.Scanner;

import com.que1.Animal;
import com.que2.Chicken;
import com.que2.Duck;
import com.que2.Rooster;
import com.que3.ParrotNCat;
import com.que3.ParrotNDog;
import com.que3.ParrotNRooster;
import com.que4.Clownfish;
import com.que4.Shark;
import com.que5.Dolphins;
import com.que6.Butterfly;
import com.que6.Caterpillar;

public class CoundAnimalMethods {

	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the method name to check the count ");
	    String input = in.nextLine();
	      
	      
		Method m =  null;
        
        int i=0;
        for (Animal an : animal) {
			
        	Class<Animal> c1 = (Class<Animal>) an.getClass();
        	try {
        		
    			m = c1.getMethod(input);
    			i++;
    		} catch (NoSuchMethodException | SecurityException e) {
    			//e.printStackTrace();
    		}
            //System.out.println(m);
		}
        
        System.out.println(input+" method count is "+i);
	        
	}
	
	static Animal[] animal = new Animal[] {
			new Chicken(),
			new Duck(),
			new Rooster(),
			new ParrotNCat(),
			new ParrotNDog(),
			new ParrotNRooster(),
			new Clownfish(),
			new Shark(),
			new Dolphins(),
			new Butterfly(),
			new Caterpillar()
			
	};
	
	

}
