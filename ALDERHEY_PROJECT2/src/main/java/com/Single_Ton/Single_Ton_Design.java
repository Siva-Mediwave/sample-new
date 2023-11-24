package com.Single_Ton;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Model.Appointment_Page;
import com.Page_Object_Model.PatientSignup_Page;
import com.Page_Object_Model.Resource_Page;
import com.Page_Object_Model.Resourcelib_Page;
import com.Page_Object_Model.Setpassword_Page;
import com.Page_Object_Model.Youngperson_page;

public class Single_Ton_Design {

	public WebDriver driver;
	
	private Resource_Page resourcepg;
	private Resourcelib_Page resourcelib;
	private Appointment_Page appointment;
	private Setpassword_Page setpassword;
	private Youngperson_page youngperson;
	private PatientSignup_Page patientsignup;

	public Resource_Page getResourcepg() {
		resourcepg = new Resource_Page();
		return resourcepg;
	}
	
	public Resourcelib_Page getResourcelib() {
	    resourcelib =new Resourcelib_Page();
		return resourcelib;
	}

	public Appointment_Page getAppointment() {
		appointment =new Appointment_Page();
		return appointment;
	}
	
	public Setpassword_Page getSetpassword_Page() {
		setpassword =new Setpassword_Page();
		return setpassword;
	}
	
	public Youngperson_page getYoungperson_page() {
		youngperson =new Youngperson_page();
		return youngperson;
	}
	
	public PatientSignup_Page getPatientsignup() {
		patientsignup = new PatientSignup_Page();
		return patientsignup;
	}

	
}
