package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Appointment_Page extends Base_Class{

	
	public Appointment_Page(){
		  PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[@class='cookie-btns']/button[text()='Accept']")
    private WebElement Acceptcookies;
	 @FindBy(xpath = "//button/a[text()='Parent / Young person']")
     private WebElement parent_youngperson;
	 
	 @FindBy(xpath = "//input[@id='email']")
     private WebElement Email;
	 
	 @FindBy(xpath = "//input[@id='password']")
     private WebElement Password;
	 
	 @FindBy(xpath = "//button[text()='Login']")
     private WebElement Login;
	 
	 @FindBy(xpath = "//div[@class='grid-view-container']/div[1]/div[4]/div/button[@type='button']")
     private WebElement user_health_button;
	 
	 @FindBy(xpath = "(//a[@href='/anywhere/myappointment'])[2]")
     private WebElement My_appointments;
	
	 
	 @FindBy(xpath="//label[text()='Filter by']/following-sibling::div/span/following-sibling::div/div[2]")
	 private WebElement Filterbyoption;
	 
	 public WebElement geAcceptcookies(){
			return Acceptcookies;
		}
	 
	 public WebElement getParent_youngperson(){
		return parent_youngperson;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getUser_health_button() {
		return user_health_button;
	}

	public WebElement getMy_appointments() {
		return My_appointments;
	}

	public WebElement getFilterbyoption(){
		return Filterbyoption;
	}

	
}

