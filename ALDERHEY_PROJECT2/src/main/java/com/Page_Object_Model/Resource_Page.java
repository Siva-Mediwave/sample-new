package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Resource_Page extends Base_Class{
	
	public Resource_Page() {

		PageFactory.initElements(driver, this);

	}
	

      @FindBy(xpath = "//a[text()='Clinician']")
      private WebElement clinician;
      
      @FindBy(xpath = "//input[@id='i0116']")
      private WebElement externalemail;
      
      @FindBy(xpath = "//input[@id='idSIButton9']")
      private WebElement externalnext;
      
      @FindBy(xpath = "//input[@id='i0118']")
      private WebElement externalpass;
      
      @FindBy(xpath = "//input[@id='idSIButton9']")
      private WebElement signin;
      
      @FindBy(xpath = "//figure[text()='Resource library']")
      private WebElement resourcelib;
      
      @FindBy(xpath = "//p[text()='My resources']")
      private WebElement myresources;
      
      @FindBy(xpath = "//button[normalize-space()='Add resource']")
      private WebElement addresources;
      
      @FindBy(xpath = "//input[@name='title']")
      private WebElement title;
      
      @FindBy(xpath = "//div[text()='Select resource type']")
      private WebElement type;
      
      @FindBy(xpath = "(//label[normalize-space()='Upload image for thumbnail'])[1]")
      private WebElement uploadimage;
      
      @FindBy(xpath = "//div[text()='Select age group']")
      private WebElement agegroup;
      
      @FindBy(xpath = "//div[text()='Group1']")
      private WebElement group1;
      
      @FindBy(xpath = "//div[text()='Select your speciality']")
      private WebElement speciality;
      
      @FindBy(xpath = "//div[text()='New OCD']")
      private WebElement ocd;
      
      @FindBy(xpath = "//div[text()='Select tags']")
      private WebElement tags;
      
      @FindBy(xpath = "//div[text()='new tag']")
      private WebElement addtags;
      
      @FindBy(xpath = "(//span[@role='button'])[1]")
      private WebElement addnew;
      
      @FindBy(xpath = "(//input[@id='ageGroupName'])[1]")
      private WebElement groupname;
      
      @FindBy(xpath = "(//div[@class='react-select__value-container css-1hwfws3'])[2]")
      private WebElement startage;
      
      @FindBy(xpath = "(//div[@class='react-select__value-container css-1hwfws3'])[3]")
      private WebElement endage;
      
      @FindBy(xpath = "//button[text()='Add age group']")
      private WebElement addage;
      
      @FindBy(xpath = "//span[text()='ADD NEW TAG']")
      private WebElement newtags;
      
      @FindBy(xpath = "(//input[@id='name'])[1]")
      private WebElement tagname;
      
      @FindBy(xpath = "(//button[normalize-space()='Add tag'])[1]")
      private WebElement addnewtag;
      
      @FindBy(xpath = "(//span[@class='slider round'])[2]")
      private WebElement silder2;
      
      @FindBy(xpath = "(//input[@placeholder='DD/MM/YYYY'])[1]")
      private WebElement ddmmyy;
      
      @FindBy(xpath = "(//div[@aria-label='Choose Thursday, June 22nd, 2023'])[1]")
      private WebElement date;
      
      @FindBy(xpath = "(//input[@placeholder='Enter the time'])[1]")
      private WebElement entertime;
      
      @FindBy(xpath = "//li[normalize-space()='9:15 PM']")
      private WebElement time;
      
      @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save as draft'])[1]")
      private WebElement savedraft;
      
      @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Publish'])[1]")
      private WebElement publish;
      
      @FindBy(xpath = "(//div[@class='react-select__value-container css-1hwfws3'])[1]")
      private WebElement clicktypes;
      
      @FindBy(xpath = "//div[@data-placeholder='Enter your useful links content here']")
      private WebElement content;

	public WebElement getClicktypes() {
		return clicktypes;
	}

	public WebElement getClinician() {
		return clinician;
	}

	public WebElement getExternalemail() {
		return externalemail;
	}

	public WebElement getExternalnext() {
		return externalnext;
	}

	public WebElement getExternalpass() {
		return externalpass;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getResourcelib() {
		return resourcelib;
	}

	public WebElement getMyresources() {
		return myresources;
	}

	public WebElement getAddresources() {
		return addresources;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getUploadimage() {
		return uploadimage;
	}

	public WebElement getAgegroup() {
		return agegroup;
	}

	public WebElement getGroup1() {
		return group1;
	}

	public WebElement getSpeciality() {
		return speciality;
	}

	public WebElement getOcd() {
		return ocd;
	}

	public WebElement getTags() {
		return tags;
	}

	public WebElement getAddtags() {
		return addtags;
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getGroupname() {
		return groupname;
	}

	public WebElement getStartage() {
		return startage;
	}

	public WebElement getEndage() {
		return endage;
	}

	public WebElement getAddage() {
		return addage;
	}

	public WebElement getNewtags() {
		return newtags;
	}

	public WebElement getTagname() {
		return tagname;
	}

	public WebElement getAddnewtag() {
		return addnewtag;
	}

	public WebElement getSilder2() {
		return silder2;
	}

	public WebElement getDdmmyy() {
		return ddmmyy;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getEntertime() {
		return entertime;
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getSavedraft() {
		return savedraft;
	}

	public WebElement getPublish() {
		return publish;
	}
	
}
