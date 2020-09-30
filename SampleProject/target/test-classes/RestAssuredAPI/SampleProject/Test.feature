@GetWeatherDetails
Feature: openweathermap GetWeatherDetails Api 

Scenario: Verify whether Api status code
	Given I have set the City parameters as "London"
	And Appid for the request URI as "439d4b804bc8187953eb36d2a8c26a02"
	When I send the Api GetWeatherDetails get request
	Then status code of the response will be 200
	And City name in the response should be "London"

	
	
Scenario Outline: Verify Balance transfer with Valid user
Given Im an Existing User
And Im on the Balance Tansfer Page
And I enter the <Amount>
When I click on Next Button
Then I wll be shown Tax on the Tranfer Amount
And the Total Amount That will be detucted from the A Users Account
When I click on the Final Submit button
Then It will be tranfered to B Account.

Examples:
|Amount|
|10|
|1000|
