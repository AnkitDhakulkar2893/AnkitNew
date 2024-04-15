$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Ship2myid.feature");
formatter.feature({
  "line": 1,
  "name": "Ship2myid login screen",
  "description": "",
  "id": "ship2myid-login-screen",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "android user should be able to login using Digital ID on Ship2myid App",
  "description": "",
  "id": "ship2myid-login-screen;android-user-should-be-able-to-login-using-digital-id-on-ship2myid-app",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@AndroidShip2MyIDlogin_01"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "android user enters digitalid \"\u003cDigitalID\u003e\" password \"\u003cPassword\u003e\" clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "android user successfully navigates to deals screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "ship2myid-login-screen;android-user-should-be-able-to-login-using-digital-id-on-ship2myid-app;",
  "rows": [
    {
      "cells": [
        "DigitalID",
        "Password"
      ],
      "line": 13,
      "id": "ship2myid-login-screen;android-user-should-be-able-to-login-using-digital-id-on-ship2myid-app;;1"
    },
    {
      "cells": [
        "username",
        "Pass"
      ],
      "line": 14,
      "id": "ship2myid-login-screen;android-user-should-be-able-to-login-using-digital-id-on-ship2myid-app;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 30630600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "android app is installed on the device and launched successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "android user clicks on login on App Intro screen",
  "keyword": "When "
});
formatter.match({
  "location": "ANDROIDShip2myidAppStepDefinition.android_app_is_installed_on_the_device_and_launched_successfully()"
});
formatter.result({
  "duration": 31065873400,
  "status": "passed"
});
formatter.match({
  "location": "ANDROIDShip2myidAppStepDefinition.android_user_clicks_on_login_on_App_Intro_screen()"
});
formatter.result({
  "duration": 3694345100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "android user should be able to login using Digital ID on Ship2myid App",
  "description": "",
  "id": "ship2myid-login-screen;android-user-should-be-able-to-login-using-digital-id-on-ship2myid-app;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@AndroidShip2MyIDlogin_01"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "android user enters digitalid \"username\" password \"Pass\" clicks on login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "android user successfully navigates to deals screen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 31
    },
    {
      "val": "Pass",
      "offset": 51
    }
  ],
  "location": "ANDROIDShip2myidAppStepDefinition.android_user_enters_digitalid_password_clicks_on_login_button(String,String)"
});
formatter.result({
  "duration": 8597605800,
  "status": "passed"
});
formatter.match({
  "location": "ANDROIDShip2myidAppStepDefinition.android_user_successfully_navigates_to_deals_screen()"
});
formatter.result({
  "duration": 8816795000,
  "status": "passed"
});
formatter.after({
  "duration": 1185249000,
  "status": "passed"
});
});