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
	/**
	 * Ex: Find if "orange" contains "ran"
	 * @param fullString
	 * @param subString
	 * @return
	 */
	public boolean contains(String fullString, String subString){
		boolean contains = false;
		if(null == fullString || null == subString || (fullString.length() < subString.length())){
			return false;
		}
		char[] fullChar = fullString.toCharArray();
		char[] subChar = subString.toCharArray();
		int counter = 0;
		for(int i=0; i < fullChar.length; i++){
			
			if(fullChar[i] == subChar[counter]){
				counter++;
			} else{
				counter = 0;
			}
			if(counter == subChar.length){
				contains = true;
				return contains;
			}
		}
		return contains;
	}
	
	public boolean charsUnique(String word){
		
		boolean[] booleanArray = new boolean[256];
		for(int i=0; i < word.length(); i++){
			int ascii = word.charAt(i);
			if(booleanArray[ascii]){
				return false;
			} else {
				booleanArray[ascii] = true;
			}
		}
		return true;
	}
}
