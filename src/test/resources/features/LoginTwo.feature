Feature: Login Functionality


  Scenario: login to facebook news feed page
    Given The user should be on the login page
    When User should enter the username and password
    When User should click on login button
    Then User will be entered on news feed page and see what he expected


    Scenario Outline: Login to facebook news feed page
      Given The User should be on the login page
      When User should enter the "<username>" and "<password>"
      When User should click on login button
      Then User will be on news feed page

      Examples:
        |  username       | password   |
        | validUserName   | validPass  |

      Scenario Outline: Unsuccessful login to facebook news feed page
        Given The user should be on the login page
        When The user enters the "<username>" and invalid "<password>"
        When User should click on the login button
        Then User should receive "<invalid_password_message>"

        Examples:
        | username      |  password       | invalid_password_message|
        | validUserName | invalidPassword |   incorrect  password   |


        Scenario Outline: Unsuccessful login to facebook news feed page
          Given The user be on the login page
          When The user enters invalid "<username> and "<password>"
          When The user click on login button
          Then The user will face with "<invalid username message>"

          Examples:
          | username       |password      | invalid username message   |
          |invalid username|valid password|invalid / incorrect username|


          Scenario Outline: Unsuccessful login to facebook news feed page
            Given The user is on login page
            When The user enters invalid "<username>" and invalid "<password>"
            When The user click on login button
            Then The user faces with "<unsuccessful login message>"

            Examples:
            | username         | password         |      unsuccessful login message       |
            | invalid username | invalid password | incorrect username, incorrect password|




