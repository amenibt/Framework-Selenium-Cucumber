package com.orange.e2eTests.stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.pageObjects.AuthentificationOutlinePage;
import com.orange.e2eTests.pageObjects.AuthentificationPage;

import com.orange.e2eTests.utils.Setup;
import cucumber.api.java.en.When;


public class AuthentificationOutlineStepDefinition {

	public WebDriver driver;
	
	private AuthentificationOutlinePage authentificationOutlinePage = new AuthentificationOutlinePage();
	
	public AuthentificationOutlineStepDefinition() {
		driver=Setup.driver;
	}
	
	@When("^Set login \"([^\"]*)\"$")
	public void setLogin(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationOutlinePage.class);
		PageFactory.initElements(driver, AuthentificationPage.class);
	    authentificationOutlinePage.setNameUser(name);
	}

	@When("^Set pwdUser \"([^\"]*)\"$")
	public void setPwdUser(String password) throws Throwable {
	    authentificationOutlinePage.setPasswordUser(password);
	}
}
