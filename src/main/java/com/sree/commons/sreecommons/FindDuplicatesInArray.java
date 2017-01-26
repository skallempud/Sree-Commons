/**
 * 
 */
package com.sree.commons.sreecommons;

import java.util.HashSet;
import java.util.Set;


/**
 * @author skallem
 *
 */
public class FindDuplicatesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] zipCodes = new String []{"121","313","3131","111","121"};
		System.out.println("Contains duplicate :" + containsDuplicates(zipCodes));
	}
	
	public static boolean containsDuplicates(String[] zipCodes){
		
		Set<String> zipSet = new HashSet<String>();
		for(String zipCode : zipCodes){
			if(zipSet.contains(zipCode)){
				return true;
			} else {
				zipSet.add(zipCode);
			}
		}
		return false;
	}

}
