Feature: create account Functionality on amazon

  Scenario: creating an account on amazon website
    Given I have to be on amazon registration page
    When I have type my first and lastname on your account fieldRe-enter password
    When I have to add my phone number "5234530258" as Mobile or email address" field
    When I have to enter "123123!@@" as "Password" field
    When I have to "123123!@@" as "Re-enter password" field
    When I have to click on "Continue" button
    Then I have see and be on expected page


