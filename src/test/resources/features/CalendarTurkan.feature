@calendar_Turkan
Feature: Calendar functionality
  User Story: User is able to create and update a new event under the Calendar module

  Background:
    Given user is on the dashboard

  Scenario: Verify calendar module display
    When the user clicks on the calendar tab
    Then the user verifies the calendar module is displayed

