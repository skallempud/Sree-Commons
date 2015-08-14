/**
 * 
 */
package com.sree.commons.sreecommons;

/**
 * @author skallem
 *
 */
public class Anagram {
	/**
	 * Check if two words are anagram.
	 * 
	 * @param word
	 * @param anagram
	 * @return
	 */
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index)
						+ anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

}
