package com.Step_Definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given.Givens;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.When;

public class Resourcelib_def extends Base_Class {

	public static Single_Ton_Design si = new Single_Ton_Design(); 
	

@Given("Launch  {string} on browser")
public void launch_on_browser(String string) throws Throwable {
	browserLaunch("chrome");
	sleep(2000);
	driver.get("https://portal-dev.alderhey.nhs.uk/");
	btnClick(si.getAppointment().geAcceptcookies());
	sleep(2000);
}
@When("User click the patient\\/young_person login button")
public void user_click_the_patient_young_person_login_button() throws Throwable {
	btnClick(si.getAppointment().getParent_youngperson());
	sleep(4000);
}
@Then("User Enter Phone or {string} address")
public void user_enter_phone_or_address(String string)throws Throwable  {
	String appointmentemail = FileReaderManager.getInstanceFRM().getInstanceCR().getAppointmentemail();
	enterText(si.getAppointment().getEmail(), appointmentemail);
	sleep(3000);
}
@Then("User Enter {string} address")
public void user_enter_address(String string)throws Throwable  {
	String appointmentpasswd = FileReaderManager.getInstanceFRM().getInstanceCR().getAppointmentpass();
	enterText(si.getAppointment().getPassword(), appointmentpasswd);
	sleep(3000);
}
@Then("User click on Login button")
public void user_click_on_login_button()throws Throwable  {
	btnClick(si.getAppointment().getLogin());
	sleep(4000);
}
@Then("User click on User's health button")
public void user_click_on_user_s_health_button() throws Throwable {
	btnClick(si.getAppointment().getUser_health_button());
	sleep(4000);
}
@Then("User click on Resource library button")
public void user_click_on_resource_library_button()throws Throwable  {
	btnClick(si.getResourcelib().getResourcelibrarysection());
	sleep(4000);
}
@Then("User click on Prescribed resources button")
public void user_click_on_prescribed_resources_button() throws Throwable {
	btnClick(si.getResourcelib().getMyresourcessection());
	sleep(4000);
}

@Then("User enter resourcename in search filter")
public void user_enter_resourcename_in_search_filter() throws Throwable  {
	enterText(si.getResourcelib().getSearchname(),"new scheduled resources");
	sleep(3000);
}
////////////////


@Then("User click on Add favourite icon")
public void user_click_on_add_favourite_icon() throws Throwable{
	btnClick(si.getResourcelib().getAddtofavourite());
	sleep(4000);
}
@Then("User click on back to resource library link")
public void user_click_on_back_to_resource_library_link() throws Throwable{
	btnClick(si.getResourcelib().getBacktoresourcelibrarylink());
	sleep(4000);
}
@Then("User click on Favourite resource button")
public void user_click_on_favourite_resource_button() throws Throwable{
	btnClick(si.getResourcelib().getFavouriteresourcesection());
	sleep(4000);
}
@Then("User click on remove favourite icon")
public void user_click_on_remove_favourite_icon() throws Throwable{
	btnClick(si.getResourcelib().getRemovefromfavourite());
	sleep(4000);
}
@Then("User click on cancel button for confirm remove popup")
public void user_click_on_cancel_button_for_confirm_remove_popup()throws Throwable {
	btnClick(si.getResourcelib().getCancelbtfromremovepopup());
	sleep(4000);
}
@Then("User click on confirm button for confirm remove popup")
public void user_click_on_confirm_button_for_confirm_remove_popup() throws Throwable{
	user_click_on_remove_favourite_icon();
	sleep(4000);
	btnClick(si.getResourcelib().getConfirmbtfromremovepopup());
	sleep(4000);
	
	user_click_on_back_to_resource_library_link();
	sleep(4000);
	user_click_on_prescribed_resources_button();
	sleep(4000);
	user_enter_resourcename_in_search_filter();
	sleep(4000);
}



 //////////////////////
@Then("User click on Resource Read_more link")
public void user_click_on_resource_read_more_link() throws Throwable {
	btnClick(si.getResourcelib().getReadmore());
	sleep(4000);
}
@Then("User click on Download button")
public void user_click_on_download_button()throws Throwable  {
	btnClick(si.getResourcelib().getDownload_link());
	sleep(4000);
}
@Then("User click on View button")
public void user_click_on_view_button() throws Throwable {
	btnClick(si.getResourcelib().getView_link());
	sleep(4000);
}


}
