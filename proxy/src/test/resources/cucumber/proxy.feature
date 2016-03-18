Feature: Reduce unnecessary network traffic
  As a user
  I want to access file from local if it has been accessed most recently
  
  Scenario: Reading the same file twice
    Given one file remotely
    When access file
    Then it should be accessed "remotely"
    Given one file remotely
    When access file
    Then it should be accessed "locally"    