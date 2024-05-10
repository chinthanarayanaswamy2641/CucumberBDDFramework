Feature: Logout page functionality

Scenario: Verify Logging out by selecting Logout option from My Account dropmenu
Given User has navigated to login page
When User enters valid emial into email field
And User enters valid password into the password field
And User clicks on Login button
When User click on my account drop menu
And User click on logout button on under my account drop menu
And User click on continue button on logout page
Then User should get display home page title

Scenario: Verify Logging out and browsing back
Given User has navigated to login page
When User enters valid emial into email field
And User enters valid password into the password field
And User clicks on Login button
When User click on my account drop menu
And User click on logout button on under my account drop menu
And User click on back button
Then User should get login page