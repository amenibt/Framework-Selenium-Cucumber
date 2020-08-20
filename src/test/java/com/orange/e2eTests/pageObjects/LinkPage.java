package com.orange.e2eTests.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LinkPage {
	final static String ADMIN_ID = "menu_admin_viewAdminModule";
	final static String DASHBOARD_ID = "menu_dashboard_index";

	@FindBy(how = How.ID, using = ADMIN_ID)
	public static WebElement adminLink;
	@FindBy(how = How.ID, using = DASHBOARD_ID)
	public static WebElement bashboardLink;
	
	public void clickAdmin() {
		adminLink.click();
	}
	
	public void clickDashboard() {
		bashboardLink.click();
	}
}
