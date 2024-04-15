Feature: Ship2myid Forgot Password screen

  Background: 
    Given android app is installed on the device and launched successfully
    When android user clicks on login on App Intro screen

  @AndroidShip2MyIDForgotpass_01
  Scenario Outline: android user should be able to perform Forgot Password journey using email
    Then android user enters digitalid "<DigitalID>"
    Then android user clicks on forgot password hyperlink
    Then android user navigates to the forgot password screen
    And android user enters emailid "<email>"
    #Then android user navigates to the Otp screen
    #And android user enters otp "<otp>"
    Then android user click on send otp button
    And android user navigates to the Reset password screen
    Then android user enters new password "<newpassword>"
    And android user enters confirm password "<confirmpassword>"
    Then android user clicks on submit button and navigate to login screen

    Examples: 
      | DigitalID | email            | newpassword      | confirmpassword    |
      | username2 | emailidfgtpswd | resetnewpassword | resetcnfrmpassword |

  @AndroidShip2MyIDForgotpass_02
  Scenario Outline: android user should be able to perform Forgot Password journey using phone
    Then android user enters digitalid "<DigitalID>"
    Then android user clicks on forgot password hyperlink
    Then android user navigates to the forgot password screen
    And android user clicks on phone icon
    And android user enters phone number "<PhoneNo>"
    #Then android user navigates to the Otp screen
    #And android user enters otp "<otp>"
    Then android user click on send otp button
    And android user navigates to the Reset password screen
    Then android user enters new password "<newpassword>"
    And android user enters confirm password "<confirmpassword>"
    Then android user clicks on submit button and navigate to login screen

    Examples: 
      | DigitalID | PhoneNo         | newpassword      | confirmpassword    |
      | username3 | Forgotpswdmobno | resetnewpassword | resetcnfrmpassword |

  @AndroidShip2MyIDForgotpass_03
  Scenario Outline: To Validate System behaviour when user enters invalid New password in forgot password journey
    Then android user enters digitalid "<DigitalID>"
    Then android user clicks on forgot password hyperlink
    Then android user navigates to the forgot password screen
    And android user clicks on phone icon
    And android user enters phone number "<PhoneNo>"
    #Then android user navigates to the Otp screen
    #And android user enters otp "<otp>"
    Then android user click on send otp button
    And android user navigates to the Reset password screen
    Then android user enters new password "<newpassword>"
    And  android user will observe the inline error message stating the password criteria

    Examples: 
      | DigitalID | PhoneNo         | newpassword      |
      | username3 | Forgotpswdmobno | Invalidresetpass |

  @AndroidShip2MyIDForgotpass_04
  Scenario Outline: To Validate if system is able to met the Confirm Password with new password
    Then android user enters digitalid "<DigitalID>"
    Then android user clicks on forgot password hyperlink
    Then android user navigates to the forgot password screen
    And android user clicks on phone icon
    And android user enters phone number "<PhoneNo>"
    #Then android user navigates to the Otp screen
    #And android user enters otp "<otp>"
    Then android user click on send otp button
    And android user navigates to the Reset password screen
    Then android user enters new password "<newpassword>"
    And android user enters confirm password "<confirmpassword>"
    And android user will observe the inline error message 

    Examples: 
      | DigitalID | PhoneNo    | newpassword      | confirmpassword  |
      | username3 | Forgotpswdmobno | resetnewpassword | Invalidcnfrmpass |
