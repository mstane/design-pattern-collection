Feature: Billing
  As a waiter
  I want to have cash register to be able to calculate normal
  and happy hour (50% discount) billing price of drinks
  and to produce bills

  Scenario: Charging normal price
    Given customer in "normal" time
    When order 1 drinks of price of 1.0 
    Then it will be added to the bill
    
  Scenario: Charging happy hour price
    Given 1 customer have 2 drinks
    When order drinks of price of 1.0 in "happy hour" time
    Then it will be added to the bill
    
  Scenario: Charging happy hour price
    Given customer goes out of the bar
    Then gets bill    
