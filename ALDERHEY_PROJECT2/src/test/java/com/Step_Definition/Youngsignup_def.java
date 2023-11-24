package com.Step_Definition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Youngsignup_def extends Base_Class{
	public static Single_Ton_Design si = new Single_Ton_Design();
	
	@When("Launch Alderhey {string} for youngsignup")
	public void launch_alderhey_for_youngsignup(String string) throws Throwable {
		browserLaunch("chrome");
		sleep(2000);
		driver.get("https://portal-dev.alderhey.nhs.uk/");
		btnClick(si.getAppointment().geAcceptcookies());
		sleep(2000);
	   
	}
	@Then("User click on parent\\/youngperson button for youngsignup")
	public void user_click_on_parent_youngperson_button_for_youngsignup() throws Throwable {
		btnClick(si.getAppointment().getParent_youngperson());
		sleep(4000);
	}
	@Then("User click on young radio button")
	public void user_click_on_young_radio_button() throws Throwable {
		btnClick(si.getPatientsignup().getYoungperson());
		sleep(2000);
		
	  
	}
	@Then("User Enter parent's First Name")
	public void user_enter_parent_s_first_name() throws Throwable {
		String Parentsfirstname = FileReaderManager.getInstanceFRM().getInstanceCR().getParentsfirstnamel();
		System.out.println("testing");
		sleep(3000);
		enterText(si.getPatientsignup().getParentfirstname(), Parentsfirstname);
		sleep(3000);
	}
	@Then("User Enter parent's Last Name")
	public void user_enter_parent_s_last_name() throws Throwable {
		
		String Parentslastname = FileReaderManager.getInstanceFRM().getInstanceCR().getParentslastname();
		enterText(si.getPatientsignup().getParentlastname(), Parentslastname);
		sleep(3000);
	   
	}
	@Then("User Enter parent's Date of birth")
	public void user_enter_parent_s_date_of_birth() {
	    
	}
	@Then("User Enter parent's NHS no")
	public void user_enter_parent_s_nhs_no() {
	  
	}
	@Then("User Enter parent's password")
	public void user_enter_parent_s_password() throws Throwable {
		String Parentmobilenumber = FileReaderManager.getInstanceFRM().getInstanceCR().getParent_password();
		enterText(si.getPatientsignup().getPassword(), Parentmobilenumber);
		sleep(3000);
	}
	@Then("User Enter parent's confirm password")
	public void user_enter_parent_s_confirm_password() throws Throwable {
		
		String Parentconfirmpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getParent_confirmpassword();
		enterText(si.getPatientsignup().getConfirmpassword(), Parentconfirmpassword);
		sleep(4000);
	 
	}
	@Then("User click on termsandconditions and privacy statement")
	public void user_click_on_termsandconditions_and_privacy_statement() throws Throwable {
		sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='sign-up-accept-terms']/label/input[@name='termsAndCondtion']")));
			driver.findElement(By.xpath("//span[@class='checkmark']")).click();
	}
	@Then("User click on Create Account.")
	public void user_click_on_create_account() throws Throwable {
		btnClick(si.getPatientsignup().getCreateaccountbutton());
		sleep(4000);
	}
	

}
