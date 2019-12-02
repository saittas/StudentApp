package com.SerenityApiDemo.utils;

import java.util.concurrent.TimeUnit;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ReusableSpecification {
	public static RequestSpecBuilder rspec;
	public static RequestSpecification requestSpecification;
	public static ResponseSpecBuilder respec;
	public static ResponseSpecification responseSpecification;
public static RequestSpecification getGenericRequestSpec() {
	rspec=new RequestSpecBuilder();
	rspec.setContentType(ContentType.JSON);
	requestSpecification=rspec.build();
	return requestSpecification;
	
}
public static ResponseSpecification getGenericResponseSpec() {
	respec=new ResponseSpecBuilder();
	respec.expectHeader("Content-Type","application/json;charset-UTF-8");
	respec.expectHeader("Transfer-Ending", "chunked");
	//respec.expectResponseTime(lessThan(5L), TimeUnit.SECONDS);//here I want to have response less than 5 seconds
	return null;
}
}
