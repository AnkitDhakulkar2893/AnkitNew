Feature: Ship2myid signup screen
#hello
Background: 
 Given android app is installed on the device and launched successfully
 
   
   
@AndroidShip2MyIDSignup_01
Scenario Outline: android user should be able to signup successfully on Ship2myid App 
   
 When android user clicks on signup on App Intro screen
 Then android user enters new phone number "<Phonenumber>"
 Then android user clicks on send otp button
 Then android user enters the otp
 Then android user lands on create digital id screen click on i understand button
 Then android user enters universal digital id "<DigitalD>" clicks on check availability 
 Then android user clicks on continue button
 Then android user enters password "<password>" confirm password "<Cpassword>" clicks on continue button
 Then android user lands on digital id password creatred successfully screen clicks on i understand button
 Then android user enters first name "<Firstname>" and "<Lastname>"
 Then android user clicks on terms privacy policy check box
 Then android user clicks on signup
 Then android usersuccessfully sign up and lands on personalize your preferences screen.
 
 
Examples: 
  | Phonenumber  | DigitalD      | password      | Cpassword        | Firstname  | Lastname  |
  | SphoneNumber | SUnidigitalid | SNewPassword  | SConfirmpassword | Sfirstname | Slastname | 

  
@AndroidShip2MyIDSignup_02
Scenario Outline: android user should be able to signup successfully on Ship2myid App using email on max otp alert screen 
   
 When android user clicks on signup on App Intro screen
 Then android user enters new phone number "<Phonenumber>"
 Then android user clicks on send otp button
 Then android user enters inavlid otp "<OTP>"five times
 Then android user lands on maximum attempt to get otp screen
 Then android user clicks on add email hyperlink
 Then android user enters the email "<Email>" on email popup and click on send otp
 Then android user enters the otp and clicks o verify button
 Then android user lands on email added successfully popup and click on continue button
 Then android user lands on maximum attempt to get otp screen with email prefilled andclick on continue button
 Then android user lands on create digital id screen click on i understand button
 Then android user enters universal digital id "<DigitalD>" clicks on check availability 
 Then android user clicks on continue button
 Then android user enters password "<password>" confirm password "<Cpassword>" clicks on continue button
 Then android user lands on digital id password creatred successfully screen clicks on i understand button
 Then android user enters first name "<Firstname>" and "<Lastname>"
 Then android user clicks on terms privacy policy check box
 Then android user clicks on signup
 Then android usersuccessfully sign up and lands on personalize your preferences screen.
 
 
Examples: 
  | Phonenumber  |Email  |OTP |DigitalD      | password      | Cpassword        | Firstname  | Lastname  |
  | SphoneNumber |emailid|otp |SUnidigitalid | SNewPassword  | SConfirmpassword | Sfirstname | Slastname | 
  
  
  