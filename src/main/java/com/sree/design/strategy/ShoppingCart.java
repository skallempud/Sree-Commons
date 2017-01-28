/**
 * 
 */
package com.sree.design.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author skallem
 *
 */
public class ShoppingCart {

	private List<Item> items;
	
	public ShoppingCart(){
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public BigDecimal calculateTotal(){
		BigDecimal sum = new BigDecimal(0);
		for(Item item : this.items){
			sum = sum.add(item.getAmount());
		}
		return sum;
	} 
	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String chargeCustomer(PaymentStrategy paymentStrategy){
		return paymentStrategy.pay(calculateTotal());
	}
}
