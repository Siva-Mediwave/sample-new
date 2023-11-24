package com.Step_Definition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addnewyoungperson_def extends Base_Class {

	public static Single_Ton_Design si = new Single_Ton_Design();

	@When("Launch Alderhey {string} for addnewyoungperson")
	public void launch_alderhey_for_addnewyoungperson(String string) throws Throwable {
		browserLaunch("chrome");
		sleep(2000);
		driver.get("https://portal-dev.alderhey.nhs.uk/");
		btnClick(si.getAppointment().geAcceptcookies());
		sleep(2000);
	}

	@Then("User click on parent\\/youngperson button for addnewyoungperson")
	public void user_click_on_parent_youngperson_button_for_addnewyoungperson() throws Throwable {
		btnClick(si.getAppointment().getParent_youngperson());
		sleep(4000);

	}

	@Then("User Enter on  phone {string} Address for addnewyoungperson")
	public void user_enter_on_phone_address_for_addnewyoungperson(String string) throws Throwable {
		String appointmentemail = FileReaderManager.getInstanceFRM().getInstanceCR().getAppointmentemail();
		enterText(si.getAppointment().getEmail(), appointmentemail);
		sleep(3000);
	}

	@Then("User Enter the password {string} Address for addnewyoungperson")
	public void user_enter_the_password_address_for_addnewyoungperson(String string) throws Throwable {
		String appointmentpasswd = FileReaderManager.getInstanceFRM().getInstanceCR().getAppointmentpass();
		enterText(si.getAppointment().getPassword(), appointmentpasswd);
		sleep(4000);
	}

	@Then("User Enter Login button for addnewyoungperson")
	public void user_enter_login_button_for_addnewyoungperson() throws Throwable {
		btnClick(si.getAppointment().getLogin());
		sleep(5000);

		String no1 = FileReaderManager.getInstanceFRM().getInstanceCR().getotp1();
		enterText(si.getPatientsignup().getOtp1(), no1);

		String no2 = FileReaderManager.getInstanceFRM().getInstanceCR().getotp2();
		enterText(si.getPatientsignup().getOtp2(), no2);

		String no3 = FileReaderManager.getInstanceFRM().getInstanceCR().getotp3();
		enterText(si.getPatientsignup().getOtp3(), no3);

		String no4 = FileReaderManager.getInstanceFRM().getInstanceCR().getotp4();
		enterText(si.getPatientsignup().getOtp4(), no4);

		String no5 = FileReaderManager.getInstanceFRM().getInstanceCR().getotp5();
		enterText(si.getPatientsignup().getOtp5(), no5);
		sleep(6000);
		
		String no6 = FileReaderManager.getInstanceFRM().getInstanceCR().getotp6();
		enterText(si.getPatientsignup().getOtp6(), no6);

		sleep(3000);

		btnClick(si.getPatientsignup().getVerify());
		sleep(4000);
	}

	@Then("User Click on Add a new child\\/young person")
	public void user_click_on_add_a_new_child_young_person() throws Throwable {
		sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		btnClick(si.getYoungperson_page().getAddnewchildYoung_person());
		sleep(4000);
	}

	@Then("User Enter young person first name")
	public void user_enter_young_person_first_name() throws Throwable {
		enterText(si.getYoungperson_page().getYoungpersonfirstname(), "Test");
		sleep(3000);
	}

	@Then("User Enter young person last name")
	public void user_enter_young_person_last_name() throws Throwable {
		enterText(si.getYoungperson_page().getYoungpersonlasttname(), "Test");
		sleep(3000);
	}

	@Then("User Enter young person date of birth")
	public void user_enter_young_person_date_of_birth() throws Throwable {
		btnClick(si.getYoungperson_page().getYoungpersondateofbirth());
		sleep(2000);
		btnClick(si.getYoungperson_page().getSelectmonth());
		sleep(1500);
		btnClick(si.getYoungperson_page().getMarch());
		sleep(1000);
		btnClick(si.getYoungperson_page().getSelectyear());
		sleep(1500);
		btnClick(si.getYoungperson_page().getYear());
		sleep(1000);
		btnClick(si.getYoungperson_page().getMarch20());
		sleep(3000);
	}

	@Then("User Enter young person NHS Number")
	public void user_enter_young_person_nhs_number() throws Throwable {
		enterText(si.getYoungperson_page().getYoungpersonNHSnumber(), "AH11111111");
		sleep(3000);
	}

	@Then("User click on Submit access request button")
	public void user_click_on_submit_access_request_button() throws Throwable {
		btnClick(si.getYoungperson_page().getSubmitaccessrequest());
		sleep(4000);
	}
}
