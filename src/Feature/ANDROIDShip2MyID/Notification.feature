Feature: Ship2myid Login screen

 Background: 
    Given android app is installed on the device and launched successfully
    When android user clicks on login on App Intro screen

  @AndroidShip2MyIDnotification_01
  Scenario Outline: android user should be able to login using Digital ID on Ship2myid App
    Then android user enters digitalid "<DigitalID>" password "<Password>" clicks on login button
    Then android user successfully navigates to deals screen
    And  android user clicks on notification option on taskbar menu
    Then android user lands on notification screen
    Then android user clicks on New
    Then android user clicks on particular notification 
    Then android user navigates to the deals for you screen for particular notification

    Examples: 
      | DigitalID     | Password |
      | Digitalidnoti | Passnoti |