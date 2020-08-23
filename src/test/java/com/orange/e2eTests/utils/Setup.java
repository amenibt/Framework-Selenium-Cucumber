package com.orange.e2eTests.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {

		public static WebDriver driver;
		static DriverManager driverManager;

		@Before
		/**
		 * Call browser with the design pattern factory navigator
		 **/
		public static void setup() {
			driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
			driver = driverManager.getDriver();
			// driver.get("https://opensource-demo.orangehrmlive.com/");

		}

		@After
		/**
		 * Embed a screenshoot in test report if test is marked as failed
		 **/
		public void embedScreenshot(Scenario scenario) {

			if (scenario.isFailed()) {

				try {

					scenario.write("current page url is " + driver.getCurrentUrl());
					byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
					scenario.embed(screenshot, "image/png");
				} catch (WebDriverException somePlateformDontSupportScrennshots) {
					System.err.println(somePlateformDontSupportScrennshots.getMessage());

				}

			}

			driver.quit();
		}

}
