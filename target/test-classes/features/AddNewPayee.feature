@addnew
Feature:Add	new	payee under	pay	bills

  Background:
    Given user is on login page
    Then user enters credentials

  Scenario: Add	a new payee

    Then user navigate Pay Bills page
    Then Add New Payee tab
    And creates	new	payee using following information
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Account       | Checking                                 |
      | Payee details | XYZ account                              |

    Then message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed




