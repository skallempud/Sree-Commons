/**
 * 
 */
package com.sree.commons.sreecommons;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author skallem
 *
 */
public class FibonaciTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fibonaci fibonaci = new Fibonaci();
		Integer[] series = fibonaci.fibonaci(7);
		System.out.println(ArrayUtils.toString(series));

	}

}
