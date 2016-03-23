Feature: Postage
  In order to charge postage
  As a post office
  I want to calculate total postage
  
  Scenario: Postage calculation
    Given postage prices
    When there are items to send
    Then calculate total postage  