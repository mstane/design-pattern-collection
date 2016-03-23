Feature: Playing
  In order to play right action
  As a player
  I want chose action per current state

  Scenario: Choose right action
    Given player context
    When there is an action 
    Then play right move
