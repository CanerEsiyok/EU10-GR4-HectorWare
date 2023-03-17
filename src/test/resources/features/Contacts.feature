@contacts
Feature: Contacts functionality

Background:
  Given the user is on the "contacts" page

  Scenario: As a user, I should be able to create a new contact so that I can communicate with
    When the user clicks on the "New contact" button
    And the user enters the username "Sara Becker"
    And the user enters the phone number "7004455321"
    And the user enters email address "TestUser@hectorware.com"
    And the user enters the post office box "2332"
    And the user enters address "Chicago Street"
    And the user enters extended address "17th Square"
    And the user enters postal code "44532"
    And the user enters city "George Town"
    And the user enters state or province "Chicago"
    And the user enters country "USA"
    Then the "Sara Becker" contact should be created under the list of contacts