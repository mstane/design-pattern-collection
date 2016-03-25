Feature: Vehicle manufacturing
  In order manufacture vehicles
  As a maker
  I want to produce and assemble vehicles
  
  Scenario: Manufacturing
    Given producer of vehicle items and assembler
    When there is need for a vehicle type
    Then it will manufacture it
