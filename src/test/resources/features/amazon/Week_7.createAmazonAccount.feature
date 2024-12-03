Feature: Create amazon account

  Background:
    Given The user is on the amazon home page
    When The user click on Hello, sign in Account & List button
    And The user click on Create your Amazon account button


  Scenario Outline: : successfully create account with valid email

  When I will enter "<FullName" as value for your name field
  And I will enter "<Email>" as value for email or phone number field
  And I will enter "<Password>" as valid password value for password field
  And I will re-enter "<Re_enter_password>" as a valid password value for re-enter password field
  And I click on verify email button
  And I should be navigated to OPT page
  And I enter the valid OTP
  And I click on create your amazon account button
  And I should see the amazon dashborad

    Examples:
    |   FullName |  Email                 | Password    | Re_enter_password |
    | JohoDoe    | benish.ranna@gmail.com | benish132    | benish123|



  Scenario Outline: : successfully create account with valid phone number

    When I will enter "John" as value for your name field
    And I will enter "5102258296" as value for email or phone number field
    And I will enter "benish123" as valid password value for password field
    And I will enter "benish" as a valid password value for re-enter password field
    And I click on verify mobile number button
    And I should be navigated to OPT page
    And I enter the valid OTP
    And I click on create your amazon account button
    And I should see the amazon dashborad


#  Scenario Outline: create successful amazon account
#    Given The user is on the amazon home page
#    When The user click on Hello, sign in Account & List button
#    And The user click on Create your Amazon account button
#    And The user enter "<name>" on Your name input field
#    And The user enter "<email>" as value for Mobile number or email input field
#    And The user enter "<password>" as valid password value for Password input field
#    And The user enter "re-enter password>" as valid password value for Re-enter password
#    And The user click on verify email button
#    And The user should be navigated to OPT page
#    And The user enter the valid OTP
#    And The user click on create your amazon account button
#    Then The user see the amazon dashboard

    Examples:
      |  name  |   email                |   password   | re-enter password  |
      | benish | benish.ranna@gmail.com | 1231231312   | 1231231312         |