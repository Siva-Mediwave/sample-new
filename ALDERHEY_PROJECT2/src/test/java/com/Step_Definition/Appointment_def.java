package com.Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Appointment_def  extends Base_Class{
	public static Single_Ton_Design si = new Single_Ton_Design();
 
	@When("Launch Alderhey {string}")
	public void launch_alderhey(String string)throws Throwable  {
		browserLaunch("chrome");
		sleep(2000);
		driver.get("https://portal-dev.alderhey.nhs.uk/");
		btnClick(si.getAppointment().geAcceptcookies());
		sleep(2000);
	}
	@Then("User click on parent\\/youngperson button")
	public void user_click_on_parent_youngperson_button()throws Throwable  {
		btnClick(si.getAppointment().getParent_youngperson());
		sleep(4000);
	}
	@Then("User Enter on  phone {string} Address")
	public void user_enter_on_phone_address(String string)throws Throwable  {
		String appointmentemail = FileReaderManager.getInstanceFRM().getInstanceCR().getAppointmentemail();
		enterText(si.getAppointment().getEmail(), appointmentemail);
		sleep(3000);
	}
	@Then("User Enter the password {string} Address")
	public void user_enter_the_password_address(String string) throws Throwable {
		String appointmentpasswd = FileReaderManager.getInstanceFRM().getInstanceCR().getAppointmentpass();
		enterText(si.getAppointment().getPassword(), appointmentpasswd);
		sleep(3000);
	}
	@Then("User Enter Login button")
	public void user_enter_login_button()throws Throwable  {
		btnClick(si.getAppointment().getLogin());
		sleep(4000);
	}
	@Then("User click user's health button")
	public void user_click_user_s_health_button() throws Throwable {
		btnClick(si.getAppointment().getUser_health_button());
		sleep(4000);
	}
	@Then("User click on My Appointments button")
	public void user_click_on_my_appointments_button() throws Throwable {
		btnClick(si.getAppointment().getMy_appointments());
		sleep(4000);
	}
	@Then("User click on filter by option dropdown")
	public void user_click_on_filter_by_option_dropdown()throws Throwable  {
		btnClick(si.getAppointment().getFilterbyoption());
		sleep(4000);
		driver.findElement(By.xpath("//div[@id='type']/div[2]/div/div[text()='Cancelled']")).click();
		sleep(4000);
		btnClick(si.getAppointment().getFilterbyoption());
		driver.findElement(By.xpath("//div[@id='type']/div[2]/div/div[text()='Missed']")).click();
		sleep(4000);
		btnClick(si.getAppointment().getFilterbyoption());
		driver.findElement(By.xpath("//div[@id='type']/div[2]/div/div[text()='Admission']")).click();
		sleep(4000);
		btnClick(si.getAppointment().getFilterbyoption());
		driver.findElement(By.xpath("//div[@id='type']/div[2]/div/div[text()='Upcoming']")).click();
		
		
	}



	
	
}
