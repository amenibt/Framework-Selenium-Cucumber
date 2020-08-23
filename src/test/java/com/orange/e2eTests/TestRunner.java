package com.orange.e2eTests;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.orange.e2eTests.utils.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src\\spec\\features" }, // glue = { "" },
		plugin = { "pretty","html:target/cucumber-report-html", "json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/OrangeReport.html" }, 
		tags = { ("@Patient") },
		snippets = SnippetType.CAMELCASE, monochrome = true

)
public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getReportConfigPath()));
	}
}
