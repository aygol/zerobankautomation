@PayBill
Feature:Pay Bill page
  As a user, I am able to see Pay Bill

  Background: open login page

  Scenario: Account Summary
    Given user is on login page
    Then user enters credentials
    Then page title	Zero – Pay Bills
    When user completes	a successful Pay operation
    Then The	payment	was	successfully submitted should be displayed
    When user tries	to	make a	payment	without	entering the amount	or	date
    Then Please	fill out this field	message! should	be	displayed.
    When Amount field	should	not	accept	alphabetical or	special	characters.
    And Date field should not accept alphabetical characters.
