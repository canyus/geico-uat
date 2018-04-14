@customer
Feature: Fill customer info

Scenario: User fills the information boxes

Given The user is on the main page
When The user verifies the title and the url
And  The user enters the zip code
And  The user clicks on start quote button
And  The user enters first name
And  The user enters last name
And  The user enters street address
And  The user enters apt number
And  The user fills date of birth boxes 
Then  The user cliks next

@Vehicle
Scenario: User fills the vehicle information

Given The user is on the Add vehicle page
When the user selects a year
And the user selects make
And the user selects model
And the user selects ofl
And the user selects primary use 
And the user selects how
And the user selects milage
Then the user clicks no


