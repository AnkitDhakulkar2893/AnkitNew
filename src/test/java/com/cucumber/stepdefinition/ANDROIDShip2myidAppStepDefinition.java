package com.cucumber.stepdefinition;

import java.net.URL;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.appium.utility.Constants;
import com.utility.LogCapture;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ANDROIDShip2myidAppStepDefinition {
	
	@Given("^android app is installed on the device and launched successfully$")
	public void android_app_is_installed_on_the_device_and_launched_successfully() throws Throwable {
	  
		String vObjplatform = Constants.CONFIG.getProperty("Android");
		Constants.key.launchApp(vObjplatform);
		LogCapture.info("Ship2myid Application installed and launched successfully......!!!!");
		
		
	}

	@When("^android user clicks on login on App Intro screen$")
	public void android_user_clicks_on_login_on_App_Intro_screen() throws Throwable {
		String vObjotherlogin = Constants.ANDROIDShip2myidOR.getProperty("Login");
		//Assert.assertEquals("PASS", Constants.key.click(vObjotherlogin));
		Constants.key.click(vObjotherlogin);
		Constants.key.pause(5);
		LogCapture.info("User clicks on login button...");
	   
	}

	@Then("^android user enters digitalid \"([^\"]*)\" password \"([^\"]*)\" clicks on login button$")
	public void android_user_enters_digitalid_password_clicks_on_login_button(String DigitalID, String Password) throws Throwable {
	    
		
		String vObjemail = Constants.ANDROIDShip2myidOR.getProperty("Digitalid");
		Constants.key.pause(3000);
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjemail));
		
		String vUsername = Constants.ANDROIDTestData.getProperty(DigitalID);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjemail, vUsername));
		//Constants.key.writeInInput(vObjemail, vUsername);
		LogCapture.info("User entered digitalid as " +vUsername);
		
		Constants.driver.hideKeyboard();
		
		String vObjpassword = Constants.ANDROIDShip2myidOR.getProperty("Password");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjpassword));	
		String vPassword = Constants.ANDROIDTestData.getProperty(Password);	
	  //  Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjpassword, vPassword));
		
	    Constants.key.writeInInput(vObjpassword, vPassword);
	    Constants.key.pause(5);
	    String vObjeyeicon = Constants.ANDROIDShip2myidOR.getProperty("eyeicon");
		Assert.assertEquals("PASS", Constants.key.click(vObjeyeicon));
		String vObjloginbtn = Constants.ANDROIDShip2myidOR.getProperty("Loginafterenteringidpass");
		Assert.assertEquals("PASS", Constants.key.click(vObjloginbtn));
		LogCapture.info("User enters password as " +vPassword+ "  and clicks on login button...");
		Constants.key.pause(10);
	}

	@Then("^android user successfully navigates to deals screen$")
	public void android_user_successfully_navigates_to_deals_screen() throws Throwable {
		
		String vObjYourcategories = Constants.ANDROIDShip2myidOR.getProperty("Yourcategories");
		//Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjYourcategories));	
		String Text=Constants.key.readText(vObjYourcategories);
		//System.out.println(Constants.key.readText(vObjYourcategories));
		LogCapture.info("User successfully lands on deals screen and can observe " +Text+ " section...");
	}

	@Then("^android user click on the profile icon$")
	public void android_user_click_on_the_profile_icon() throws Throwable {
		Constants.key.pause(3000); 
		String vObjprofileicon = Constants.ANDROIDShip2myidOR.getProperty("Profileicon");
	     Assert.assertEquals("PASS", Constants.key.click(vObjprofileicon));
	     LogCapture.info("User cicks on profile icon on taskbar...");
	     Constants.key.pause(5000);
	}

	@Then("^android user click on the Personal tab$")
	public void android_user_click_on_the_Personal_tab() throws Throwable {
		
		String vObjpersonaltab = Constants.ANDROIDShip2myidOR.getProperty("Personaltab");
	     Assert.assertEquals("PASS", Constants.key.click(vObjpersonaltab));
	     LogCapture.info("User cicks on personal tab...");
	}

	@Then("^android user click on the Edit icon$")
	public void android_user_click_on_the_Edit_icon() throws Throwable {
		Constants.key.pause(150);
		String vObjediticon = Constants.ANDROIDShip2myidOR.getProperty("Editicon");
	     Assert.assertEquals("PASS", Constants.key.click(vObjediticon));
	     LogCapture.info("User cicks on edit icon...");
	     Constants.key.pause(150);
	}

	@Then("^android user updates first name \"([^\"]*)\" middle name \"([^\"]*)\"last name \"([^\"]*)\"$")
	public void android_user_updates_first_name_middle_name_last_name(String Fname, String Mname, String Lname) throws Throwable {
		Constants.key.pause(150);
		String vObjFname = Constants.ANDROIDShip2myidOR.getProperty("Firstname");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjFname));
		Constants.key.clearData(vObjFname);
		String vObjFnameedit = Constants.ANDROIDShip2myidOR.getProperty("Firstnamesendkeys");
		String vfirstname = Constants.ANDROIDTestData.getProperty(Fname);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjFnameedit, vfirstname));
		LogCapture.info("User entered first name as " +Fname);
		
		Constants.key.pause(150);
		String vObjmnameedit = Constants.ANDROIDShip2myidOR.getProperty("Middlename");
		String vmiddlename = Constants.ANDROIDTestData.getProperty(Mname);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjmnameedit, vmiddlename));
		LogCapture.info("User entered middle name as " +Mname);
		
		Constants.key.pause(150);
		String vObjlname = Constants.ANDROIDShip2myidOR.getProperty("Lastname");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjlname));
		Constants.key.clearData(vObjlname);
		Constants.key.pause(1000);
		String vObjlastnameedit = Constants.ANDROIDShip2myidOR.getProperty("Lastnamesendkeys");
		String vlastname = Constants.ANDROIDTestData.getProperty(Lname);
		//Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjlastnameedit, vlastname));
		Constants.key.writeInInput(vObjlastnameedit, vlastname);
    	
		Constants.key.pause(5000);
		LogCapture.info("User entered last name as " +Lname);
	}

	@Then("^android user selects the DOB \"([^\"]*)\"$")
	public void android_user_selects_the_DOB(String arg1) throws Throwable {
	   
		String vObjphonenumbertext = Constants.ANDROIDShip2myidOR.getProperty("Save");
		Constants.key.scrollDownUI(vObjphonenumbertext);
		String vObjdob = Constants.ANDROIDShip2myidOR.getProperty("DOB");
	    Assert.assertEquals("PASS", Constants.key.click(vObjdob));
	    
	    String vObjdate = Constants.ANDROIDShip2myidOR.getProperty("Date");
	    Assert.assertEquals("PASS", Constants.key.click(vObjdate));
	    String vObjokbutton = Constants.ANDROIDShip2myidOR.getProperty("okbutton");
	    Assert.assertEquals("PASS", Constants.key.click(vObjokbutton));
	    
	    LogCapture.info("User updated the date ");
	     
	}

	@Then("^android user selects the Gender \"([^\"]*)\"$")
	public void android_user_selects_the_Gender(String arg1) throws Throwable {
		Constants.key.pause(2000);
		String vObjGenderdropd = Constants.ANDROIDShip2myidOR.getProperty("Genderdropd");
	    Assert.assertEquals("PASS", Constants.key.click(vObjGenderdropd));
	    String vObjGenderselect = Constants.ANDROIDShip2myidOR.getProperty("Genderselect");
	    Assert.assertEquals("PASS", Constants.key.click(vObjGenderselect));
	    Constants.key.pause(3000);
	    LogCapture.info("User selects gender..... ");
	}

	@Then("^android user click on Save button$")
	public void android_user_click_on_Save_button() throws Throwable {
		
		String vObjSave= Constants.ANDROIDShip2myidOR.getProperty("Save");
	    Assert.assertEquals("PASS", Constants.key.click(vObjSave));
	   
	    LogCapture.info("User save the updated changes..... ");
	    Constants.key.pause(5000);
	}
	
	// Signup flow
	@When("^android user clicks on signup on App Intro screen$")
	public void android_user_clicks_on_signup_on_App_Intro_screen() throws Throwable {
		Constants.key.pause(5000); 
		String vObjsignup = Constants.SignupOR.getProperty("Signupbtn");
		//Assert.assertEquals("PASS", Constants.key.click(vObjsignup));
		Constants.key.click(vObjsignup);
		LogCapture.info("User clicks on signup button on app intro screen...");
	}

	@Then("^android user enters new phone number \"([^\"]*)\"$")
	public void android_user_enters_new_phone_number(String Phonenumber) throws Throwable {
	    
		String vObjPnumber = Constants.SignupOR.getProperty("Sphonenumber");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjPnumber));
		String vphonenumber = Constants.ANDROIDTestData.getProperty(Phonenumber);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjPnumber, vphonenumber));
		
		LogCapture.info("User entered phone number " +vphonenumber);
	}

	@Then("^android user clicks on send otp button$")
	public void android_user_clicks_on_send_otp_button() throws Throwable {
	   
		String vObjsendotp = Constants.SignupOR.getProperty("SendOTP");
		Assert.assertEquals("PASS", Constants.key.click(vObjsendotp));
		
		LogCapture.info("User clicks on send otp button....");
	}

	@Then("^android user enters the otp$")
	public void android_user_enters_the_otp() throws Throwable {
		Constants.key.pause(10000);
		LogCapture.info("User entered OTP...");
		
	}

	@Then("^android user lands on create digital id screen click on i understand button$")
	public void android_user_lands_on_create_digital_id_screen_click_on_i_understand_button() throws Throwable {
		Constants.key.pause(7000);
		String vObjline1 = Constants.SignupOR.getProperty("youare");
		String vObjline2 = Constants.SignupOR.getProperty("universal");
		String vObjline3 = Constants.SignupOR.getProperty("thatrep");
		
		String Text1=Constants.key.readText(vObjline1);
		String Text2=Constants.key.readText(vObjline2);
		String Text3=Constants.key.readText(vObjline3);
	
		String vObjiunderstand = Constants.SignupOR.getProperty("UniIDiunderstand");
		Assert.assertEquals("PASS", Constants.key.click(vObjiunderstand));
		
		LogCapture.info("User successfully lands on create digital id screen and can observe " +Text1+" "+Text2+" "+ Text3+ " text and clicks on i understand button...");
		
	}

	@Then("^android user enters universal digital id \"([^\"]*)\" clicks on check availability$")
	public void android_user_enters_universal_digital_id_clicks_on_check_availability(String DigitalD) throws Throwable {
		
		String vObjuniid = Constants.SignupOR.getProperty("Sunidigiid");
		Assert.assertEquals("PASS", Constants.key.click(vObjuniid));
		
		String vUNiid = Constants.ANDROIDTestData.getProperty(DigitalD);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjuniid, vUNiid));
		
		String vObjcheckava = Constants.SignupOR.getProperty("Checkavailability");
		Assert.assertEquals("PASS", Constants.key.click(vObjcheckava));
		
		LogCapture.info("User enters digital id as " + DigitalD+" and click on check availability button...");
	}

	@Then("^android user clicks on continue button$")
	public void android_user_clicks_on_continue_button() throws Throwable {
		Constants.key.pause(4000);
		String vObjcontinue = Constants.SignupOR.getProperty("Continue");
		Assert.assertEquals("PASS", Constants.key.click(vObjcontinue));
		
		LogCapture.info("User clicks on continue button...");
		
	}

	@Then("^android user enters password \"([^\"]*)\" confirm password \"([^\"]*)\" clicks on continue button$")
	public void android_user_enters_password_confirm_password_clicks_on_continue_button(String password, String Cpassword) throws Throwable {
		Constants.key.pause(5000);
		String vObjPassword = Constants.SignupOR.getProperty("Newpassword");
		Assert.assertEquals("PASS", Constants.key.click(vObjPassword));
		
		String vpassword = Constants.ANDROIDTestData.getProperty(password);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjPassword, vpassword));
		
		String vObjCpassword = Constants.SignupOR.getProperty("Confirmpassword");
		Assert.assertEquals("PASS", Constants.key.click(vObjCpassword));
		
		String vCpassword = Constants.ANDROIDTestData.getProperty(Cpassword);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjCpassword, vCpassword));
		Constants.driver.hideKeyboard();
		Constants.key.pause(5000);
		String vObjPasscontinue = Constants.SignupOR.getProperty("Pswdcontinue");
		Assert.assertEquals("PASS", Constants.key.click(vObjPasscontinue));
		
		LogCapture.info("User enters password "+vpassword+ " and confirm password " +vCpassword+" and clicks on continue button...");
	}

	@Then("^android user lands on digital id password creatred successfully screen clicks on i understand button$")
	public void android_user_lands_on_digital_id_password_creatred_successfully_screen_clicks_on_i_understand_button() throws Throwable {
        
		Constants.key.pause(5000);
		String vObjidcreatedsuc = Constants.SignupOR.getProperty("Uniidcreatedsuccessfully");
		String Text=Constants.key.readText(vObjidcreatedsuc);
		String vObjidcreatedcontinue = Constants.SignupOR.getProperty("Uniidcontinue");
		Assert.assertEquals("PASS", Constants.key.click(vObjidcreatedcontinue));
		
		LogCapture.info("User lands on ID password created successfully section can observe "+Text+" and clicks on continue button...");
	}

	@Then("^android user enters first name \"([^\"]*)\" and \"([^\"]*)\"$")
	public void android_user_enters_first_name_and(String Firstname, String Lastname) throws Throwable {
		
		String vObjFname = Constants.SignupOR.getProperty("Sfirstname");
		Assert.assertEquals("PASS", Constants.key.click(vObjFname));
		String vFname = Constants.ANDROIDTestData.getProperty(Firstname);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjFname, vFname));
		
		String vObjLname = Constants.SignupOR.getProperty("Slastname");
		Assert.assertEquals("PASS", Constants.key.click(vObjLname));
		String vLname = Constants.ANDROIDTestData.getProperty(Lastname);
		Constants.key.writeInInput(vObjLname, vLname);
		Constants.driver.hideKeyboard();
		Constants.key.pause(3000);
		LogCapture.info("User enters first name as "+vFname+ "last name as "+vLname+" ...");
	}

	@Then("^android user clicks on terms privacy policy check box$")
	public void android_user_clicks_on_terms_privacy_policy_check_box() throws Throwable {
	   
		String vObjcheckbox = Constants.SignupOR.getProperty("Checkbox");
		Assert.assertEquals("PASS", Constants.key.click(vObjcheckbox));
		LogCapture.info("User clicks on checkbox...");
	}

	@Then("^android user clicks on signup$")
	public void android_user_clicks_on_signup() throws Throwable {
	    
		String vObjsignup = Constants.SignupOR.getProperty("Signup");
		Assert.assertEquals("PASS", Constants.key.click(vObjsignup));
		LogCapture.info("User clicks on signup button...");
	}

	@Then("^android usersuccessfully sign up and lands on personalize your preferences screen\\.$")
	public void android_usersuccessfully_sign_up_and_lands_on_personalize_your_preferences_screen() throws Throwable {
		Constants.key.pause(6000);
		String vObjpersonalizescreen = Constants.SignupOR.getProperty("Personalizeyourpref");
		String Text=Constants.key.readText(vObjpersonalizescreen);
		LogCapture.info("User usersuccessfully sign up and lands on personalize your preferences screen and can observe "+Text+" section...");
	}
	
	@Then("^android user enters inavlid otp \"([^\"]*)\"five times$")
	public void android_user_enters_inavlid_otp_five_times(String OTP) throws Throwable {
	    
		String vObjotpfield = Constants.SignupOR.getProperty("OTPfield");
		Assert.assertEquals("PASS", Constants.key.click(vObjotpfield));
		String vOTP = Constants.ANDROIDTestData.getProperty(OTP);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjotpfield, vOTP));
		Constants.key.clearData(vObjotpfield);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjotpfield, vOTP));
		Constants.key.clearData(vObjotpfield);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjotpfield, vOTP));
		Constants.key.clearData(vObjotpfield);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjotpfield, vOTP));
		Constants.key.clearData(vObjotpfield);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjotpfield, vOTP));
		
		LogCapture.info("User rechaes the max otp attempt entering invalid otp...");
		
	}

	@Then("^android user lands on maximum attempt to get otp screen$")
	public void android_user_lands_on_maximum_attempt_to_get_otp_screen() throws Throwable {
	    
		Constants.key.pause(7000);
		String vObjline1 = Constants.SignupOR.getProperty("maxotptext1");
		String vObjline2 = Constants.SignupOR.getProperty("maxotptext2");
		String vObjline3 = Constants.SignupOR.getProperty("maxotptext3");
		
		String Text1=Constants.key.readText(vObjline1);
		String Text2=Constants.key.readText(vObjline2);
		String Text3=Constants.key.readText(vObjline3);
	
		LogCapture.info("User lands on max attempt to get otp screen and can observe " +Text1+" "+Text2+" "+ Text3+ " ...");
	}

	@Then("^android user clicks on add email hyperlink$")
	public void android_user_clicks_on_add_email_hyperlink() throws Throwable {
	    
		String vObjaddemaillink = Constants.SignupOR.getProperty("addemaillink");
		Assert.assertEquals("PASS", Constants.key.click(vObjaddemaillink));
		
		LogCapture.info("User clicks on add email hyperlink on max attempt to get otp screen...");
	}

	@Then("^android user enters the email \"([^\"]*)\" on email popup and click on send otp$")
	public void android_user_enters_the_email_on_email_popup_and_click_on_send_otp(String Email) throws Throwable {
	    
		String vObjemailfield = Constants.SignupOR.getProperty("Emailfield");
		Assert.assertEquals("PASS", Constants.key.click(vObjemailfield));
		String vemailid = Constants.ANDROIDTestData.getProperty(Email);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjemailfield, vemailid));
		//String Text= Constants.key.readText(vemailid);
		
		String vObjsendotp = Constants.SignupOR.getProperty("addemailpopupsenotp");
		Assert.assertEquals("PASS", Constants.key.click(vObjsendotp));
		LogCapture.info("User enters the email as "+vemailid+" and clicks on send otp...");
	}

	@Then("^android user enters the otp and clicks o verify button$")
	public void android_user_enters_the_otp_and_clicks_o_verify_button() throws Throwable {
		
		Constants.key.pause(50000);
		
		String vObjverify = Constants.SignupOR.getProperty("popupverifybtn");
		Assert.assertEquals("PASS", Constants.key.click(vObjverify));
		LogCapture.info("User enters the otp and clicks o verify button...");
	    
	}

	@Then("^android user lands on email added successfully popup and click on continue button$")
	public void android_user_lands_on_email_added_successfully_popup_and_click_on_continue_button() throws Throwable {
	   
		String vObjemailaddedtext = Constants.SignupOR.getProperty("emailaddedtext");
		String Text= Constants.key.readText(vObjemailaddedtext);
		String vObjpopupcontinuebtn = Constants.SignupOR.getProperty("popupcontinuebtn");
		Assert.assertEquals("PASS", Constants.key.click(vObjpopupcontinuebtn));
		
		LogCapture.info("User lands on email added successfully pop up and can observe "+Text+" text ...");
	}
	
	@Then("^android user lands on maximum attempt to get otp screen with email prefilled andclick on continue button$")
	public void android_user_lands_on_maximum_attempt_to_get_otp_screen_with_email_prefilled_andclick_on_continue_button() throws Throwable {
	    
		
		String vObjpopupcontinuebtn = Constants.SignupOR.getProperty("popupcontinuebtn");
		Assert.assertEquals("PASS", Constants.key.click(vObjpopupcontinuebtn));
		
		LogCapture.info("User lands on maximum attempt to get otp screen with email prefilled andclick on continue button...");
	}
	

    @Then("^android user clicks on personalize your preferences on the task bar$")
    public void android_user_clicks_on_personalize_your_preferences_on_the_task_bar() throws Throwable {
   
    }

    @Then("^android user lands on personalize your preferences screen$")
    public void android_user_lands_on_personalize_your_preferences_screen() throws Throwable {
    
    }

    @Then("^android user selects some categories and click on choose brand/store button$")
    public void android_user_selects_some_categories_and_click_on_choose_brand_store_button() throws Throwable {
   
    }

    @Then("^android user lands on choose brand screen$")
    public void android_user_lands_on_choose_brand_screen() throws Throwable {
   
    }

    @Then("^android user selects brands from specific categories$")
    public void android_user_selects_brands_from_specific_categories() throws Throwable {
    
    }

    @Then("^android user clicks on view deals button$")
    public void android_user_clicks_on_view_deals_button() throws Throwable {
    
    }

    @Then("^android user successfully updated the preferences selection and lands on deals screen$")
    public void android_user_successfully_updated_the_preferences_selection_and_lands_on_deals_screen() throws Throwable {
    
    }
    

