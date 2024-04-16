Feature: Ship2myid Login screen
#newchanges123
  Background: 
    Given android app is installed on the device and launched successfully
    When android user clicks on login on App Intro screen

  @AndroidShip2MyIDHamburger_01
  Scenario Outline: android user should be able to Change Password
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    And android user clicks on hamburger menu
    Then android user clicks on Settings
    And android user selects the Change Password
    And android user enters the Current Password "<CurrentPassword>"
    Then android user clicks on Confirm button
    Then android user successfully navigates to Change Password screen
    And android user enters the New Password "<NewPassword>"
    And android user enters the Confirm Password "<ConfirmPassword>"
    Then android user clicks on Save button
    Then android user successfully navigates to login screen

    Examples: 
      | DigitalID | Password | CurrentPassword | NewPassword | ConfirmPassword |
      | username3 | Password | currentpswd     | Newpw       | Confirmpassword |

  @AndroidShip2MyIDHamburger_02
  Scenario Outline: android user should be able to Enable biometric
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    And android user clicks on hamburger menu
    Then android user clicks on Settings
    And android user selects the Enable Biometric
    And android user navigate to the Enable biometric screen
    And android user click on the toggle button to enable/disable the biometric
    And android user again clicks on hamburger menu
    And android user click on the logout button
    When android user clicks yes button
    Then android user successfully logout and lands on login screen

    Examples: 
      | DigitalID | Password  |
      | username3 | Password3 |

  @AndroidShip2MyIDHamburger_03
  Scenario Outline: To Validate System behaviour when user enters invalid current password
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    And android user clicks on hamburger menu
    Then android user clicks on Settings
    And android user selects the Change Password
    And android user enters the Current Password "<CurrentPassword>"
    Then android user clicks on Confirm button
    Then System will Give error message as Invalid Password

    Examples: 
      | DigitalID | Password  | CurrentPassword    |
      | username3 | Password3 | invalidcurrentpass |

  @AndroidShip2MyIDHamburger_04
  Scenario Outline: To Validate if system is able to met the Password criteria or not
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    And android user clicks on hamburger menu
    Then android user clicks on Settings
    And android user selects the Change Password 
    And android user enters the Current Password "<CurrentPassword>"
    Then android user clicks on Confirm button
    Then android user successfully navigates to Change Password screen
    And android user enters the New Password "<NewPassword>"
    Then System will Give error message as password must have eight digit,Uppercase,Lowercase,Number and special character

    Examples: 
      | DigitalID | Password  | CurrentPassword | NewPassword    |
      | username3 | Password3 | currentpswd     | InvalidNewpass |

  @AndroidShip2MyIDHamburger_05
  Scenario Outline: To Validate if system is able to met the Confirm Password with New password
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    And android user clicks on hamburger menu
    Then android user clicks on Settings
    And android user selects the Change Password
    And android user enters the Current Password "<CurrentPassword>"
    Then android user clicks on Confirm button
    Then android user successfully navigates to Change Password screen
    And android user enters the New Password "<NewPassword>"
    And android user enters the Confirm Password "<ConfirmPassword>"
    Then System will Give error message as Password must be same

    Examples: 
      | DigitalID | Password  | CurrentPassword | NewPassword | ConfirmPassword |
      | username3 | Password3 | currentpswd     | newpass     | Cnfrmpassword   |
      
  @AndroidShip2MyIDHamburger_06
  Scenario Outline: android user should be able to click on back button 
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    And android user clicks on hamburger menu
    Then android user clicks on Settings
    And android user selects the Change Password
    And android user enters the Current Password "<CurrentPassword>"
    Then android user clicks on Confirm button
    Then android user successfully navigates to Change Password screen
    And android user click on back button and navigate to pervious screen
    
    Examples: 
      | DigitalID | Password  | CurrentPassword |
      | username3 | Password3 | currentpswd     |
      
  @Clickingonhyperlink
  Scenario Outline: android user should be able to click on back button 
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    And android user clicks on hamburger menu
    Then android user clicks on Help
    And android user selects the FAQ option
    
    
    Examples: 
      | DigitalID | Password  |
      | username  | Pass      |