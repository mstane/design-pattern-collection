Feature: Light switcher
  In order to manage lights in the room
  As a tenant
  I want to switch them
  
  Scenario: Switch on the lights
    Given light switcher
    When the switcher is off
    Then it should change the state in on  
    
  Scenario: Switch off the lights
    Given light switcher
    When the switcher is on
    Then it should change the state in off