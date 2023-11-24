package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Youngperson_page extends Base_Class {

	public Youngperson_page()  {
		  PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='grid-view-container']/div/button[text()='Add a new Child/Young Person']")
    private WebElement AddnewchildYoung_person;

	@FindBy(xpath = "//input[@id='childFName']")
    private WebElement Youngpersonfirstname;
	@FindBy(xpath = "//input[@id='childLName']")
    private WebElement Youngpersonlasttname;
	@FindBy(xpath = "//input[@id='dob']")
    private WebElement Youngpersondateofbirth;
	@FindBy(xpath = "//input[@name='nhsNo']")
    private WebElement YoungpersonNHSnumber;
	@FindBy(xpath = "//button[text()='Submit access request']")
    private WebElement Submitaccessrequest;
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	private WebElement selectmonth;
	@FindBy(xpath = "//option[text()='March']")
	private WebElement march;
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	private WebElement selectyear;
	@FindBy(xpath = "//option[text()='2015']")
	private WebElement year;
	@FindBy(xpath = "(//div[@aria-label='Choose Friday, March 20th, 2015'])[1]")
	private WebElement march20;
	@FindBy(xpath = "//button[text()='Submit access request']")
	private WebElement submit;
	
	

	public WebElement getAddnewchildYoung_person() {
		return AddnewchildYoung_person;
	}
	public WebElement getYoungpersonfirstname() {
		return Youngpersonfirstname;
	}
	public WebElement getYoungpersonlasttname() {
		return Youngpersonlasttname;
	}
	public WebElement getYoungpersondateofbirth() {
		return Youngpersondateofbirth;
	}
	public WebElement getYoungpersonNHSnumber() {
		return YoungpersonNHSnumber;
	}
	public WebElement getSubmitaccessrequest() {
		return Submitaccessrequest;
	}
	public WebElement getSelectmonth() {
		return selectmonth;
	}
	public WebElement getMarch() {
		return march;
	}
	public WebElement getSelectyear() {
		return selectyear;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getMarch20() {
		return march20;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
}
