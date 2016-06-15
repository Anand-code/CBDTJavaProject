package com.lnt.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author 10616421
 * @see PersonalDetails
 * @see TaxDetails
 * 
 */
@XmlRootElement
public class EmployeeDetails {

	PersonalDetails personalDetails;

	TaxDetails taxDetail;

	public EmployeeDetails() {
		super();
		
	}

	public EmployeeDetails(PersonalDetails personalDetails, TaxDetails taxDetail) {
		super();
		this.personalDetails = personalDetails;
		this.taxDetail = taxDetail;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public TaxDetails getTaxDetail() {
		return taxDetail;
	}

	public void setTaxDetail(TaxDetails taxDetail) {
		this.taxDetail = taxDetail;
	}
}
