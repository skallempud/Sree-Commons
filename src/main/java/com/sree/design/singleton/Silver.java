package com.sree.design.singleton;

public class Silver extends Athlete{

	private static Silver silverAthlete;
	
	private Silver(String athleteName){
		setAthleteName(athleteName);
	}
	
	public static Silver getInstance(String athleteName){
		
		if(null == silverAthlete){
			synchronized(Silver.class){
				if(null == silverAthlete){
					silverAthlete = new Silver(athleteName);
				}
			}
		}
		return silverAthlete;
	}
}
