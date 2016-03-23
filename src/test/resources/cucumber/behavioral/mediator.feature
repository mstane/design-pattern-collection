Feature: Chat
  In order to communicate with more people
  As a user
  I want to be able to send messages to more people and to be able to receive messages of them
  
  Scenario: Sending/receiving a message
    Given a chat room
    When a user sends a message
    Then all other users in the chat room receive the message  