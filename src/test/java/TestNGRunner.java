import org.testng.annotations.AfterSuite;

import com.utility.LogCapture;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGRunner {    
	@CucumberOptions(features = { "src/Feature/ANDROIDShip2MyID" },	
			glue = { "com.cucumber.stepdefinition" },
			strict = false,
			dryRun = false,
				tags = {"@AndroidShip2MyIDlogin_01"},  
					plugin = {
							"html:target/site/cucumber-pretty","rerun:target/rerun.txt", 
					"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Extentreport.html",
					}, 
					//html:target/site/cucumber-pretty", "json:target/cucumber-reports/cucumber.json",
			monochrome = true)
	public class TestNGAppRunner extends AbstractTestNGCucumberTests
	{
		@AfterSuite
		public void sendMail() throws Exception  
		{ 
			// SendMail.execute("InstallAndTestAppReport.htm");
			LogCapture.info("Automation test report mail sent.....!!!!!!!!!");
		}
	}
}