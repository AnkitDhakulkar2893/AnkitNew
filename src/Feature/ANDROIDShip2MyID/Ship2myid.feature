Feature: Ship2myid login screen
//
  Background: 
    Given android app is installed on the device and launched successfully
    When android user clicks on login on App Intro screen

  @AndroidShip2MyIDlogin_01
  Scenario Outline: android user should be able to login using Digital ID on Ship2myid App
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen

    Examples: 
      | DigitalID | Password |
      | username | Pass     |

  @AndroidShip2MyIDupdateprofile_01
  Scenario Outline: To verify that user should be able to Update Personal details.
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    Then android user click on the profile icon
    Then android user click on the Personal tab
    And android user click on the Edit icon
    Then android user updates first name "<Fname>" middle name "<Mname>"last name "<Lname>"
    Then android user selects the DOB "<DOB>"
    And android user selects the Gender "<Gender>"
    And android user click on Save button

    Examples: 
      | DigitalID | Password | Fname     | Mname      | Lname    | DOB       | Gender |
      | username | Pass     | Firstname | Middlename | Lastname | 4/11/1992 | Male   |
      
  @AndroidShip2MyIDupdateprofile_02
  Scenario Outline: To verify the validation messages when entered invalid input on Personal details.
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    Then android user click on the profile icon
    Then android user click on the Personal tab
    And android user click on the Edit icon
    Then android user verifies the validation message for first name "<EmptyFname>" when kept empty
    Then android user verifies the validation message for first name "<SingleFname>" when entered signle character
    Then android user verifies the validation message for first name "<InvalidFname>" when entered invalid input
    Then android user verifies the validation message for first name "<charlimitFname>" when exceeds the char limit of twenty
    Then android user verifies the validation message for last name "<EmptyLname>" when kept empty
    Then android user verifies the validation message for last name "<SingleLname>" when entered signle character
    Then android user verifies the validation message for last name "<InvalidLname>" when entered invalid input
    Then android user verifies the validation message for last name "<charlimitLname>" when exceeds the char limit of twenty
   
    Examples: 
      | DigitalID | Password | EmptyFname| SingleFname| InvalidFname|charlimitFname| EmptyLname |SingleLname|InvalidLname| charlimitLname|
      | username  | Pass     | Empty     | Single     | Invalid     |CharFlimit    | EmptyL     | SingleL   |InvalidL    |CharLlimit     |
      
       
   @AndroidShip2MyIDdealdetail_03
   Scenario Outline: android user should be able to login using Digital ID on Ship2myid App
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    Then android user clicks on any deal on deals screen
    Then android user lands on deal details screen

    Examples: 
      | DigitalID | Password |
      | username | Pass     |
      