/**
 * 
 */
package com.sree.commons.sreecommons;

/**
 * @author skallem
 *
 */
public class StringUtilsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testCountOfCharacterOccurance();
		testStringReverse();
		contains();
		uniqueChars();
	}

	private static void uniqueChars(){
		StringUtils strUtil = new StringUtils();
		String word = "Apple";
		System.out.println("Unique chars in word " + word + " " + strUtil.charsUnique(word));
		word = "OArange";
		System.out.println("Unique chars in word " + word + " " + strUtil.charsUnique(word));
	}
	
	private static void testCountOfCharacterOccurance() {
		StringUtils strUtil = new StringUtils();
		String str = "Hello world";
		strUtil.countCharOccurances(str);
	}
	
	private static void testStringReverse(){
		StringUtils strUtil = new StringUtils();
		String str = "Hello world";
		System.out.println(strUtil.reverse(str));
	}
	
	
	private static void contains(){
		StringUtils strUtil = new StringUtils();
		String fullString = "Orange";
		String subString = "ran";
		System.out.println(fullString + " contains " + subString + " " + strUtil.contains(fullString, subString));
		fullString = "Orange";
		subString = "ora";
		System.out.println(fullString + " contains " + subString + " " + strUtil.contains(fullString, subString));
	}
}
