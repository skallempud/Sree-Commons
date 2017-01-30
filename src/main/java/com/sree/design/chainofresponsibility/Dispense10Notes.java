package com.sree.design.chainofresponsibility;


public class Dispense10Notes implements DispenseChain{
	
	public DispenseChain chain;

	public void setNextChain(DispenseChain chain) {
		this.chain = chain;
	}
	
	public void dispense(Integer amount){
		
		if(10 <= amount){
			int num = amount / 10;
			int remaining = amount % 10;
			System.out.println("Dispensing " + num + " 10 notes");
			if(remaining != 0){
				this.chain.dispense(new Integer(remaining));
			}
		} else {
			this.chain.dispense(new Integer(amount));
		}
	}
	
}
