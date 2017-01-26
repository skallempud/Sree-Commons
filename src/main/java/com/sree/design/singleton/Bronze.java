package com.sree.design.singleton;

public class Bronze extends Athlete{

	private static Bronze bronzeAthlete;
	
	private Bronze(String athleteName){
		setAthleteName(athleteName);
	}
	
	public static Bronze getInstance(String athleteName){
		if(null == bronzeAthlete){
			synchronized(Bronze.class){
				if(null == bronzeAthlete){
					bronzeAthlete = new Bronze(athleteName);
				}
			}
		}
		return bronzeAthlete;
	}
}
