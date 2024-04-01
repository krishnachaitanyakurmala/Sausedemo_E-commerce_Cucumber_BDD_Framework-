Feature: Sausedemo Admin login

@Sausedemo_valid_credential
Scenario: Check Admin login with valid credentials
Given open login Page
When user Enter username and password
And user click login button
Then user should be see Home page
When close browser
