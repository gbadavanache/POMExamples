package POMandPageFactory;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredExample {
	@Test
	public void GetWeatherDetails()
	{
		RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("/Hyderabad");
		int statusCode = response.getStatusCode(); //Get the status code from the Response
		AssertJUnit.assertEquals(statusCode, 200);
		
	
	}

}