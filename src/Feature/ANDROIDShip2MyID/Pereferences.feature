Feature: Ship2myid personalize your preferences

Background: 
 Given android app is installed on the device and launched successfully
 When android user clicks on login on App Intro screen
   
   
@AndroidShip2MyIDpreferences_1
Scenario Outline: android user should be able to modify the preferences 
   
 Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
 Then android user successfully navigates to deals screen
 Then android user clicks on personalize your preferences on the task bar
 Then android user lands on personalize your preferences screen
 Then android user selects some categories and click on choose brand/store button
 Then android user lands on choose brand screen
 Then android user selects brands from specific categories
 Then android user clicks on view deals button
 Then android user successfully updated the preferences selection and lands on deals screen
 
Examples: 
  | DigitalID | Password |
  | username1 | Pass     | 