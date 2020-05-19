
@LoginTest @smoke_test
Feature: User should be able to login

Background:
  Given user is on login page
  Scenario: Authorized user able to login

    Then user enters credentials
    Then authorized user should be able to login
    Then account summary page should be displayed



  Scenario: User with wrong username can't login

    Then user enters credentials with Wrong UserName
    Then user should not able to login
    Then login error message should be displayed


  Scenario: User with wrong password should not able login

    Then user enters credentials with Wrong Password
    Then user should not able to login
    Then login error message should be displayed


  Scenario: User with Blank Username should not able to login

    When user enters credentials with Blank Username
    Then user should not able to login
    Then login error message should be displayed


  Scenario: User with Blank Password should not able to login

    When user enters credentials with Blank Password
    Then user should not able to login
    Then login error message should be displayed





