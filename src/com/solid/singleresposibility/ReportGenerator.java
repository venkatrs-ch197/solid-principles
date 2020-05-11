package com.solid.singleresposibility;

public class ReportGenerator {
	public void generateReport(Customer customer, String reportType) {
		// Extract data from customer object and generate the report
		if (reportType.equalsIgnoreCase("CSV")) {
			System.out.println("Generate CSV report");
		}
		if (reportType.equalsIgnoreCase("XML")) {
			System.out.println("Generate XML report");
		}
	}
}
