@Feature1
Feature: To validate the login functionality for amazon

  @sanity @data
  Scenario: To validate the login with invalid username and invalid password
    When To launch the amz url
    
    # One dimentional map
    And To pass the invalid username or phno in email field
      | emailone   | java1@gmail.com  |
      | emailtwo   | data@gmail.com   |
      | emailthree | python@gmail.com |
      
    And To click the continue button
    
    # Two dimentional map
    And To pass the invalid password in password field
      | passwordone | passwordtwo | passwordthree |
      | aby12@      | yuj@123     | mng@456       |
      | java@789    | python@987  | sel@145       |
      | pom@890     | maven@654   | junit@347     |
      
    And to click the signin button
