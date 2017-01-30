package com.sree.design.chainofresponsibility;


public interface DispenseChain {

	public void setNextChain(DispenseChain chain);
	public void dispense(Integer amount);
}
