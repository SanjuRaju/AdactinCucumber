Feature: Login functionality for Adactin application

Scenario: User enter valid username and password
Given User enter url of adactin application
When User enter valid username 
And User enter valid password
And User click login button
Then User validate click button

Scenario: User search hotel
When User select location
And User select hotel
And User select room type
And User select number of rooms
And User enter checkin date
And User enter checkout date
And User select adults room
And User select children room
And User click on search button
Then User validate search button

Scenario: User select hotel
When User click on select button
And User click on continue button
Then User validate comtinue button

Scenario: User book the hotel 
When User enter firstname
And User enter lastname
And User enter billing address
And User enter creditcard number
And User select creditcard type
And User select expiry month
And User select expiry year
And User enter CVV number
And User click on booknow button
Then User validate firstname

Scenario: User confirm the booking
When User click on logout button
Then User validate the logout button



