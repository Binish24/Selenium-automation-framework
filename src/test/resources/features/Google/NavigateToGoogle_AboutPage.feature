Feature: Navigation to Google

  Scenario: Navigate to Google, About Page
    Given I am on the google main web page
    When I click on about button
    Then I should see the about page