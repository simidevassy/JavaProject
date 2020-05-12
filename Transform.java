package com.que6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Transform {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		DateFormat dateFormat = null;
		String fromDate = null;

		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

		c.add(Calendar.DAY_OF_MONTH, 5);

		String toDate = dateFormat.format(c.getTime()); // To do : run after 5 days

		Runnable task = new Runnable() {
			public void run() {
				Transform transform = new Transform();
				Insect insect = new Caterpillar();
				transform.getInsectProprty(insect);//Caterpiller first time//after 5 days will call butterfly
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				String fromDate = dateFormat.format("11/05/2020");
				try {
					c.setTime(dateFormat.parse(fromDate));
					if (toDate.compareTo(fromDate) == 0) {//after 5 days from 11/05/2020
						insect = transformToButtrFly(); // call butter fly method
					}

				} catch (ParseException e) {
					e.printStackTrace();
				}

			}
		};

		scheduler.schedule(task, 5, TimeUnit.DAYS);
		scheduler.shutdown();

	}
	private static Insect transformToButtrFly() {
		
		return new Butterfly();

	}
	
	
	private void getInsectProprty(Insect insect) {
		
		insect.isFly();
		insect.isWalk();
		insect.makeSound();
	}
	
	
}
