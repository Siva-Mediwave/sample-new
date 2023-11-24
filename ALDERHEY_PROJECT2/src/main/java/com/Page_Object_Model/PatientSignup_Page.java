package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class PatientSignup_Page extends Base_Class {
	
	public PatientSignup_Page()  {
		  PageFactory.initElements(driver, this);
	}
	
	//a[@href='/register']
	//input[@id='Parent']
	//input[@id='firstName']
	//input[@id='lastName']
	//input[@id='email']
	//input[@id='mobileNumber']
	//input[@id='password']
	//input[@id='confirmPassword']
	//input[@name='termsAndCondtion']
	//button[text()='Create account']
	
	 @FindBy(xpath = "//a[@href='/register']")
     private WebElement Signup;

	 @FindBy(xpath = "//input[@id='firstName']")
     private WebElement Parentfirstname;
     @FindBy(xpath = "//input[@id='lastName']")
     private WebElement Parentlastname;
     @FindBy(xpath = "//input[@id='email']")
     private WebElement ParentEmail;
     
     @FindBy(xpath = "//input[@id='mobileNumber']")
     private WebElement Mobilenumber;
     @FindBy(xpath = "//input[@id='password']")
     private WebElement Password;
     @FindBy(xpath = "//input[@id='confirmPassword']")
     private WebElement confirmpassword;
     @FindBy(xpath = "//div[@class='sign-up-accept-terms']/label/input[@name='termsAndCondtion']")
     private WebElement Termsandcondition;
     @FindBy(xpath = "//button[text()='Create account']")
     private WebElement createaccountbutton;
     @FindBy(xpath = "//input[@class='custom-otp-field  ']")
     private WebElement otp1;
     @FindBy(xpath = "(//input[@class='custom-otp-field  '])[2]")
     private WebElement otp2;
     @FindBy(xpath = "(//input[@class='custom-otp-field  '])[3]")
     private WebElement otp3;
     @FindBy(xpath = "(//input[@class='custom-otp-field  '])[4]")
     private WebElement otp4;
     @FindBy(xpath = "(//input[@class='custom-otp-field  '])[5]")
     private WebElement otp5;
     @FindBy(xpath = "(//input[@class='custom-otp-field  '])[6]")
     private WebElement otp6;
     @FindBy(xpath = "//button[text()='Verify']")
     private WebElement verify;
	
     @FindBy(xpath = "(//input[@type='radio'])[2]")
     private WebElement youngperson;
     
     public WebElement getSignup() {
 		return Signup;
 	}
 	public WebElement getParentfirstname() {
 		return Parentfirstname;
 	}
 	public WebElement getParentlastname() {
 		return Parentlastname;
 	}
 	public WebElement getParentEmail() {
 		return ParentEmail;
 	}
 	public WebElement getMobilenumber() {
 		return Mobilenumber;
 	}
 	public WebElement getPassword() {
 		return Password;
 	}
 	public WebElement getConfirmpassword() {
 		return confirmpassword;
 	}
 	public WebElement getTermsandcondition() {
 		return Termsandcondition;
 	}
 	public WebElement getCreateaccountbutton() {
 		return createaccountbutton;
 	}
	public WebElement getOtp1() {
		return otp1;
	}
	public WebElement getOtp2() {
		return otp2;
	}
	public WebElement getOtp3() {
		return otp3;
	}
	public WebElement getOtp4() {
		return otp4;
	}
	public WebElement getOtp5() {
		return otp5;
	}
	public WebElement getOtp6() {
		return otp6;
	}
	public WebElement getVerify() {
		return verify;
	}
	public WebElement getYoungperson() {
		return youngperson;
	}
	 
	
}
