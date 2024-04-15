package com.cucumber.stepdefinition;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;
import com.appium.utility.Constants;
import com.appium.utility.Reusables;
import com.utility.LogCapture;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseStep {

	@Before
	public void intialization(Scenario scenario) {

		try {
			// To initialize scenario name for screenshot
			Constants.scenarioName = scenario.getName();

			// Creating object ReusableFunction class
			Constants.key = new Reusables();
			Constants.DataMap = new HashMap();
			// Config properties
			System.out.println(System.getProperty("user.dir"));
			FileInputStream fs;

			fs = new FileInputStream(System.getProperty("user.dir") + "/src/Config/config.properties");
			Constants.CONFIG = new Properties();
			Constants.CONFIG.load(fs);

			// DB config properties
			fs = new FileInputStream(System.getProperty("user.dir") + "/src/Config/dbconfig.properties");
			Constants.DBCONFIG = new Properties();
			Constants.DBCONFIG.load(fs);
	
			//Loading ship2myid ANDROIDShip2myidOR
			fs = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/com/Pages/ANDROIDShip2MyID/ANDROIDShip2myidOR.properties");
			Constants.ANDROIDShip2myidOR = new Properties();
			Constants.ANDROIDShip2myidOR.load(fs);
			
			fs = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/com/Pages/ANDROIDShip2MyID/ANDROIDShip2myidsignupOR.properties");
			Constants.ANDROIDShip2myidsignupOR = new Properties();
			Constants.ANDROIDShip2myidsignupOR.load(fs);
			
			
			//SignupOR.properties
			fs = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/com/Pages/ANDROIDShip2MyID/SignupOR.properties");
			Constants.SignupOR = new Properties();
			Constants.SignupOR.load(fs);
			
			//personalizeyourpreferencesOR.properties
//			fs = new FileInputStream(
//					System.getProperty("user.dir") + "/src/test/java/com/Pages/ANDROIDShip2MyID/PersonalizeyourpreferencesOR.properties");
//			Constants.personalizeyourpreferencesOR = new Properties();
//			Constants.personalizeyourpreferencesOR.load(fs);
			
			//ForgotpasswordOR.properties
			fs = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/com/Pages/ANDROIDShip2MyID/ForgotPasswordOR.properties");
			Constants.ForgotpasswordOR = new Properties();
			Constants.ForgotpasswordOR.load(fs);
			
			//HamburgermenuOR.properties
			fs = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/com/Pages/ANDROIDShip2MyID/HamburgerOR.properties");
			Constants.HamburgermenuOR = new Properties();
			Constants.HamburgermenuOR.load(fs);
			
			// Loading ship2myid ANDROIDTestData
			fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/ANDROIDTestData.properties");
			Constants.ANDROIDTestData = new Properties();
			Constants.ANDROIDTestData.load(fs);
			
			// Loading ship2myid ANDROIDTestData
			fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/AndTestData.properties");
			Constants.AndTestData = new Properties();
			Constants.AndTestData.load(fs);
			
			// NotificationOR
			fs = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/Pages/ANDROIDShip2MyID/NotificationbellOR.properties");
			Constants.NotificationOR = new Properties();
			Constants.NotificationOR.load(fs);
			
			
			
			// Writing log in log4j-test-automation.log file
			LogCapture.startLog("-------------------------Test Case Validation Started-------------------------");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to run base step : " + e.getMessage());
		}
	}

	@After
	public static void finish() {
		LogCapture.endLog("-------------------------Test Case Validation Ended--------------------");
		// To close all driver session
		Constants.driver.quit();
	}

	// public static void writeExtentReport() {
	// Reporter.loadXMLConfig(new
	// File("/Users/automation/Desktop/AppiumWorkSpace/IOS-Mobile/extent-config.xml"));
	// }

	// public static void writeExtentReport() {
	// Reporter.loadXMLConfig(new File(Constants.key.getReportConfigPath()));
	//
	// }

}
