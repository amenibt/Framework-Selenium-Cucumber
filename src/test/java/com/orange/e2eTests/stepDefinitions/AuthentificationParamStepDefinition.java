package com.orange.e2eTests.stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.orange.e2eTests.pageObjects.AuthentificationPage;
import com.orange.e2eTests.pageObjects.AuthentificationParamPage;
import com.orange.e2eTests.utils.Setup;
import cucumber.api.java.en.When;


public class AuthentificationParamStepDefinition {

	public WebDriver driver;
	
	private AuthentificationParamPage authentificationParamPage = new AuthentificationParamPage();
	
	public AuthentificationParamStepDefinition() {
		driver=Setup.driver;
	}
	
	@When("^Set Name \"([^\"]*)\"$")
	public void setNameUser(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationParamPage.class);
		PageFactory.initElements(driver, AuthentificationPage.class);
	    authentificationParamPage.setUserName(name);
	}

	@When("^Set Pwd \"([^\"]*)\"$")
	public void setPwdUser(String password) throws Throwable {
	    authentificationParamPage.setUserPassword(password);
	}	
}
