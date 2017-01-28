package com.sree.design.strategy;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author skallem
 *
 */
public class CreditCardStrategy implements PaymentStrategy{

	private String cardNum;
	private String cvv;
	private Date expiry;
	
	
	public CreditCardStrategy(String cardNum, String cvv, Date expiry) {
		super();
		this.cardNum = cardNum;
		this.cvv = cvv;
		this.expiry = expiry;
	}

	public String pay(BigDecimal amount){
		return "Paid through Creditcard";
	}

	public String getCardNum() {
		return cardNum;
	}


	public String getCvv() {
		return cvv;
	}

	public Date getExpiry() {
		return expiry;
	}

}
