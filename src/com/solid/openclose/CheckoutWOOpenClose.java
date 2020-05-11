package com.solid.openclose;

import java.util.ArrayList;
import java.util.List;

public class CheckoutWOOpenClose {
	public void processCheckOut(Receipt receipt, String paymentMode) {
		double total = 0.0;
		List<Item> items = new ArrayList<>();
		items.addAll(new Item().addItems());
		for (Item item : items) {
			total += item.getPrice();
		}
		if ("Card".equalsIgnoreCase(paymentMode)) {
			Payment p = acceptCard(total);
			receipt.addPayment(p);
		} else {
			Payment p = acceptCash(total);
			receipt.addPayment(p);
		}
	}

	private Payment acceptCard(double total) {
		Payment payment = new Payment();
		payment.setTotalAmount(total);
		return payment;
	}

	private Payment acceptCash(double total) {
		Payment payment = new Payment();
		payment.setTotalAmount(total);
		return payment;
	}
}
