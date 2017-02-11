/**
 * 
 */
package com.sree.commons.sreecommons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
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
		findDulicates(zipCodes);
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

	public static void findDulicates(String[] zipCodes){
		Map<String, Integer> zipCodeMap = new HashMap<String, Integer>();
		for(String zipCode : zipCodes){
			Integer count = zipCodeMap.get(zipCode);
			if(null == count)
			{
				zipCodeMap.put(zipCode, 1);
			} else {
				zipCodeMap.put(zipCode, ++count);
			}
		}
		
		for (Entry<String, Integer> entry : zipCodeMap.entrySet()) {
			System.out.println("Object " + entry.getKey() + " occurs " + entry.getValue() + " times.");
		}
	}
}
