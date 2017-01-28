package com.sree.design.strategy;

import java.math.BigDecimal;


/**
 * 
 * @author skallem
 *
 */
public class PaypalStrategy implements PaymentStrategy{

	private String userName;
	private String pwd;
	
	public PaypalStrategy(String userName, String pwd) {
		super();
		this.userName = userName;
		this.pwd = pwd;
	}

	public String pay(BigDecimal amount){
		
		return "Paid through paypal account";
	}

	public String getUserName() {
		return userName;
	}

	public String getPwd() {
		return pwd;
	}

}
