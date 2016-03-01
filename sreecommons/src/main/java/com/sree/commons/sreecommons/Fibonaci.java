/**
 * 
 */
package com.sree.commons.sreecommons;

/**
 * @author skallem
 *
 */
public class Fibonaci {
	/**
	 * Return fibonaci series.
	 * 
	 * @param count
	 * @return
	 */
	public Integer[] fibonaci(int count) {
		Integer[] series = null;
		if(count <= 0){
			return series;
		}
		series = new Integer[count];
		if (count == 1) {
			series[0] = 0;
		} else {
			series[0] = 0;
			series[1] = 1;
			for (int i = 2; i < count; i++) {
				series[i] = series[i - 1] + series[i - 2];
			}
		}
		return series;
	}
}
