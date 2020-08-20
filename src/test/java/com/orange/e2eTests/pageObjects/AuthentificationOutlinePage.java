package com.orange.e2eTests.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AuthentificationOutlinePage {
	
	/* Locator */
	
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";

//	@FindBy
	
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement userPassword;
	
	//Methods
	
	public void setNameUser(String name) {
		userName.sendKeys(name);
	}

	public void setPasswordUser(String password) {
		userPassword.sendKeys(password);
	}

}
