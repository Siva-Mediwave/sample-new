package com.Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parentsignup_def extends Base_Class{

	
	public static Single_Ton_Design si = new Single_Ton_Design();
	@When("Launch Alderhey {string} for Parentsignup")
	public void launch_alderhey_for_parentsignup(String string)throws Throwable {
		browserLaunch("chrome");
		sleep(2000);
		driver.get("https://portal-dev.alderhey.nhs.uk/");
		btnClick(si.getAppointment().geAcceptcookies());
		sleep(2000);
	}
	@Then("User click on parent\\/youngperson button for Parentsignup")
	public void user_click_on_parent_youngperson_button_for_parentsignup()throws Throwable {
		btnClick(si.getAppointment().getParent_youngperson());
		sleep(4000);
	}
	@Then("User click on Parent radio button")
	public void user_click_on_parent_radio_button() throws Throwable{
		btnClick(si.getPatientsignup().getSignup());
		sleep(3000);
	}
	@Then("User Enter parent's first name")
	public void user_enter_parent_s_first_name()throws Throwable {
		String Parentsfirstname = FileReaderManager.getInstanceFRM().getInstanceCR().getParentsfirstnamel();
		System.out.println("testing");
		sleep(3000);
		enterText(si.getPatientsignup().getParentfirstname(), Parentsfirstname);
		sleep(3000);
	}
	@Then("User Enter parent's last name")
	public void user_enter_parent_s_last_name() throws Throwable{
		String Parentslastname = FileReaderManager.getInstanceFRM().getInstanceCR().getParentslastname();
		enterText(si.getPatientsignup().getParentlastname(), Parentslastname);
		sleep(3000);
	}
	@Then("User Enter parent's Email name")
	public void user_enter_parent_s_email_name()throws Throwable {
		String Parentsemail = FileReaderManager.getInstanceFRM().getInstanceCR().getParentsemail();
		enterText(si.getPatientsignup().getParentEmail(), Parentsemail);
		sleep(3000);
	}
	@Then("User Enter parent's Mobilenumber")
	public void user_enter_parent_s_mobilenumber() throws Throwable{
		String Parentmobilenumber = FileReaderManager.getInstanceFRM().getInstanceCR().getParent_mobilenumber();
		enterText(si.getPatientsignup().getMobilenumber(), Parentmobilenumber);
		sleep(3000);
	}
	@Then("User Enter parent's Password")
	public void user_enter_parent_s_password() throws Throwable{
		String Parentmobilenumber = FileReaderManager.getInstanceFRM().getInstanceCR().getParent_password();
		enterText(si.getPatientsignup().getPassword(), Parentmobilenumber);
		sleep(3000);
	}
	@Then("User Enter parent's Confirm password")
	public void user_enter_parent_s_confirm_password() throws Throwable{
		String Parentconfirmpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getParent_confirmpassword();
		enterText(si.getPatientsignup().getConfirmpassword(), Parentconfirmpassword);
		sleep(4000);
	}
	@Then("User click on Termsandconditions and Privacy statement")
	public void user_click_on_termsandconditions_and_privacy_statement() throws Throwable{
		//btnClick(si.getPatientsignup().getTermsandcondition());
		//sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='sign-up-accept-terms']/label/input[@name='termsAndCondtion']")));
		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
	}
	
	@Then("User click on create account.")
	public void user_click_on_create_account() throws Throwable{
		btnClick(si.getPatientsignup().getCreateaccountbutton());
		sleep(4000);
	}

}
