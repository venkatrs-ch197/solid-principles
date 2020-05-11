package com.solid.singleresposibility;

public class SingleResponsibity {

	public static void main(String[] args) {
		
		// Without Single Responsibility
		com.solid.singleresposibility.CustomerWOSingleResponsibity customerWOSingleResponsibity = new com.solid.singleresposibility.CustomerWOSingleResponsibity("Venkat", 30);
		customerWOSingleResponsibity.setListsOfItems(new Item().addItems());
		System.out.println("Bill without Single Responsibility:" + customerWOSingleResponsibity.calculateBill(20));
		customerWOSingleResponsibity.generateReport("CSV");
		
		// With Single Responsibility
		Customer customer = new Customer("Venkat", 30);
		customer.setListsOfItems(new Item().addItems());
		
		BillCalculator billCalculator = new BillCalculator();
		System.out.println("Bill with Single Responsibility:" + billCalculator.calculateBill(customer, 20));
		
		ReportGenerator reportGenerator = new ReportGenerator();
		reportGenerator.generateReport(customer, "CSV");
	}
}
