package com.orange.e2eTests.stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.orange.e2eTests.pageObjects.LinkPage;
import com.orange.e2eTests.utils.Setup;

import cucumber.api.java.en.When;

public class LinkStepDefinition {
    public WebDriver driver;
	private  LinkPage linkPage= new LinkPage ();
	
	public LinkStepDefinition() {
		driver=Setup.driver;
	}
	
		
	@When("^click on Admin link$")
	public void clickOnAdminLink() throws Throwable {
		PageFactory.initElements(driver, LinkPage.class);
		linkPage.clickAdmin();	    
	}

	@When("^click on Dashboard link$")
	public void clickOnDashboardLink() throws Throwable {
	   linkPage.clickDashboard();
	}
}
