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

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
}
