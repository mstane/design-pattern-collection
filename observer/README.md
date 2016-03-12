# Observer Pattern

Feature: Publishing   
  As a publisher  
  I want to publish messages  
  and send to subscribed audience  

  Scenario: Publishing  
    Given 3 subscribed users  
    When publish a message "Hello people!"  
    Then all subscribed users will receive the message  
