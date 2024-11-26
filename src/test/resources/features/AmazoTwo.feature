Feature: search Functionality on amazon

  Scenario Outline: searching for new products on amazon
    Given The user is on the amazon home page
    When The user enter the name of "<desired items>"
    When The user click on search button
    Then The user see the "<search_result>"

    Examples:

    | desired items  |        search_result                    |
    | Sun glass      | LINVO polarized men and women sun glass |
    | Rain coat      | TOMSHOO multifunctional rain coat       |
    | Sport shoes    | Under Armour                            |



    Scenario Outline: looking for number of products on amazon
      Given I am on amazon home page
      When I enter the name of "<products_name>" on searchbar
      And I click on the search button
      Then I see the "<search_result>"

      Examples:

      | products_name  |             search_result                                      |
      | iPhone 16      | Apple iPhone 16, US Version, 128GB, Black - Unlocked (Renewed) |
      | iPhone 16 case | OtterBox iPhone 16 Pro Max Defender Series Case - Black        |
      | MacBook Air    | 2020 Apple MacBook Air with Apple M1 Chip                      |




