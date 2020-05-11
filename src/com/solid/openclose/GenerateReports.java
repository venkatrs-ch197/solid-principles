package com.solid.openclose;

public class GenerateReports {
	public void generateReportBasedOnType(String reportType) {
		System.out.println("===================================");
		System.out.println("Generating report based on Type");
		System.out.println("===================================");

		if ("CSV".equalsIgnoreCase(reportType)) {
			generateCSVReport();
		} else if ("XML".equalsIgnoreCase(reportType)) {
			generateXMLReport();
		}
	}

	private void generateCSVReport() {
		System.out.println("Generate CSV Report");
	}

	private void generateXMLReport() {
		System.out.println("Generate XML Report");
	}
}
