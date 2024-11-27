Feature: Create amazon account

  Background:
    Given I am on the amazon web page
    When I click on sign in button
    And I click on Create amazon account button


 Scenario Outline: Successfully create account with valid email

    And I enter "<FullName>" as value for your name field
    And I enter "<Email>" as a value for Mobile number or email field
    And I enter "<Password>" as valid password value for password field
    And I re-enter "<Re-enter>" as valid password  value in Re-enter password field
    And I click on verify email button
    And I should be navigated to OPT page
    And I enter the valid OPT
    And I click on create your amazon account button
    And I should see the amazon dashboard

Examples:

   | FullName | Email  | Password | Re-enter |
   | Nabiullah Benish | benish.ranna | 2131231@#@# | 213213132@#@|



  Scenario Outline: Successfully create account with valid phone number

    And I enter "<FullName>" as value for your name field
    And I enter "<Phone Number>" as a value for Mobile number or email field
    And I enter "<Password>" as valid password value for password field
    And I re-enter "<Re-enter>" as valid password  value in Re-enter password field
    And I click on verify phone number button
    And I should be navigated to OPT page
    And I enter the valid OPT
    And I click on create your amazon account button
    And I should see the amazon dashboard


Examples:




#Feature: Amazon Login Feature
#
#  Scenario Outline: Creating an Amazon with valid credentials
#    Given the user is on the Amazon homepage
#    When the user clicks on the "Sign in" button
#    And the user clicks on the "Create your Amazon account" button on the second page
#    And the user enters "<firstName>" and "<lastName>" in their respective input fields
#    And the user enters "<password>" and "<passwordConfirmation>" in their respective fields
#    And the user clicks on the "Continue" button
#    And the user enters the OTP confirmation and clicks on "Create your Amazon account"
#    Then the user should be navigated to the Amazon homepage
#
#    Examples:
#      | firstName | lastName | password | passwordConfirmation |
#      | Aseel     | Rahmani  | asdf@123 | asdf@123             |
#
#
#Feature: Amazon Account Creation
#  Scenario Outline: Amazon Account Form
#    Given User is the amazon register page
#    Then  User will enter valid date in fields
#    Then  User will click on Your name field and enter "<first and last Name>"
#    Then User will click on Mobile or email field and enter "< Mobile or email>"
#    Then User will click on Password field and enter "<password >"
#    Then User will click re enter password and enter same password "<password>"
#    Then User will click on Continue Button
#    Examples:
#      | first and last Name | Mobile or email | password | password |
#      | Shahzad khan        | 245857985       | khan123  | khan123  |
#      | Naeem Khan          | naeem@gmail.com | khan124  | khan124


