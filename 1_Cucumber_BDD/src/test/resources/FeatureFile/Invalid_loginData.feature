Feature: Sausedemo invalid data
@Sausedemo_Invalid_credential
Scenario Outline: Check Admin login with invalid credentials
Given open login Page
When user enter "<usernum>" and "<password>"
And user Click login button
Then user should be see Error message
When close browser
Examples:
| usernum | password |
|standard_user||
|chaitu|secret_sauce|
|standard_user|chaitanya|
||secret_sauce|
|||
