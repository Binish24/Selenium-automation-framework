Feature: search Functionality on amazon

Scenario Outline: : search for products on amazon
Given  I am on amazon home page
When I enter a product name on "< search_query>"
And I click on search button
Then I see the result of the search on <search_result>"

  Examples:

  | search_query | search_result|
  | OCA book     | OCA Certification book|
  | JAVA book    | JAVA general guideline|



