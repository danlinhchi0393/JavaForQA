Feature: As a User I want to log in to Lazada system so that I can buy something form there
  
  Scenario: The User should see the require input data message for corresponding input with out the data
    Given The user is staying login page
     When The user leave all file are blank
     And  The user click Login butotn
     Then  The user should see the corresponding error message on below input field
     
  Scenario: The user should see the password as clear text on the password field
    Given The user is staying login page
     When The user input something on password field
     And  The user click on Show password button
     Then The user can see the password as plan text
  
    Scenario Outline: The user should see the profile page with valid credential
    Given The user is staying login page
     When The user provide <username> and <password>
     And  The user click Login button
     Then The user should see the profile information

  Example: 
  	| username			|	password		|
    |khanhtran86		|	abc123456		|
    |khanh.tx@live.com	|	abc123456		|
