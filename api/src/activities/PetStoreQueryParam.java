package activities;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetStoreQueryParam {
	
	//Set base URL
	final static String BASE_URI = "https://petstore.swagger.io/v2/pet/findByStatus";
	 
	@Test
    public void petGetRequest() {

    	Response response = 
                given().contentType(ContentType.JSON) // Set headers
                .when().queryParam("status", "sold")
                .get(BASE_URI); // Send GET request
    	System.out.println(response);
    }
  
}
