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

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
