$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Amazon.feature");
formatter.feature({
  "name": "To validate the login functionality for amazon",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate the login with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@data"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the amz url",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonLogin.to_launch_the_amz_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the invalid username or phno in email field",
  "rows": [
    {
      "cells": [
        "emailone",
        "java1@gmail.com"
      ]
    },
    {
      "cells": [
        "emailtwo",
        "data@gmail.com"
      ]
    },
    {
      "cells": [
        "emailthree",
        "python@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.to_pass_the_invalid_username_or_phno_in_email_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the invalid password in password field",
  "rows": [
    {
      "cells": [
        "passwordone",
        "passwordtwo",
        "passwordthree"
      ]
    },
    {
      "cells": [
        "aby12@",
        "yuj@123",
        "mng@456"
      ]
    },
    {
      "cells": [
        "java@789",
        "python@987",
        "sel@145"
      ]
    },
    {
      "cells": [
        "pom@890",
        "maven@654",
        "junit@347"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.to_pass_the_invalid_password_in_password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonLogin.toClickTheSigninButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Facebook.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To validate the valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLogin.toLaunchTheUrlOfTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid username in email field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.to_pass_the_valid_username_in_email_field()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.FacebookLogin.to_pass_the_valid_username_in_email_field(FacebookLogin.java:33)\r\n\tat ✽.To pass the valid username in email field(src/test/resources/Facebook.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To pass the valid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.to_pass_the_valid_password_in_password_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the positive and negative testcase in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Launch the application url in facebook",
  "keyword": "When "
});
formatter.step({
  "name": "pass the positive and negative \"\u003cemail datas\u003e\" in email field",
  "keyword": "And "
});
formatter.step({
  "name": "pass the positive and negative \"\u003cpassword datas\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email datas",
        "password datas"
      ]
    },
    {
      "cells": [
        "abc@gmail.com",
        "abc1234"
      ]
    },
    {
      "cells": [
        "dtj@gmail.com",
        "dtj5678"
      ]
    },
    {
      "cells": [
        "rsp@gmail.com",
        "rsp3567"
      ]
    },
    {
      "cells": [
        "lgk@gmail.com",
        "lgk8723"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the positive and negative testcase in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the application url in facebook",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeCase.launchTheApplicationUrlInFacebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the positive and negative \"abc@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.pass_the_positive_and_negative_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the positive and negative \"abc1234\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.pass_the_positive_and_negative_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative testcase in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the application url in facebook",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeCase.launchTheApplicationUrlInFacebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the positive and negative \"dtj@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.pass_the_positive_and_negative_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the positive and negative \"dtj5678\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.pass_the_positive_and_negative_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative testcase in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the application url in facebook",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeCase.launchTheApplicationUrlInFacebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the positive and negative \"rsp@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.pass_the_positive_and_negative_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the positive and negative \"rsp3567\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.pass_the_positive_and_negative_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative testcase in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the application url in facebook",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeCase.launchTheApplicationUrlInFacebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the positive and negative \"lgk@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.pass_the_positive_and_negative_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the positive and negative \"lgk8723\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.pass_the_positive_and_negative_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeCase.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});