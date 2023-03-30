@calendar_Turkan
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



