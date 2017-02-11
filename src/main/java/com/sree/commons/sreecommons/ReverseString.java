package com.sree.commons.sreecommons;

public class ReverseString {

	public static void main(String[] args){
	
		String test = "abcdefgh";
		System.out.println("String to be reversed:" + test);
		System.out.println("Reversed string using string builder:" + reverseUsingStringBuilder(test));
		System.out.println("Reversed string using recursive:" + reverseRecursively(test));
	}
	
	private static String reverseUsingStringBuilder(String test){
		
		String reversed = new StringBuilder(test).reverse().toString();
		return reversed;
	}
	
	private static String reverseRecursively(String test){
		
		if(test.length() < 2){
			return test;
		}
		
		return reverseRecursively(test.substring(1)) + test.charAt(0);
	}
}
