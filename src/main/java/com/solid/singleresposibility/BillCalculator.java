package com.solid.singleresposibility;

import java.util.List;

public class BillCalculator {
	public long calculateBill(Customer customer, long tax) {
		long bill = 0;
		List<Item> listsOfItems = customer.getListsOfItems();
		for (Item item : listsOfItems) {
			bill += item.getPrice();
		}
		bill += tax;
		customer.setBill(bill);
		return bill;
	}
}