///////////////////// Hamburger menu ///////////////////////////////

    
    
    @Then("^android user clicks on hamburger menu$")
	public void android_user_clicks_on_hamburger_menu() throws Throwable {
		String vObjotherHamburger = Constants.HamburgermenuOR.getProperty("HamburgerMenu");
		Assert.assertEquals("PASS", Constants.key.click(vObjotherHamburger));
		//Constants.key.click(vObjotherHamburger);
		Constants.key.pause(5);
		LogCapture.info("User clicks on Hamburger Menu...");
	}
	@Then("^android user clicks on Settings$")
	public void android_user_clicks_on_Settings() throws Throwable {
		String vObjothersettings = Constants.HamburgermenuOR.getProperty("Settings");
		//Assert.assertEquals("PASS", Constants.key.click(vObjothersettings));
		Constants.key.click(vObjothersettings);
		Constants.key.pause(5);
		LogCapture.info("User clicks on settings...");
	}
	@Then("^android user selects the Change Password$")
	public void android_user_selects_the_Change_Password() throws Throwable {
		String vObjothersettingoption = Constants.HamburgermenuOR.getProperty("Changepassword");
		//Assert.assertEquals("PASS", Constants.key.click(vObjothersettingoption));
		Constants.key.click(vObjothersettingoption);
		Constants.key.pause(5);
		LogCapture.info("User clicks on change password...");
		}
	@Then("^android user enters the Current Password \"([^\"]*)\"$")
	public void android_user_enters_the_Current_Password(String CurrentPassword) throws Throwable {
		String vObjCurrentpassword = Constants.HamburgermenuOR.getProperty("currentpassword");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjCurrentpassword));
		Assert.assertEquals("PASS", Constants.key.click(vObjCurrentpassword));
		String vCurrentPassword = Constants.ANDROIDTestData.getProperty(CurrentPassword);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjCurrentpassword, vCurrentPassword));
		String vObjCurrentpasswordeye = Constants.HamburgermenuOR.getProperty("Cuurentpswdeye");
		Assert.assertEquals("PASS", Constants.key.click(vObjCurrentpasswordeye));
		
		Constants.key.pause(5);
		Constants.driver.hideKeyboard();
		LogCapture.info("User entered current password as " + vCurrentPassword+ "....");
	}
 
	@Then("^android user clicks on Confirm button$")
	public void android_user_clicks_on_Confirm_button() throws Throwable {
		String vObjConfirmButton = Constants.HamburgermenuOR.getProperty("confirmbutton");
		Assert.assertEquals("PASS", Constants.key.click(vObjConfirmButton));
		Constants.key.pause(2000);
		LogCapture.info("User clicks on confirm button...");
	}
 
	@Then("^android user successfully navigates to Change Password screen$")
	public void android_user_successfully_navigates_to_Change_Password_screen() throws Throwable {
		Constants.key.pause(4000);
//		String vobjtext = Constants.ForgotpasswordOR.getProperty("Changepasswordscreentitle");
//		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vobjtext));
//    	String Text = Constants.key.readText(vobjtext);
		LogCapture.info("user successfully navigates to Change Password screenas...");
	}
 
	@Then("^android user enters the New Password \"([^\"]*)\"$")
	public void android_user_enters_the_New_Password(String NewPassword) throws Throwable {
		String vObjNewpassword = Constants.HamburgermenuOR.getProperty("newpassword");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjNewpassword));
		Assert.assertEquals("PASS", Constants.key.click(vObjNewpassword));
		String vNewPassword = Constants.ANDROIDTestData.getProperty(NewPassword);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjNewpassword, vNewPassword));
		String vObjnewpasswordeye = Constants.HamburgermenuOR.getProperty("newpswdeye");
		Assert.assertEquals("PASS", Constants.key.click(vObjnewpasswordeye));
		Constants.key.pause(5);
		Constants.driver.hideKeyboard();
		LogCapture.info("User entered new password as " + vNewPassword+ "...");
 
	}
 
	@Then("^android user enters the Confirm Password \"([^\"]*)\"$")
	public void android_user_enters_the_Confirm_Password(String ConfirmPassword) throws Throwable {
		String vObjConfirmpassword = Constants.HamburgermenuOR.getProperty("ConfirmPass");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjConfirmpassword));
		Assert.assertEquals("PASS", Constants.key.click(vObjConfirmpassword));
		String vConfirmPassword = Constants.ANDROIDTestData.getProperty(ConfirmPassword);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjConfirmpassword, vConfirmPassword));
		String vObjconfirmpasswordeye = Constants.HamburgermenuOR.getProperty("confirmpswdeye");
		Assert.assertEquals("PASS", Constants.key.click(vObjconfirmpasswordeye));
		Constants.key.pause(5);
		Constants.driver.hideKeyboard();
		LogCapture.info("User entered confirm password as " + vConfirmPassword + "...");
	}
 
	@Then("^android user clicks on Save button$")
	public void android_user_clicks_on_Save_button() throws Throwable {
		String vObjSaveButton = Constants.HamburgermenuOR.getProperty("Save");
		Assert.assertEquals("PASS", Constants.key.click(vObjSaveButton));
		//Constants.key.click(vObjSaveButton);
		Constants.key.pause(2000);
		LogCapture.info("User clicks on Save button...");
	}
 
	@Then("^android user successfully navigates to login screen$")
	public void android_user_successfully_navigates_to_login_screen() throws Throwable {
		String vObjLogin = Constants.HamburgermenuOR.getProperty("loginscreen");
			
		String Text=Constants.key.readText(vObjLogin);
		
		LogCapture.info("User successfully lands on login screen and can observe " +Text+ " section...");
	}

	@Then("^android user selects the Enable Biometric$")
	public void android_user_selects_the_Enable_Biometric() throws Throwable {
		String vObjEnableBtometric = Constants.HamburgermenuOR.getProperty("EnableBio");
		//Assert.assertEquals("PASS", Constants.key.click(vObjEnableBtometric));
		Constants.key.click(vObjEnableBtometric);
		Constants.key.pause(5);
		LogCapture.info("User clicks on Enable biometric...");
	}
 
	@Then("^android user navigate to the Enable biometric screen$")
	public void android_user_navigate_to_the_Enable_biometric_screen() throws Throwable {
		String vObjBiometricScreen = Constants.HamburgermenuOR.getProperty("BiometricScreen");
		String Text = Constants.key.readText(vObjBiometricScreen);
		Constants.key.pause(2);
		LogCapture.info("User successfully lands on enable biometric screen and can observe " + Text + " option...");
	}
 
	@Then("^android user click on the toggle button to enable/disable the biometric$")
	public void android_user_click_on_the_toggle_button_to_enable_disable_the_biometric() throws Throwable {
		String vObjEnbableDisable = Constants.HamburgermenuOR.getProperty("Enable_disable");
		//Assert.assertEquals("PASS", Constants.key.click(vObjEnbableDisable));
		Constants.key.click(vObjEnbableDisable);
		Constants.key.pause(5000);
		LogCapture.info("User clicks on toggle button...");
	}
	@Then("^android user again clicks on hamburger menu$")
	public void android_user_again_clicks_on_hamburger_menu() throws Throwable {
		String vObjHamburger = Constants.HamburgermenuOR.getProperty("Hamburger");
		//Assert.assertEquals("PASS", Constants.key.click(vObjHamburger));
		Constants.key.click(vObjHamburger);
		Constants.key.pause(5);
		LogCapture.info("User again clicks on Hamburger Menu...");
	}
 
 
	@Then("^android user click on the logout button$")
	public void android_user_click_on_the_logout_button() throws Throwable {
		String vObjlogoutButton = Constants.HamburgermenuOR.getProperty("Logout");
		 Assert.assertEquals("PASS", Constants.key.click(vObjlogoutButton));
		Constants.key.pause(5);
		LogCapture.info("User clicks on logout button...");
	}
 
	@When("^android user clicks yes button$")
	public void android_user_clicks_yes_button() throws Throwable {
		 String vObjYeslogoutButton = Constants.HamburgermenuOR.getProperty("YesLogout");
		 Assert.assertEquals("PASS", Constants.key.click(vObjYeslogoutButton));
		LogCapture.info("User clicks on yes button...");
	}
 
	@Then("^android user successfully logout and lands on login screen$")
	public void android_user_successfully_logout_and_lands_on_login_screen() throws Throwable {
		String vObjLoginscreen = Constants.HamburgermenuOR.getProperty("loginscreen");
		String Text = Constants.key.readText(vObjLoginscreen);
		Constants.key.pause(2);
		LogCapture.info("User successfully lands on login screen and can observe " + Text + " title...");
	}
	@Then("^System will Give error message as Invalid Password$")
	public void system_will_Give_error_message_as_Invalid_Password() throws Throwable {
		 String vObjInvalidCurrentPassword = Constants.HamburgermenuOR.getProperty("InvalidCurrentPassword");
		 Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjInvalidCurrentPassword));
		 //Assert.assertEquals("PASS", Constants.key.verifyInnerText(vObjInvalidCurrentPassword, "Invalid password"));
		 String Text= Constants.key.readText(vObjInvalidCurrentPassword);
		 Constants.key.pause(2);
		 LogCapture.info("error message display as "+ Text +"...");
	}
 
 
	@Then("^System will Give error message as password must have eight digit,Uppercase,Lowercase,Number and special character$")
	public void system_will_Give_error_message_as_password_must_have_eight_digit_Uppercase_Lowercase_Number_and_special_character() throws Throwable {
	     String vObjNewPasswordCriteria = Constants.HamburgermenuOR.getProperty("NewPasswordCriteria");
		 Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjNewPasswordCriteria));
		 
		 Constants.key.pause(2);
		 Constants.driver.hideKeyboard();
		 LogCapture.info("Password criteria validation message is display");
	}
 
	@Then("^System will Give error message as Password must be same$")
	public void system_will_Give_error_message_as_Password_must_be_same() throws Throwable {
		 String vObjConfirmPasswordErrMsg = Constants.HamburgermenuOR.getProperty("ConfirmPasswordErrMsg");
		 Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjConfirmPasswordErrMsg));
		 Constants.key.pause(2);
		 LogCapture.info("error message display as password must be same");
	}
 
 
    @Then("^android user click on back button and navigate to pervious screen$")
    public void android_user_click_on_back_button_and_navigate_to_pervious_screen() throws Throwable {
    	String vObjBackbutton = Constants.HamburgermenuOR.getProperty("BackButton");
		 Assert.assertEquals("PASS", Constants.key.click(vObjBackbutton));
		 Constants.key.pause(4000);
		LogCapture.info("User clicks on Back button...");
    }
    

