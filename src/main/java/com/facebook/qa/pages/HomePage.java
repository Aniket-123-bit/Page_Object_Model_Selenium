package com.facebook.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.qa.base.TestBase;

public class HomePage  extends TestBase {
	
	
	@FindBy(xpath = "//span[contains(text(),'Sneha Raikwar')]")
	WebElement profilePage;

	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
	     return driver.getTitle();
	    		 
	}
	
	public ProfilePage clickOnprofilePage() {
		profilePage.click();
		return new ProfilePage();
	}

}
