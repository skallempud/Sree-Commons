package com.sree.design.chainofresponsibility;


public class Dispense50Notes implements DispenseChain{
	
	public DispenseChain chain;

	public void setNextChain(DispenseChain chain) {
		this.chain = chain;
	}
	
	public void dispense(Integer amount){
		
		if(50 <= amount){
			int num = amount / 50;
			int remaining = amount % 50;
			System.out.println("Dispensing " + num + " 50 notes");
			if(remaining != 0){
				this.chain.dispense(new Integer(remaining));
			}
		} else {
			this.chain.dispense(new Integer(amount));
		}
	}
	
}
