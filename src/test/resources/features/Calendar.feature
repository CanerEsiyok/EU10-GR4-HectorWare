Feature: As a user, I should be able to select the date I want on the calendar with daily outlook.

  Background: user is logged in the application
    Given user is logged in the application

    @calendar @smoke
  Scenario: User should be able to click on the outlook dropdown.
    When User clicks on the calendar module.
    And User clicks on the outlook dropdown.
    And User clicks on the Day option.
    Then User should be able to see the date on the date button and on the right side of the page with daily outlook on the calendar page.

