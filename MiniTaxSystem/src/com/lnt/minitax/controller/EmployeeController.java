package com.lnt.minitax.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.lnt.dto.EmployeeDetails;
import com.lnt.minitax.mapper.Mapper;
import com.lnt.minitax.util.XmlConverter;

/**
 * Employee Controller is controller which gets data from view and save it in
 * xml file for manipulation.
 * @author 10616421
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger("EmployeeDetailServlet.class");

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		logger.info("Employee Object");
		EmployeeDetails emp = Mapper.mapToDomain(request);

		logger.info("Jsp Output Dislay");
		request.getRequestDispatcher("/output.jsp").forward(request, response);

		logger.warn("Xml COnversion taking place");
		try {
			// Convert Employee details object to XML
			XmlConverter.generateXml(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 logger.error("Xml File not generated");
			System.out.println(" Not able to convert in XML FIle"
					+ e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * @param title
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response, String title)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initialising log4j");
		String log4jLocation = config
				.getInitParameter("log4j-properties-location");

		ServletContext sc = config.getServletContext();

		if (log4jLocation == null) {
			System.out.println("No log4j properites...");
			BasicConfigurator.configure();
		} else {
			String webAppPath = sc.getRealPath("/");
			String log4jProp = webAppPath + log4jLocation;
			File output = new File(log4jProp);
			System.out.println("path" + output);
			if (output.exists()) {
				System.out.println("Initialising log4j with: " + log4jProp);
				PropertyConfigurator.configure(log4jProp);
			} else {
				System.out.println("Find not found (" + log4jProp + ").");
				BasicConfigurator.configure();
			}
		}

		super.init(config);
	}
//TODO Junit test Cases
}
