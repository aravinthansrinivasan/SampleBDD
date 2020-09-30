package RestAssuredAPI.SampleProject;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import org.junit.Assert;

import io.restassured.response.Response;
import io.cucumber.java.en.*;
import io.cucumber.datatable.*; 


public class GetWeatherDetailsSteps {
	Scanner sc  = new Scanner(System.in) ;
	String s = sc.next();
	String city;
	String appID;
	Response response;
	String uri = "https://samples.openweathermap.org/data/2.5/weather";

	@Given("^I have set the City parameters as \"(.*)\"$")
	public void Given_I_Have_Set_the_City_Parameter(String City) 
	{
		this.city=City;
	}

	
	
	@Given("^Appid for the request URI as \"(.*)\"$")
	public void Given_AppId_For_the_Request_URI(String appid) 
	{
		this.appID=appid;
	}

	@When("^I send the Api GetWeatherDetails get request$")
	public void When_I_send_API_GetWeatherDeatils_Request() 
	{

		response= given()
					.param("q", "London")
					.param("appid","439d4b804bc8187953eb36d2a8c26a02")
				.when()
					.get(uri)
				.then()
					.extract()
					.response();

	}

	@Then("^status code of the response will be (.*)$")
	public void Then_Status_Code_Of_the_Response_will_be(int statuscode)
	{

		Assert.assertEquals("Validating the Status code of Response",statuscode,response.statusCode());
	}
	
	
	@Then("City name in the response should be {string}")
	public void city_name_in_the_response_should_be(String city)
	{
		Assert.assertEquals("Validating the City name in Response",response.body().jsonPath().get("name"),city);
				
	}
	
}
