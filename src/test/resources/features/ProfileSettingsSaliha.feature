
Feature:Profile Settings Functionality
  User story: As a user, I should be able to change profile info settings under the Profile module so that I can use the app

Background:
  Given the user is on the dashboard page
  When user clicks on the profile module
  And user clicks on the settings module


 Scenario: User can see the Profile Info settings under the Profile module


  @profile
 Scenario: User can change any info under the Profile module
   And  user should see the full name"Employee300"
   And  user enters phone number 412458546
   And  user enters website "https://hectorware.qa.com"
   And  user selects language type "English (US)"
   And  user enters email "employee3@gmail.com"
   And  user enters address "Baker Street"
   And  user enters twitter account "@employee3"
   And  user selects Locale type "English (United States)"



