package com.orange.e2eTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src\\spec\\features" }, // glue = { "" },
		plugin = { "pretty","html:target/cucumber-report" }, 
		tags = { ("@connexion") },
		snippets = SnippetType.CAMELCASE, monochrome = true

)
public class TestRunner {

}
