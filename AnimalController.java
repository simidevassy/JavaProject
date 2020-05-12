package com.que9;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

public class AnimalController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String getAnimal = requestUrl.substring("/Animal/".length());
		
		Animal animal = getAnimalObj(getAnimal);
		response.getOutputStream().println(animal.toString());
	}
	
	public static Animal getAnimalObj(String name) {

		Map animalMap = new HashMap();
		animalMap.put("chicken", new Chicken());
		animalMap.put("duck", new Duck());
		animalMap.put("rooster", new Rooster());
		animalMap.put("parrotCat", new ParrotNCat());
		animalMap.put("parrotDog", new ParrotNDog());
		animalMap.put("parrotRooster", new ParrotNRooster());
		animalMap.put("clownFish", new Clownfish());
		animalMap.put("shark", new Shark());
		animalMap.put("dolphins", new Dolphins());
		animalMap.put("butterfly", new Butterfly());
		animalMap.put("caterpller", new Caterpillar());
		
		return (Animal) animalMap.get(name);

	}
}
