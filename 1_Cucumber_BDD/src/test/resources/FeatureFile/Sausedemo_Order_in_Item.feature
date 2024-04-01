Feature: Validate Sausedemo app ordered Item

@Sausedemo_app__order_Item
Scenario: Validate Sausedemo application for order an Item
Given open login Page
When user enter username and password
And user OrderItem Click login button
Then user should be see OrderItem Home page
When  user should be Select of the Price(low to high)
And user click Add To Card in item 
And user should be click shopping cart 
When user wait for check out page 
Then user should be see your cart page
When click ckeck out button
When user wait for your information
Then user should be see chechout information page
When Enter first name and last name and pincode
And user click continue button
When user wait check out overview
Then user should be see checkout overview page
When use click Finish button
Then use should be see THANK YOU FOR YOUR ORDER
When user Take a screen short
When close browser

