Feature: Login functionality

Background:
Given User has navigated to login page


Scenario:Login with valid credentials
When User enters valid emial into email field
And User enters valid password into the password field
And User clicks on Login button
Then User should get logged

Scenario: Login with invalid credentials
When User enters invalid emial into email field
And User enters invaid password into the password field
And User clicks on Login button
Then User should get proper warning message about credentials mismatch

Scenario: Login with invalid email and valid password credentials
When User enters invalid emial into email field
And User enters valid password into the password field
And User clicks on Login button
Then User should get proper warning message about credentials mismatch

Scenario: Login with valid email and invalid password credentials
When User enters valid emial into email field
And User enters invaid password into the password field
And User clicks on Login button
Then User should get proper warning message about credentials mismatch

Scenario: Login without providing any credentials
And User clicks on Login button
Then User should get proper warning message about credentials mismatch


Scenario: Verify forgot password link
When user clicks on forgotten password link
Then User should be taken to forgotten password page


Scenario: Logging into the application using keyboard keys
When User enters the login details using keyboard keys
Then User should get logged

Scenario: verify Email And Password Text Fields Place HolderText
When User verify email place holder text
And User verify password place holder text

Scenario: Logging into the aplication browser back button
When User enters valid emial into email field
And User enters valid password into the password field
And User clicks on Login button
And User click on back button
Then User should not logged 

Scenario: verify logging out to the application browser back button
When User enters valid emial into email field
And User enters valid password into the password field
And User clicks on Login button
And User click on my account drop menu
And User click on logout button on under my account drop menu
And User click on back button
Then User should get login page

Scenario: Verify user is able to navigate to different pages from Login page
When User click on continue button under new customer in login page
And User click on login page link in Register page
And User should get login page
And User click on login option in right column options
Then User should get login page

Scenario: Verify the Breakcrumb and Page Heading and Page Title and Page URL of Login page
When User verify the heading page of the login page
And User verify the page tittle of the login page
And User verify the bread crumb of the login page
Then user verify the url of the login page 

Scenario: veriy the uI of the login page
When User verify ui of the login page