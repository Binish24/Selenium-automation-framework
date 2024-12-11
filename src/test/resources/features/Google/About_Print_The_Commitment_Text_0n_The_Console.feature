Feature: Google Navigation

  Scenario: Grab the text on Commitment page and print on the console
    Given I am on the google main web page
    When I click on about button
    And I click on commitment button
    And I grab the text on the commitment page
    Then I should on the commitment page