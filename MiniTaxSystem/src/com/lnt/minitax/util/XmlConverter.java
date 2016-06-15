package com.lnt.minitax.util;

import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.lnt.dto.EmployeeDetails;

/**
 * XmlConverter is utility class having method to convert into xml format 
 * @author 10616421
 *
 */
public class XmlConverter {
		
	/**
	 * This method generates XML file for provided Employee Details 
	 * @param EmployeeDetails
	 * @throws Exception
	 */	
	
	public static void generateXml(EmployeeDetails emp) throws Exception {		

		try {
			
		
			JAXBContext context = JAXBContext
					.newInstance(EmployeeDetails.class);

			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(emp, System.out);
			OutputStream newFile = new FileOutputStream("D://"
					+ emp.getPersonalDetails().getName() + "_"
					+ emp.getPersonalDetails().getPan() + ".xml");
			// boolean isCreated = newFile.createNewFile();
			m.marshal(emp, newFile);

		} catch (JAXBException e) {
			e.printStackTrace();
			throw new Exception("Unable to to convert to xml");
			
		}

	}

}
