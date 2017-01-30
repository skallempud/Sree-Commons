package com.sree.design.chainofresponsibility;

import java.util.Scanner;

public class ATMDispenseMachine {

	public DispenseChain chain;
	
	private ATMDispenseMachine(){
		DispenseChain fiftyDispenser = new Dispense50Notes();
		DispenseChain twentyDispenser = new Dispense20Notes();
		DispenseChain tenDispenser = new Dispense10Notes();

		this.chain = fiftyDispenser;
		this.chain.setNextChain(twentyDispenser);
		twentyDispenser.setNextChain(tenDispenser);
	}
	
	public static void main(String[] args){
		ATMDispenseMachine dispenseMachine = new ATMDispenseMachine();
		
		while(true){
			
			Integer amount = 0;
			System.out.println("Enter amount to be dispensed");
			Scanner scanner = new Scanner(System.in);
			amount = scanner.nextInt();
			if( amount % 10 != 0){
				System.out.println("Enter amount that is multiples of 10");
				return;
			}
			dispenseMachine.chain.dispense(new Integer(amount));
		}
	}
}
