Feature: Decorating
  In order to be able to read text from multi-lines text widget and to have better visibility with borders 
  As a programmer
  I want to be able to add it independently
  
  Scenario: Adding scroll and borders on text widget
    Given text widget
    When it is set to have scroll and borders feature
    Then it should be drawn 