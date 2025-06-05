// File: TransferId.java

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class transferId {
    public static int petId;
    @Test
	public void AddNewPet() {
	    // Write the request body
		baseURI = "https://petstore.swagger.io/v2/pet";
	    String reqBody = "{\"name\":\"Riley\",\"status\":\"alive\"}";

	    Response response = 
	        given().contentType(ContentType.JSON) // Set headers
	        .body(reqBody).when().post(baseURI); // Send POST request

	    // Print response of POST request
	    String body = response.getBody().asPrettyString();
	    System.out.println(body);
	}
}
