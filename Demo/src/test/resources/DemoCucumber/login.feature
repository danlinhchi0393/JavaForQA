Feature: As a User I want to log in to Testmaster
  
  Scenario Outline: The User should see the require input data message for corresponding input with out the data
    Given The user is staying login page
     When The user input invalid <email> and <pass> The user click Login butotn
     Then  The user should see the popup error message
Examples:
|email             |pass|
|chindl@sendo.vn   |123456|
|abc@gmail.com     |pass|