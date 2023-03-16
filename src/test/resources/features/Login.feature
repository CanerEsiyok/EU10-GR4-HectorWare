Feature:Login function Hectorware

  Scenario: Login with valid credentials
    Given user is on the login page
    When user enters "Employee1" username
    And user enters "Employee123" password
    And user clicks to signIn button
    Then user sees the dashboard
