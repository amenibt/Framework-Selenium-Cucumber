package com.orange.e2eTests.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.orange.e2eTests.pageObjects.PatientPage;
import com.orange.e2eTests.utils.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientStepDefinition {

public WebDriver driver;
private PatientPage patientpage= new PatientPage();

public PatientStepDefinition() {
	driver=Setup.driver;
}

@Given("^Open patient application$")
public void openPatientApplication() throws Throwable {

String url="https://form.jotform.com/81665408084158";
driver.get(url);
}

@When("^Set FirstName$")
public void setFirstName() throws Throwable {
PageFactory.initElements(driver, PatientPage.class);
patientpage.setFirstName();

}

@When("^Set LastName$")
public void setLastName() throws Throwable {
patientpage.setLastName();
}

@When("^Click button Submit$")
public void clickButtonSubmit() throws Throwable {
patientpage.clickButtonSubmit();

}

@Then("^Show an error message$")
public void showAnErrorMessage() throws Throwable {

String wlc=PatientPage.error.getText();
Assert.assertTrue(wlc.contains("There are errors on the form. Please fix them before continuing."));


}

}

