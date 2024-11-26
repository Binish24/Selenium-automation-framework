Feature: create account Functionality on amazon

  Scenario: creating an account on amazon website
    Given I have to be on amazon registration page
    When I have type my first and lastname on your account field
    When I have to add my phone number or email address on " Mobile or email address" field
    When I have to enter password on "Password" field
    When I have to re-enter password on "Re-enter password" field
    When I have to click on "Continue" button
    Then I have see and be on expected page


