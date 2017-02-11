/**
 * 
 */
package com.sree.commons.pojo;

/**
 * @author skallem
 *
 */
public class HDTVImplComparable implements Comparable<HDTVImplComparable>{

	private String productName;
	private int tvSizeInInches;
	
	public HDTVImplComparable(String productName, int tvSize){
		this.productName = productName;
		this.tvSizeInInches = tvSize;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the tvSizeInInches
	 */
	public int getTvSizeInInches() {
		return tvSizeInInches;
	}
	/**
	 * @param tvSizeInInches the tvSizeInInches to set
	 */
	public void setTvSizeInInches(int tvSizeInInches) {
		this.tvSizeInInches = tvSizeInInches;
	}
	
	public int compareTo(HDTVImplComparable tv) {
		return this.tvSizeInInches - tv.getTvSizeInInches();
	}
}
