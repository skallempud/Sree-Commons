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
	

}
