/**
 * 
 */
package com.sree.design.strategy;

import java.math.BigDecimal;

/**
 * @author skallem
 *
 */
public interface PaymentStrategy {

	public String pay(BigDecimal money);
}
