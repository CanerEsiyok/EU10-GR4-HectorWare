
Feature: Calendar functionality
  User Story: User is able to create and update a new event under the Calendar module

  Background:
    Given user is on the dashboard

  Scenario: Verify calendar module display
    When the user clicks on the calendar tab
    Then the user verifies the calendar module is displayed

    Scenario: Verify changing the calendar view by day
      When the user clicks on the calendar tab
      Then the user clicks on the grid tab
      And the user selects day option
      Then daily calender page is displayed
  @smoke
  Scenario: Verify changing the calendar view by week
    When the user clicks on the calendar tab
    Then the user clicks on the grid tab
    And the user selects week option
    Then weekly calender page is displayed

  Scenario: Verify changing the calendar view by month
    When the user clicks on the calendar tab
    Then the user clicks on the grid tab
    And the user selects month option
    Then monthly calender page is displayed

  @calendar_Turkan
  Scenario: Verify creating a new event
    When the user clicks on the calendar tab
    Then the user clicks on the grid tab
    And the user selects day option
    Then the user selects start time 10 AM
    Then the user enters "planning meeting" on the event title
    Then the user enters "zoom" as location
    Then the user enters "online" as description
    Then the user clicks on save button












