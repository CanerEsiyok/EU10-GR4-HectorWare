@talk
Feature:Hectorware Talk Module conversation feature
  User Story:
  As an application basic user, I should be able to create, edit or delete a new group conversation so that I can communicate

  Background:
    Given user is on the dashboard

  Scenario: Display all conversation lists under the Talk module
    When user clicks the talk icon on the top left of the page
    Then user verifies the conversations are listed on the left side of the page


  Scenario: User can create a new conversation under the Talk module
    Given user clicks the talk icon on the top left of the page
    When user clicks the Create a new group conversation button under the Talk sign
    And in the pop up screen, user writes "conversation1" that you want to give to the conversation
    And user clicks Add  participants button to add participants
    And user chooses Employee10,Employee100,Employee101 and click Create conversation
    Then user verifies the conversation is listed


