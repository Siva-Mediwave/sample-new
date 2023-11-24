package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Resourcelib_Page extends Base_Class {

	
      public  Resourcelib_Page() {
    	  PageFactory.initElements(driver, this);
	}
      
	   @FindBy(xpath = "(//a[@href='/anywhere/resource'])[2]")
	      private WebElement resourcelibrarysection;
	   
	   @FindBy(xpath = "//a[@href='/anywhere/resource/recommended']/div")
	      private WebElement Myresourcessection;
	   
	   @FindBy(xpath = "//div[@class='search-container']/input[@placeholder='Search resource name']")
	      private WebElement searchname;
	   
	   @FindBy(xpath = "//a[@class='rsl-link small-text']")
	      private WebElement Readmore;
	   @FindBy(xpath = "//div[@class='download-btns']/button[text()='View']")
	      private WebElement view_link;
	   @FindBy(xpath = "//div[@class='download-btns']/button[text()='Download']")
	      private WebElement Download_link;
	   
	   
// Add favourite resource////
	   @FindBy(xpath = "//button[@aria-label='add to favourite']/img")
	   private WebElement Addtofavourite;
	   

	@FindBy(xpath = "//a[@class='access-button res-back-button']/span[2][text()='Back to the resource library']")
	   private WebElement Backtoresourcelibrarylink;
	   @FindBy(xpath = "//a[@href='/anywhere/resource/favourite']/div")
	   private WebElement Favouriteresourcesection;
	   
	   @FindBy(xpath = "//button[@aria-label='remove from favourite']/img")
	   private WebElement Removefromfavourite;
	   @FindBy(xpath = "//div[@class='loinc-remove-footer']/button[text()='Cancel']")
	   private WebElement Cancelbtfromremovepopup;
	   @FindBy(xpath = "//div[@class='loinc-remove-footer']/button[text()='Confirm']")
	   private WebElement Confirmbtfromremovepopup;
	   
	   
	   public WebElement getAddtofavourite() {
			return Addtofavourite;
		}
		public WebElement getBacktoresourcelibrarylink() {
			return Backtoresourcelibrarylink;
		}
		public WebElement getFavouriteresourcesection() {
			return Favouriteresourcesection;
		}
		public WebElement getRemovefromfavourite() {
			return Removefromfavourite;
		}
		public WebElement getCancelbtfromremovepopup() {
			return Cancelbtfromremovepopup;
		}
		public WebElement getConfirmbtfromremovepopup() {
			return Confirmbtfromremovepopup;
		}
	/////////
	   
	   
	public WebElement getResourcelibrarysection() {
		return resourcelibrarysection;
	
	}
	public WebElement getMyresourcessection() {
		return Myresourcessection;
	}
	public WebElement getSearchname() {
		return searchname;
	}
	public WebElement getReadmore() {
		return Readmore;
	}
	public WebElement getView_link() {
		return view_link;
	}
	public WebElement getDownload_link() {
		return Download_link;
	}
  

	
}
