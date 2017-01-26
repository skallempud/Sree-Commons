package com.sree.design.singleton;

import java.lang.reflect.Method;

public class Medalfactory {

	public Athlete getMedalWinner(String athleteName, String medalType){
		
		try {
			//Using reflection to create object factory
			Class[] athleteParameter = new Class[]{String.class};
			Method getInstanceMethod = Class.forName(medalType).getMethod("getInstance", athleteParameter);
			Object[] params = new Object[]{new String(athleteName)};
			return (Athlete)getInstanceMethod.invoke(null, params);
			
		} catch (Exception e) { 
			throw new IllegalArgumentException("Invalid Athlete type.");
		}
	}
}
