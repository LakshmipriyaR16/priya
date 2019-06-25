Feature: Automation Practisce application end to end testing
Test scenarios includes Login, Search, order selection,... etc

Scenario:  Verify the login functionality of the application
Given User launch the automation practice application
When User click on the Signin button in the header
And User enter the username in the authentication page
And User enter the password in the authentication page
And User click on the signIn button
Then User verify the username in the header 

Scenario: Verify the search functionality of the application
When User enter product name in the search feild
And User click on the search button
Then User verify the search result in the search header

Scenario: Verify the order selection from the application Menu button
When User mouse hover on the Women Menu
And  User click on the Blouses option
Then User Verify the Blouse result in the header

Scenario: Verify the Add To Cart from the application 
When User mouse hover on the Image of the product
And User click on the AddToCart Button of the product
Then User verify the product added to the cart in the header

Scenario: Verify the Product Summary in the application 
When  User Click on Proceed to CheckOut in the summary page
Then User Verify the product CheckOut result in the header

Scenario: Verify the Summary Page details of the product
When User click on the plus button to add  the quantity of the product
And Click on Proceed to Check out button of the summary page
Then Verify the Summary page result in the Next page header

Scenario: Verify Address Page of the application
When User enter the comment about the order
And User click on proceed to checkout product
Then User verify the Address page result on the next page header 

Scenario: User Verify the Shipping page of the application
When User Click on the Terms of Service  check-box 
And User Clicks the Proceed Checkout button in the Shipping Page
Then User Verify the shipping page result in the next page header

Scenario: User Verify the Payment page of the application
When User click on Pay By Bank Wire option in the payment page
And Click on I confirm my Order to complete the payment
Then User Verify the Payment Page result in the next page header

Scenario: User Logout of the application
When User click on SignOut Button
