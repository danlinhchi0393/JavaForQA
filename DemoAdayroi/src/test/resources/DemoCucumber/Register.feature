Feature: As a User I want to register to Sendo that I can buy something form there
  
 Scenario: The User should see the require input data message for corresponding input
 Given The user is staying register page
 When The user leave all file are blank and click Next button
 Then  The user should see the corresponding error message on below input field