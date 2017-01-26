package com.sree.design.singleton;

public class Gold extends Athlete{
	
	private static Gold goldAthlete;

	private Gold(String athleteName){
		setAthleteName(athleteName);
	}
	
	public static Gold getInstance(String athleteName){
		
		if(null == goldAthlete){
			synchronized(Gold.class){
				if(null == goldAthlete){
					goldAthlete = new Gold(athleteName);
				}
			}
		}
		return goldAthlete;
	}
	
}
