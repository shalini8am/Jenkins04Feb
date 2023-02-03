@Feature2
Feature: To validate the login functionality
  
  @smoke @sanity
  Scenario: To validate the valid username and valid password
    When To launch the url of the application
    And To pass the valid username in email field
    And To pass the valid password in password field
    And To click the login button

  @Regression
  Scenario Outline: To validate the positive and negative testcase in login field
    When Launch the application url in facebook
    And pass the positive and negative "<email datas>" in email field
    And pass the positive and negative "<password datas>" in password field
    And Click the login button
   

    Examples: 
      | email datas   | password datas |
      | abc@gmail.com | abc1234        |
      | dtj@gmail.com | dtj5678        |
      | rsp@gmail.com | rsp3567        |
      | lgk@gmail.com | lgk8723        |
