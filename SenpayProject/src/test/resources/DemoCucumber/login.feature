Feature: As a User I want to log in to Senpay
  
  Scenario: The User should see the require input data message for corresponding input with out the data
    Given The user is staying login page
     When The user input valid phone number and The user click Next butotn
     When The user input valid pincode and The user click Login button
     Then  The user should see homepage
