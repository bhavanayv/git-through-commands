package CRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class getAllResourcesTest {
	@Test
	public void getAllResources()
	{
		RestAssured.get("http://localhost:8084/");
	}
}
