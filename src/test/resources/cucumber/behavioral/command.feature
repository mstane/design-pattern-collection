Feature: Light switcher
  In order to manage lights in the room
  As a tenant
  I want to switch them
  
  Scenario: Switch on the lights
    Given light switcher
    When the switcher in off
    Then it should change the state in on  
    
  Scenario: Switch on the lights
    Given light switcher
    When the switcher in off
    Then it should change the state in on  