@account_activity
Feature: Account Activity page
  As a user, I am able to see Account Activity



  Scenario: Account	Activity
    Given user is on login page
    Then user enters credentials
    And user navigate Account Activity page
    Then page title Zero - Account Activity displayed
    Then In	the	Account	drop down default option should	be Savings
    And Account	drop down should have following
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    Then Transactions table should have column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |


