package com.Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Password_def  extends Base_Class {
	public static Single_Ton_Design si = new Single_Ton_Design();

	
	///////
	@Given("Launch  {string} on browser for account_password")
	public void launch_on_browser_for_account_password(String string) throws Throwable{
		browserLaunch("chrome");
		sleep(2000);
		driver.get("https://portal-dev.alderhey.nhs.uk/");
		btnClick(si.getAppointment().geAcceptcookies());
		sleep(2000);
	}
	@When("User click the patient\\/young_person login button for account_password")
	public void user_click_the_patient_young_person_login_button_for_account_password()throws Throwable {
		btnClick(si.getAppointment().getParent_youngperson());
		sleep(4000);
	}
	@Then("User Enter Phone or {string} address for account_password")
	public void user_enter_phone_or_address_for_account_password(String string)throws Throwable {
		String appointmentemail = FileReaderManager.getInstanceFRM().getInstanceCR().getAppointmentemail();
		enterText(si.getAppointment().getEmail(), appointmentemail);
		sleep(3000);
	}
	@Then("User Enter {string} address for account_password")
	public void user_enter_address_for_account_password(String string)throws Throwable {
		String appointmentpasswd = FileReaderManager.getInstanceFRM().getInstanceCR().getAppointmentpass();
		enterText(si.getAppointment().getPassword(), appointmentpasswd);
		sleep(3000);
	}
	@Then("User click on Login button for account_password")
	public void user_click_on_login_button_for_account_password() throws Throwable{
		btnClick(si.getAppointment().getLogin());
		sleep(4000);
	}

	
	/////////////////
	@Then("User click on profile icon")
	public void user_click_on_profile_icon() throws Throwable  {
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,-250)");
		//btnClick(si.getSetpassword_Page().getUserprofileicon());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='BJ']"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
	}
	@Then("User click on Account button")
	public void user_click_on_account_button()throws Throwable  {
		btnClick(si.getSetpassword_Page().getAccountbutton());
		sleep(4000);
	}
	@Then("User Enter on old password")
	public void user_enter_on_old_password()throws Throwable  {
		enterText(si.getSetpassword_Page().getOldpassword(), "Test@123");
		sleep(3000);
	}
	@Then("User Enter on new password")
	public void user_enter_on_new_password() throws Throwable {
		enterText(si.getSetpassword_Page().getNewpassword(), "Test@1234");
		sleep(3000);
	}
	@Then("User Enter on confirm password")
	public void user_enter_on_confirm_password()throws Throwable  {
		enterText(si.getSetpassword_Page().getConfirmpassword(), "Test@1234");
		sleep(3000);
	}
	@Then("User click on save button")
	public void user_click_on_save_button() throws Throwable {
		btnClick(si.getSetpassword_Page().getSavebutton());
		sleep(4000);
	}

}
