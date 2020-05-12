package com.que8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.que1.Bird;
import com.que2.Rooster;


public class LanguageDemo {

	
	public static void main(String[] args) {
		LanguageDemo demo = new LanguageDemo();
		
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the language for Rooster");
	    String lang = in.nextLine();
	    
		String result = demo.getSoundByLang(lang);
		
		Bird bird =  new Rooster(result);
		bird.sound();
		System.out.println("end");
	}

	public  String getSoundByLang(String lang) {
		
		String result = "";
		Map<String, String> langMap = new HashMap<String, String>(); 
		langMap.put("Danish", "kykyliky");
		langMap.put("Dutch", "kukeleku");
		langMap.put("Finnish", "kukko kiekuu");
		langMap.put("French", "cocorico");
		langMap.put("German", "kikeriki");
		langMap.put("Greek", "kikiriki");
		langMap.put("Hebrew", "coo-koo-ri-koo");
		langMap.put("Hungarian", "kukuriku");
		langMap.put("Italian", "chicchirichi");
		langMap.put("Japanese", "ko-ke-kok-ko-o");
		langMap.put("Portuguese", "cucurucu");
		langMap.put("Russian", "kukareku");
		langMap.put("Swedish", "kuckeliku");
		langMap.put("Turkish", "kuk-kurri-kuuu");
		langMap.put("Urdu", "kuklooku");
		
		result = langMap.get(lang);
		
		
		return result;
		
	}
	
	
}
