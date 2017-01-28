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
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

}
