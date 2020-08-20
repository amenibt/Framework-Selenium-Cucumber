package com.orange.e2eTests.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.pageObjects.AuthentificationPage;
import com.orange.e2eTests.utils.Common;
import com.orange.e2eTests.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AuthentificationStepDefinition extends Common{

	public WebDriver driver;
	
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	
	public AuthentificationStepDefinition() {
		driver=Setup.driver;
	}
	
	@Given("^Open application$")
	public void openApplication() throws Throwable {
		logger.info("Open application Orange");
		String url = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		driver.get(url);
	}

	@When("^Set UserName$")
	public void setUserName() throws Throwable {
		logger.info("Set UserName");
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.setUserName();
	}

	@And("^Set Password$")
	public void setPassword() throws Throwable {
		logger.info("Set Password");
		authentificationPage.setUserPassword();
	}

	@And("^Clik on button Login$")
	public void clikOnButtonLogin() throws Throwable {
		logger.info("Clik on button Login");
		authentificationPage.clickBtnLgn();

	}

	@Then("^welcome page appears$")
	public void welcomePageAppears() throws Throwable {
		logger.info("welcome page appears");
		String wlc = AuthentificationPage.welcome.getText();
		Assert.assertTrue(wlc.contains("Welcome"));
	}

}
