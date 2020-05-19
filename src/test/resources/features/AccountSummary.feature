@Account_summary
Feature: Accounts Summary page
  As a user, I am able to see Account summary

  Background: open login page
    Given user is on login page
    Then user enters credentials
  Scenario: Account Summary

    Then page title 	Zero – Account Summary displayed
    And Summary page should have following
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Verify Credit Account table column names
    And Credit	Accounts table	must have columns

      | Account     |
      | Credit Card |
      | Balance     |

