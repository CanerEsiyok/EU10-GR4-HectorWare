Feature: contacts functionality
  user story: As a user, I should be able to create a new contact,
  add the contact into a group under the contacts module,
  and edit or delete a contact so that i can communicate with

  Background:
    Given user is on the "contacts" page

  Scenario:User can create a new contact
    When user clicks on the new contact button
    And user enters the username "ali haydar"
    And user enters the phone number "123 456 78 99"
    And user enters email address "haydarhaydar@hectorware.com"
    And user enters the post office box "1202"
    And user enters adress "merkez mh"
    And user enters extended address "1. sk"
    And user enters postal code "34250"
    And user enters city "beyoglu"
    And user enters state or province "istanbul"
    And user enters country "turkey"
    Then user sees "ali haydar" under all contacts

  Scenario: User can edit any contact
    When user clicks on "ali haydar" from list
    Then user enters the username "ali cavus haydar"
    Then user sees "ali cavus haydar" under all contacts

  Scenario: User can delete any contact
    When user clicks on three dot icon
    And user clicks on delete button
    Then verify no contact selected text is displayed