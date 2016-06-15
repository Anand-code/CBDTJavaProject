package com.lnt.dto;

/**
 * 
 * @author 10616421
 * @see EmployeeDetails
 * @see PersonalDetails
 */
public class TaxDetails {

	
	private int income;

	private int tds;

	private String assesmentyear;

	private int tax;

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getTds() {
		return tds;
	}

	public void setTds(int tds) {
		this.tds = tds;
	}

	public String getAssesmentyear() {
		return assesmentyear;
	}

	public void setAssesmentyear(String assesmentyear) {
		this.assesmentyear = assesmentyear;
	}

}
