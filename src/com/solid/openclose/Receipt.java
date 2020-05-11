package com.solid.openclose;

import java.io.Serializable;

public class Receipt implements Serializable {
	private static final long serialVersionUID = 1L;
	private double amount;

	public Receipt() {
		super();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void addPayment(Payment p) {
		System.out.println("Payment Received : " + p.getTotalAmount());
	}
}
