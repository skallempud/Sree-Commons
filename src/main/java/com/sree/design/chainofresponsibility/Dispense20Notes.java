package com.sree.design.chainofresponsibility;


public class Dispense20Notes implements DispenseChain{
	
	public DispenseChain chain;

	public void setNextChain(DispenseChain chain) {
		this.chain = chain;
	}
	
	public void dispense(Integer amount){
		
		if(20 <= amount){
			int num = amount / 20;
			int remaining = amount % 20;
			System.out.println("Dispensing " + num + " 20 notes");
			if(remaining != 0){
				this.chain.dispense(new Integer(remaining));
			}
		} else {
			this.chain.dispense(new Integer(amount));
		}
	}
	
}
