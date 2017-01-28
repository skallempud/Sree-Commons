package com.sree.design.strategy;

import java.math.BigDecimal;

/**
 * 
 * @author skallem
 *
 */
public class Item {

	private String upcCode;
	private BigDecimal amount;
	
	public Item(String upcCode, BigDecimal amount){
		this.upcCode = upcCode;
		this.amount = amount;
	}
	/**
	 * @return the upcCode
	 */
	public String getUpcCode() {
		return upcCode;
	}
	/**
	 * @param upcCode the upcCode to set
	 */
	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
