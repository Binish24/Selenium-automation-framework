Feature: Create X-account

  Scenario Outline: Create an account on X
    Given I am on X-home page
    When I click on create account button
    And I enter "<Name>" as value for name field
    And I enter "<PhoneNumber>" as value for phone field
    And I select "<Month>" to pass the first steps Date of Birth
    And I select "<Day>" to pass the second steps Date of Birth
    And I select "<Year>" to pass the the third and last steps Date of Birth
    Then I click on next button

    Examples:

    |    Name   |  Phone  | Month  |  Day | Year  |
    | Zabiullah | 3123112 | May    |  21  | 2024  |