
Feature:Login function Hectorware
  @smoke
  Scenario: Login with valid credentials
    Given user is on the login page
    When user enters "Employee1" username
    And user enters "Employee123" password
    And user clicks to signIn button
    Then user sees the dashboard

  Scenario: Login with invalid credentials
    Given user is on the login page
    When user enters "Abc" username
    And user enters "432" password
    And user clicks to signIn button
    Then user can not see the dashboard

  Scenario: Login with no credentials
    Given user is on the login page
    When user don't enter any username
    And user don't enter any password
    And user clicks to signIn button
    Then user can not see the dashboard