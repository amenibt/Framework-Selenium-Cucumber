package com.orange.e2eTests.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PatientPage {
	/* Locatorw */
	final static String FIRST_NAME_ID = "first_45";
	final static String LAST_NAME_ID = "last_45";
	final static String BUTTON_SUBMIT_ID = "input_14";
	final static String ERROR_MESSAGE_XPATH = "/html/body/form/div[1]/ul/li[22]/div/div[2]/p";

	/* @FindBy */
	// driver.findElement(by.id()).click;

	@FindBy(how = How.ID, using = FIRST_NAME_ID)
	public static WebElement firstName;
	@FindBy(how = How.ID, using = LAST_NAME_ID)
	public static WebElement lastName;
	@FindBy(how = How.ID, using = BUTTON_SUBMIT_ID)
	public static WebElement buttonSubmit;
	@FindBy(how = How.XPATH, using = ERROR_MESSAGE_XPATH)
	public static WebElement error;

	/* Methodes */

	public void setFirstName() {
		firstName.sendKeys("Mohamed");
	}

	public void setLastName() {
		lastName.sendKeys("DRISS");
	}

	public void clickButtonSubmit() {
		buttonSubmit.submit();
	}

}
