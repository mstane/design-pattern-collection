Feature: Shapes
  In order to avoid explicitly creating new shape
  As a drawer
  I want to get them cloned

  Scenario: Drawing shapes
    Given cache of all sorts of different shapes 
    When chose the shape
    Then it will be cloned from the cache