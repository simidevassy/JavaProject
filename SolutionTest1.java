package com.que1.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.que1.Bird;
import com.que2.Duck;

public class SolutionTest1 {

	Bird bird = new Duck();
	@Test
    public void isDuckCanFly() {
      
		assertTrue(bird.fly());
		//here we can create assert statements to unit test
        
    }
}

