Feature:Logout function Hectorware

Scenario:Logout successfully
Given User has already logged in
When User hoverover on the profile icon
  And User clicks on the profile icon
And User sees profile options dropdown list
And User clicks on the logout button
Then User sees login page without anyone signing in
