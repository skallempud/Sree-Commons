/**
 * 
 */
package com.sree.design.strategy;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author skallem
 *
 */
public class ShoppingCartTest {

	public static void main(String[] srgs){
		Item item1 = new Item("3123", new BigDecimal(10));
		Item item2 = new Item("4123", new BigDecimal(12));

		
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(item1);
		cart.addItem(item2);
		
		CreditCardStrategy strategy = new CreditCardStrategy("5328098319092", "128", new Date());
		
		
		String response = cart.chargeCustomer(strategy);
		System.out.println("Customer " + response);
		
		PaypalStrategy payStrategy = new PaypalStrategy("test@gmail.com", "passcode");
		String payResponse = cart.chargeCustomer(payStrategy);
		System.out.println("Customer " + payResponse);
	}
}
