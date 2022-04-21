package org.APIautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Sample {
	static RequestSpecification reqSpec;

	public void listusers() {

		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type", "application/json");
		reqSpec.queryParam("page", "2");
		Response response = reqSpec.get("https://reqres.in/api/users");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String data = body.asString();
		System.out.println(data);
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

	public void singleuser() {
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type", "application/json");
		reqSpec.pathParam("page", "2");
		Response response = reqSpec.get("https://reqres.in/api/users/{page}");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String data = body.asString();
		System.out.println(data);
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

	public void singleusernotfound() {
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type", "application/json");
		reqSpec.pathParam("page", "23");
		Response response = reqSpec.get("https://reqres.in/api/users/{page}");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String data = body.asString();
		System.out.println(data);
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

	public void listresource() {
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type", "application/json");
		Response response = reqSpec.get("https://reqres.in/api/unknown");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String data = body.asString();
		System.out.println(data);
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

	public void singleresource() {
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type", "application/json");
		reqSpec.pathParam("page", "2");
		Response response = reqSpec.get("https://reqres.in/api/unknown/{page}");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String data = body.asString();
		System.out.println(data);
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

	public void singleresourcenotfound() {
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type", "application/json");
		reqSpec.pathParam("page", "23");
		Response response = reqSpec.get("https://reqres.in/api/unknown/{page}");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String data = body.asString();
		System.out.println(data);
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

	public void delayedresource() {
		reqSpec = RestAssured.given();
		reqSpec.queryParam("delay", "3");
		Response response = reqSpec.get("https://reqres.in/api/users");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String data = body.asString();
		System.out.println(data);
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

	public void POST(String body, String url) {
		reqSpec = RestAssured.given().header("Content-Type", "application/json");
		Response response = reqSpec.get(url);
		System.out.println(response.getStatusCode() + "\n" + response.getBody().asString() + "\n"
				+ response.getBody().asPrettyString());
	}

	public void PUT(String body, String url) {

		reqSpec = RestAssured.given().header("Content-Type", "application/json").body(body);
		Response response = reqSpec.post(url);
		System.out.println(response.getStatusCode() + "\n" + response.getBody().asString() + "\n"
				+ response.getBody().asPrettyString());
	}

	public void DELETE(String url) {

		reqSpec = RestAssured.given().header("Content-Type", "application/json");
		Response response = reqSpec.delete(url);
		System.out.println(response.getStatusCode() + "\n" + response.getBody().asString() + "\n"
				+ response.getBody().asPrettyString());
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.listusers();
		s.singleuser();
		s.singleresourcenotfound();
		s.listresource();
		s.singleresource();
		s.singleresourcenotfound();
		s.delayedresource();

		s.POST("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}",
				"https://reqres.in/api/users");
		s.POST("{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"pistol\"\r\n" + "}",
				"https://reqres.in/api/register");
		s.POST("{\r\n" + "    \"email\": \"sydney@fife\"\r\n" + "}", "https://reqres.in/api/register");
		s.POST("{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"\r\n" + "}",
				"https://reqres.in/api/login");
		s.POST("{\r\n" + "    \"email\": \"peter@klaven\"\r\n" + "}", "https://reqres.in/api/login");

		s.PUT("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}",
				"https://reqres.in/api/users/2");

		s.DELETE("https://reqres.in/api/users/2");

	}
}
