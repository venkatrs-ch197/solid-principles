package com.solid.openclose;

import java.util.ArrayList;
import java.util.List;

public class CashTypeCheckoutStrategy implements CheckoutStrategy {

	@Override
	public void processCheckout(Receipt receipt) {
		double total = 0.0;
		List<Item> items = new ArrayList<>();
		items.addAll(new Item().addItems());
		for (Item item : items) {
			total += item.getPrice();
		}
		Payment p = acceptCash(total);
		receipt.addPayment(p);
	}

	private Payment acceptCash(double total) {
		Payment payment = new Payment();
		payment.setTotalAmount(total);
		return payment;
	}

}
