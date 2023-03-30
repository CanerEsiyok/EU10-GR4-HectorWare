Feature: Default

  Background:
		#@HECWA10-136
    Given user is on the dashboard
		

	#User Story: 
	#As an application basic user, I should be able to create, edit or delete a new group conversation so that I can communicate 
	#
	#AC:1
	#
	#User should be able to see all conversation lists under the Talk module
  @HECWA10-18
  Scenario: Display all conversation lists under the Talk module
    When user clicks the talk icon on the top left of the page
    Then user verifies the conversations are listed on the left side of the page

  @HECWA10-20
  Scenario: User creates a new conversation under the Talk module
    Given user clicks the talk icon on the top left of the page
    When user clicks the Create a new group conversation button under the Talk sign
    And in the pop up screen, user writes "conversation1" that you want to give to the conversation
    And user clicks Add  participants button to add participants
    And user chooses Employee10,Employee100,Employee101 and click Create conversation
    Then user verifies the conversation is listed

  @HECWA10-137
  Scenario: User can edit any selected conversation
    Given user clicks the talk icon on the top left of the page
    When user selects a conversation from the list on the left side of the page
    And user clicks ... button on the top right of the page
    And user clicks Rename conversation and change the name into "ChangedConversation"
    And user clicks Enter and refreshes the page
    Then user verifies the name has changed to "ChangedConversation" the list on the left side of the page

  @HECWA10-162
  Scenario: User can delete any selected conversation
    Given user clicks the talk icon on the top left of the page
    When user clicks ... button on the right side of the "ChangedConversation" on the list
    And user clicks Delete conversation button on the new dropdown
    And user clicks Yes on the pop up screen
    Then user verifies the "ChangedConversation" is not listed anymore