////////////////// forgot password ///////////////////////////////  

    
    @Then("^android user enters digitalid \"([^\"]*)\"$")
    public void android_user_enters_digitalid(String DigitalID) throws Throwable {
    	String vObjemail = Constants.ANDROIDShip2myidOR.getProperty("Digitalid");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjemail));
		String vUsername = Constants.ANDROIDTestData.getProperty(DigitalID);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjemail, vUsername));
		Constants.driver.hideKeyboard();
		LogCapture.info("User entered digitalid as " + vUsername +"...");
 
    }
    @Then("^android user clicks on forgot password hyperlink$")
    public void android_user_clicks_on_forgot_password_hyperlink() throws Throwable {
    	String vObjforgotpasslink = Constants.ForgotpasswordOR.getProperty("Forgotpwlink");
    	Assert.assertEquals("PASS",Constants.key.click(vObjforgotpasslink));
		Constants.key.pause(2);
		LogCapture.info("User clicks on forgot password hyperlink...");
    }
 
    @Then("^android user navigates to the forgot password screen$")
    public void android_user_navigates_to_the_forgot_password_screen() throws Throwable {
    	String vobjtext = Constants.ForgotpasswordOR.getProperty("forgotpswdscreentext");
    	String Text = Constants.key.readText(vobjtext);
    	LogCapture.info("User navigate to the forgot password screen, can observe " + Text + " title...");
    }
 
    @Then("^android user enters emailid \"([^\"]*)\"$")
    public void android_user_enters_emailid(String email) throws Throwable {
    	String vObjEmailID = Constants.ForgotpasswordOR.getProperty("EmailSendkeys");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjEmailID));
		String vemailID = Constants.ANDROIDTestData.getProperty(email);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjEmailID, vemailID));
		Constants.key.pause(5);
		Constants.driver.hideKeyboard();
		LogCapture.info("User enter email as " + vemailID + "...");
    }
 
    @Then("^android user click on send otp button$")
    public void android_user_click_on_send_otp_button() throws Throwable {
    	String vObjSendotp = Constants.ForgotpasswordOR.getProperty("SendOtp");
		Assert.assertEquals("PASS", Constants.key.click(vObjSendotp));
		Constants.key.pause(2);
		LogCapture.info("User clicks on send otp button...");
    }
 
    @Then("^android user navigates to the Reset password screen$")
    public void android_user_navigates_to_the_Reset_password_screen() throws Throwable {
    	
    	String vobjtext = Constants.ForgotpasswordOR.getProperty("resetpswdscreentext");
    	String Text = Constants.key.readText(vobjtext);
    	LogCapture.info("User navigates to the reset password screen, can observe " + Text + " title...");
    }
 
    @Then("^android user enters new password \"([^\"]*)\"$")
    public void android_user_enters_new_password(String newpassword) throws Throwable {
    	String vObjresetnewpassword = Constants.ForgotpasswordOR.getProperty("NEWPassword");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjresetnewpassword));
		String vnewwPassword = Constants.ANDROIDTestData.getProperty(newpassword);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjresetnewpassword, vnewwPassword));
		Constants.key.pause(5000);
		Constants.driver.hideKeyboard();
		LogCapture.info("User entered new password as " + vnewwPassword + "...");

    }
 
    @Then("^android user enters confirm password \"([^\"]*)\"$")
    public void android_user_enters_confirm_password(String confirmpassword) throws Throwable {
    	String vObjResetCnfrmpassword = Constants.ForgotpasswordOR.getProperty("CONFIRMPassword");
		String vCnfirmPassword = Constants.ANDROIDTestData.getProperty(confirmpassword);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjResetCnfrmpassword, vCnfirmPassword));
		Constants.key.pause(5000);
		Constants.driver.hideKeyboard();
		LogCapture.info("User entered confirm password as " + vCnfirmPassword + "...");

    }
 
    @Then("^android user clicks on submit button and navigate to login screen$")
    public void android_user_clicks_on_submit_button_and_navigate_to_login_screen() throws Throwable {
    	String vObjSubmitbutton = Constants.ForgotpasswordOR.getProperty("Submit");
    	Assert.assertEquals("PASS",Constants.key.click(vObjSubmitbutton));
		
		LogCapture.info("User clicks on Submit button and navigates to login screen...");
		Constants.key.pause(10000);
    }
    @Then("^android user clicks on phone icon$")
    public void android_user_clicks_on_phone_icon() throws Throwable {
    	String vObjPhoneIcon = Constants.ForgotpasswordOR.getProperty("phoneicon");
		 Constants.key.click(vObjPhoneIcon);
		 Constants.key.pause(10);
		LogCapture.info("User clicks on phone icon...");
    }
 
    @Then("^android user enters phone number \"([^\"]*)\"$")
    public void android_user_enters_phone_number(String PhoneNo) throws Throwable {
    	String vObjNumber = Constants.ForgotpasswordOR.getProperty("Number");
		Assert.assertEquals("PASS", Constants.key.eleLocatedDisplayed(vObjNumber));
		String vnumber = Constants.ANDROIDTestData.getProperty(PhoneNo);
		Assert.assertEquals(Constants.KEYWORD_PASS, Constants.key.writeInInput(vObjNumber, vnumber));
		Constants.key.pause(5);
		Constants.driver.hideKeyboard();
		
		LogCapture.info("User entered phone number as " + vnumber + "...");
    }
    
    @Then("^android user will observe the inline error message stating the password criteria$")
    public void android_user_will_observe_the_inline_error_message_stating_the_password_criteria() throws Throwable {
        
    	String vobjtext = Constants.ForgotpasswordOR.getProperty("resetpswdctiteriatext");
    	String Text = Constants.key.readText(vobjtext);
    	LogCapture.info("User enters invalid password, can observe " + Text + " as a inline error message...");
    }

    
    @Then("^android user will observe the inline error message$")
    public void android_user_will_observe_the_inline_error_message() throws Throwable {
        
    	String vobjtext = Constants.ForgotpasswordOR.getProperty("resetpswdnotmatchtext");
    	String Text = Constants.key.readText(vobjtext);
    	LogCapture.info("User enters confirm password not matching the new password, can observe " + Text + " as a inline error message...");
    }
    
 ///////////////// Personal validation messages //////////////
    
    @Then("^android user verifies the validation message for first name \"([^\"]*)\" when kept empty$")
    public void android_user_verifies_the_validation_message_for_first_name_when_kept_empty(String EmptyFname) throws Throwable {
       
    }

    @Then("^android user verifies the validation message for first name \"([^\"]*)\" when entered signle character$")
    public void android_user_verifies_the_validation_message_for_first_name_when_entered_signle_character(String SingleFname) throws Throwable {
        
    }

    @Then("^android user verifies the validation message for first name \"([^\"]*)\" when entered invalid input$")
    public void android_user_verifies_the_validation_message_for_first_name_when_entered_invalid_input(String InvalidFname) throws Throwable {
       
    }

    @Then("^android user verifies the validation message for first name \"([^\"]*)\" when exceeds the char limit of twenty$")
    public void android_user_verifies_the_validation_message_for_first_name_when_exceeds_the_char_limit_of_twenty(String charlimitFname) throws Throwable {
       
    }

    @Then("^android user verifies the validation message for last name \"([^\"]*)\" when kept empty$")
    public void android_user_verifies_the_validation_message_for_last_name_when_kept_empty(String EmptyLname) throws Throwable {
        
    }

    @Then("^android user verifies the validation message for last name \"([^\"]*)\" when entered signle character$")
    public void android_user_verifies_the_validation_message_for_last_name_when_entered_signle_character(String SingleLname) throws Throwable {
        
    }

    @Then("^android user verifies the validation message for last name \"([^\"]*)\" when entered invalid input$")
    public void android_user_verifies_the_validation_message_for_last_name_when_entered_invalid_input(String InvalidLname) throws Throwable {
        
    }

    @Then("^android user verifies the validation message for last name \"([^\"]*)\" when exceeds the char limit of twenty$")
    public void android_user_verifies_the_validation_message_for_last_name_when_exceeds_the_char_limit_of_twenty(String charlimitLname) throws Throwable {
        
    }
    
    //Notification
    
    @Then("^android user clicks on notification option on taskbar menu$")
    public void android_user_clicks_on_notification_option_on_taskbar_menu() throws Throwable {
        
    	Constants.key.pause(4000);
    	String vObjNotification = Constants.NotificationOR.getProperty("Notificatiobellicon");
    	Assert.assertEquals("PASS",Constants.key.click(vObjNotification));
		
		LogCapture.info("User clicks on notification option on taskbar menu...");
		
        
    }

    @Then("^android user lands on notification screen$")
    public void android_user_lands_on_notification_screen() throws Throwable {
        
    	String vobjNotificationtext = Constants.NotificationOR.getProperty("Notificationtext");
    	String Text = Constants.key.readText(vobjNotificationtext);
    	LogCapture.info("User lands on notification screen, can observe " + Text + " section...");
        
    }

    @Then("^android user clicks on New$")
    public void android_user_clicks_on_New() throws Throwable {

        Constants.key.pause(5000);
    	String vObjNewsection = Constants.NotificationOR.getProperty("Newsection");
    	Assert.assertEquals("PASS",Constants.key.click(vObjNewsection));
		
		LogCapture.info("User clicks on New under notification sections...");
       
    }

    @Then("^android user clicks on particular notification$")
    public void android_user_clicks_on_particular_notification() throws Throwable {
        
    	Constants.key.pause(5000);
    	String vObjNotification = Constants.NotificationOR.getProperty("Notification");
    	Assert.assertEquals("PASS",Constants.key.click(vObjNotification));
		
		LogCapture.info("User clicks on particular notification...");
    }

    @Then("^android user navigates to the deals for you screen for particular notification$")
    public void android_user_navigates_to_the_deals_for_you_screen_for_particular_notification() throws Throwable {
          
    	Constants.key.pause(5000);
//    	String vobjViewallscreen = Constants.NotificationOR.getProperty("Viewallscreen");
//    	String Text = Constants.key.readText(vobjViewallscreen);
    	LogCapture.info("User lands on the view all screen for particular notification...");
    }
    
    //deal detail screen/////
    
    @Then("^android user clicks on any deal on deals screen$")
    public void android_user_clicks_on_any_deal_on_deals_screen() throws Throwable {
      
    	Constants.key.pause(5000);
    	String vObjSelectingdeal = Constants.ANDROIDShip2myidOR.getProperty("Selectingdeal");
    	Assert.assertEquals("PASS",Constants.key.click(vObjSelectingdeal));
		
		LogCapture.info("User clicks on any deal on deals screen...");
    }

    @Then("^android user lands on deal details screen$")
    public void android_user_lands_on_deal_details_screen() throws Throwable {
        
    	try {
    	Constants.key.pause(5000);
    	String vobjCopycodeandclaimdeal = Constants.ANDROIDShip2myidOR.getProperty("Copycodeandclaimdeal");
    	String Text = Constants.key.readText(vobjCopycodeandclaimdeal);
    	LogCapture.info("User lands on deal details screen, can observe "+Text+ " Section...");
			}	
		 catch (Exception e) {
		
	    String vobjClaimeddeal = Constants.ANDROIDShip2myidOR.getProperty("Claimeddeal");
		String Text = Constants.key.readText(vobjClaimeddeal);
		String vobjClaimtag = Constants.ANDROIDShip2myidOR.getProperty("Claimtag");
		String Text1 = Constants.key.readText(vobjClaimtag);
		LogCapture.info("User lands on deal details screen, can observe "+Text+ " CTA with "+Text1+" Tag on deal image...");
		}
    }
    
    
    /////////////////////////////////////////
    
    @Then("^android user clicks on Help$")
    public void android_user_clicks_on_Help() throws Throwable {
    	
    	Constants.key.pause(5000);
    	String vObjHelp = Constants.ANDROIDShip2myidOR.getProperty("Help");
    	Assert.assertEquals("PASS",Constants.key.click(vObjHelp));
		
		LogCapture.info("User clicks on Help dropdown...");
        
    }

    @Then("^android user selects the FAQ option$")
    public void android_user_selects_the_FAQ_option() throws Throwable {
        
    	Constants.key.pause(5000);
    	String vObjSelectFAQ = Constants.ANDROIDShip2myidOR.getProperty("FAQ");
    	//Assert.assertEquals("PASS",Constants.key.click(vObjSelectFAQ));
    	Constants.key.click(vObjSelectFAQ);
    	String Text1 = Constants.key.readText(vObjSelectFAQ);
		LogCapture.info("User clicks on FAQ option" +Text1+"...");
		Constants.key.pause(5000);
		

		Set<String> contextNames = Constants.driver.getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextNames); //prints out something like NATIVE_APP \n WEBVIEW_1
		}
		Constants.driver.context((String) contextNames.toArray()[1]); // set context to WEBVIEW_1

		//do some web testing findElement(By.cssSelector(".green_button")).click();
		//String myText = Constants.key.click();

		//Constants.driver.context("NATIVE_APP");

		// do more native testing if we want

		//Constants.driver.quit();
    }
    
}
