package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Setpassword_Page extends Base_Class {
	
	public Setpassword_Page(){
		  PageFactory.initElements(driver, this);
	}
	

     @FindBy(xpath = "//div[text()='BJ']")
     private WebElement userprofileicon;
     
     @FindBy(xpath = "//a[@href='/anywhere/account']")
     private WebElement Accountbutton;
     @FindBy(xpath = "//div[@class='password-field']/input[@id='oldPassword']")
     private WebElement oldpassword;
     @FindBy(xpath = "//div[@class='password-field']/input[@id='newPassword']")
     private WebElement newpassword;
     @FindBy(xpath = "//div[@class='password-field']/input[@id='confirmPassword']")
     private WebElement confirmpassword;
     @FindBy(xpath = "//button[text()='Save']")
     private WebElement savebutton;
  
     
	public WebElement getUserprofileicon() {
		return userprofileicon;
	}
	public WebElement getAccountbutton() {
		return Accountbutton;
	}
	public WebElement getOldpassword() {
		return oldpassword;
	}
	public WebElement getNewpassword() {
		return newpassword;
	}
	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}

	

}
