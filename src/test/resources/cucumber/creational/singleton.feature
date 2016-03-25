Feature: Single instance
  In order to work with exactly one instance
  As a programmer
  I want to have it ensured

  Scenario: Obtaining the instance
    Given guardian of the instance 
    When ask for an instance
    Then it will always retrieve the same instance