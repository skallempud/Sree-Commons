/**
 * 
 */
package com.sree.design.singleton;

/**
 * @author skallem
 *
 */
public class TestMedalfactory {

	public static void main(String[] args){
		
		Medalfactory medalfactory = new Medalfactory();
		Athlete goldWinner =  medalfactory.getMedalWinner("Sree", "com.sree.design.singleton.Gold");
		Athlete silverWinner =  medalfactory.getMedalWinner("Vasu", "com.sree.design.singleton.Silver");
		Athlete bronzeWinner =  medalfactory.getMedalWinner("Rao", "com.sree.design.singleton.Bronze");
		Athlete goldWinner2 =  medalfactory.getMedalWinner("Shiv", "com.sree.design.singleton.Gold");
		
		System.out.println("Gold winner:" + goldWinner.getAthleteName());
		System.out.println("Silver winner:" + silverWinner.getAthleteName());
		System.out.println("Bronze winner:" + bronzeWinner.getAthleteName());
		System.out.println("Gold winner:" + goldWinner2.getAthleteName());

	}
}
