Feature: Coffee shop
  In order to serve coffees 
  As a coffee shop
  I want to accelerate process of ordering
  
  Scenario: Ordering
    Given a coffee shop
    When there is a coffee flavor for a coffee
    Then it should be checked if there is already in cache to reuse it