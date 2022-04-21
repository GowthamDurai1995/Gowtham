package org.APIautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Task1Apr18 {

	static RequestSpecification reqSpec;

	public void GET(String url) {

		reqSpec = RestAssured.given().header("Content-Type", "application/json");
		Response response = reqSpec.get(url);
		System.out.println(response.getStatusCode() + "\n" + response.getBody().asString() + "\n" + response.getBody().asPrettyString());
	}

	public void POST(String body, String url) {

		reqSpec = RestAssured.given().header("Content-Type", "application/json").body(body);
		Response response = reqSpec.post(url);
		System.out.println(response.getStatusCode() + "\n" + response.getBody().asString() + "\n"
				+ response.getBody().asPrettyString());
	}

	public void PUT(String body, String url) {

		reqSpec = RestAssured.given().header("Content-Type", "application/json").body(body);
		Response response = reqSpec.post(url);
		System.out.println(response.getStatusCode() + "\n" + response.getBody().asString() + "\n" + response.getBody().asPrettyString());
	}

	public void DELETE(String url) {

		reqSpec = RestAssured.given().header("Content-Type", "application/json");
		Response response = reqSpec.delete(url);
		System.out.println(response.getStatusCode() + "\n" + response.getBody().asString() + "\n" + response.getBody().asPrettyString());
	}

	public static void main(String[] args) {

		Task1Apr18 t = new Task1Apr18();

		t.GET("https://reqres.in/api/users?page=2");
		t.GET("https://reqres.in/api/users/2");
		t.GET("https://reqres.in/api/users/23");
		t.GET("https://reqres.in/api/unknown");
		t.GET("https://reqres.in/api/unknown/2");
		t.GET("https://reqres.in/api/unknown/23");
		t.GET("https://reqres.in/api/users?delay=3");

		t.POST("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}", "https://reqres.in/api/users");
		t.POST("{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"pistol\"\r\n" + "}", "https://reqres.in/api/register");
		t.POST("{\r\n" + "    \"email\": \"sydney@fife\"\r\n" + "}", "https://reqres.in/api/register");
		t.POST("{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"\r\n" + "}", "https://reqres.in/api/login");
		t.POST("{\r\n" + "    \"email\": \"peter@klaven\"\r\n" + "}", "https://reqres.in/api/login");

		t.PUT("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}", "https://reqres.in/api/users/2");

		t.DELETE("https://reqres.in/api/users/2");
	}

}
