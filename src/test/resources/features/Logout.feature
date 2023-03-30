Feature:Logout function Hectorware


  Scenario:Logout successfully
    Given User has already logged in
    When User clicks on the profile icon
    And User sees profile options dropdown list
    Then User clicks on the logout button

Feature:Login function Hectorware

@profile
  Scenario: Logout successfully
    Given user is on the home page
    When user clicks on the profile settings icon
    And user sees setting dropdown
    And user clicks to logout button
    Then user sees the login page