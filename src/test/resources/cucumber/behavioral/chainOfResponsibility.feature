Feature: Purchase approval
  In order to make purchase 
  As a user
  I want to get approval for the amount

  Scenario: Publishing
    Given chain of responsibilities per amount
    When there are purchases to approve
    Then it will get role who is in charge to approve