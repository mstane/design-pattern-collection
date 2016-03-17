Feature: Publishing
  As a publisher
  I want to publish messages
  and send to subscribed audience

  Scenario: Publishing
    Given number of subscribed users
    When publish a message "Hello people!"
    Then all subscribed users will receive the message