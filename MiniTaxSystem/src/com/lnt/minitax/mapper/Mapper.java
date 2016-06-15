package com.lnt.minitax.mapper;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.lnt.dto.EmployeeDetails;
import com.lnt.dto.PersonalDetails;
import com.lnt.dto.TaxDetails;

/**
 * 
 * @author 10616421
 * 
 */

// 
public class Mapper {

	static Logger logger = Logger.getLogger("EmployeeDetailServlet.class");

	// TODO Set the attributes into the personal details and the tax details
	// object

	public static EmployeeDetails mapToDomain(HttpServletRequest request) {

		EmployeeDetails emp = new EmployeeDetails();
		logger.debug("personal Details");
		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setName(request.getParameter("name"));
		personalDetails.setPan(request.getParameter("pan"));
		personalDetails.setDob(request.getParameter("dob"));
		personalDetails.setAdress(request.getParameter("adress"));
		logger.debug("Tax Details");
		TaxDetails taxDetail = new TaxDetails();
		taxDetail.setIncome(Integer.parseInt(request.getParameter("income")));
		taxDetail.setTds(Integer.parseInt(request.getParameter("tds")));
		taxDetail.setAssesmentyear(request.getParameter("assesment"));
		taxDetail.setTax(Integer.parseInt(request.getParameter("tax")));

		emp.setPersonalDetails(personalDetails);
		emp.setTaxDetail(taxDetail);

		return emp;
	}
}
