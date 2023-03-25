Feature:Login function Hectorware

@profile
  Scenario: Logout successfully
    Given user is on the home page
    When user clicks on the profile settings icon
    And user sees setting dropdown
    And user clicks to logout button
    Then user sees the login page