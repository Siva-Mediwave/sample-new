package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configure_Reader {
	public static Properties proper;

	public Configure_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Mediwave Digital\\Downloads\\Alder_proj\\Alderhey project\\src\\main\\java\\com\\Configuration_Properties\\Configuration.properties");
		FileInputStream fi = new FileInputStream(f);

		proper = new Properties();
		proper.load(fi);

	}

	public String geturl() {

		String property = proper.getProperty("url");
		return property;

	}

	public String getExternalemail() {

		String property = proper.getProperty("Externalemail");
		return property;

	}

	public String getExternalpass() {

		String property = proper.getProperty("Externalpass");
		return property;

	}

	public String getTitle() {

		String property = proper.getProperty("Title");
		return property;

	}
	

	public String getType() {

		String property = proper.getProperty("Type");
		return property;

	}
	
	public String getAge() {

		String property = proper.getProperty("Age");
		return property;

	}
	/////
	public String getAppointmentemail() {

		String property = proper.getProperty("Appointmentemail");
		return property;

	}
	public String getAppointmentpass() {

		String property = proper.getProperty("Appointmentpass");
		return property;

	}
	/////
	public String getParentsfirstnamel() {

		String property = proper.getProperty("Parent's_firstname");
		return property;

	}
	public String getParentslastname() {

		String property = proper.getProperty("Parent's_lastname");
		return property;

	}
	public String getParentsemail() {

		String property = proper.getProperty("Parent's_email");
		return property;

	}
	public String getParent_mobilenumber() {

		String property = proper.getProperty("Parent_mobilenumber");
		return property;

	}
	public String getParent_password() {

		String property = proper.getProperty("Parent_password");
		return property;

	}
	public String getParent_confirmpassword() {

		String property = proper.getProperty("Parent_confirmpassword");
		return property;

	}
	
	public String getotp1() {

		String property = proper.getProperty("otp1");
		return property;

	}
	
	public String getotp2() {

		String property = proper.getProperty("otp2");
		return property;

	}
	
	public String getotp3() {

		String property = proper.getProperty("otp3");
		return property;

	}
	
	public String getotp4() {

		String property = proper.getProperty("otp4");
		return property;

	}
	
	public String getotp5() {

		String property = proper.getProperty("otp5");
		return property;

	}
	
	public String getotp6() {

		String property = proper.getProperty("otp6");
		return property;

	}
	
}