/**
 * 
 */
package com.sree.commons.sreecommons;

import java.util.HashMap;
import java.util.Map;

/**
 * @author skallem
 *
 */
public class StringUtils {
	/**
	 * To count occurrences of each character in a given string.
	 * @param str
	 */
	public void countCharOccurances(String str){
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i< str.length(); i++) {
			char character = str.charAt(i);
			if(!hashMap.containsKey(character)){
				hashMap.put(character, 1);
			} else{
				hashMap.put(character, hashMap.get(character) + 1);
			}
		}
		System.out.println(hashMap);
	}
	/**
	 * To reverse a string.
	 * @param str
	 * @return
	 */
	public String reverse(String str){
		char[] originArray = str.toCharArray();
		int length = str.length();
		for(int i=0; i < str.length()/2; i++){
			char temp = originArray[i];
			originArray[i] = originArray[length-1-i];
			originArray[length-1-i] = temp;			
		}
		return new String(originArray);
	}
}
