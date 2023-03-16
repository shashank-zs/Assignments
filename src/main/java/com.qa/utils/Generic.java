package com.qa.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import java.util.Map;

public class Generic {

    public static Response postApiCall(Object URL,Object expectedStatus){
        Response response= RestAssured.given()
                .when()
                .post((String) URL);
  //      Assert.assertEquals(expectedStatus,response.getStatusCode());
        response.then().log().all();
        return response;
    }
    public static Response getApiCall(Object URL,Object expectedStatus){
        Response response= RestAssured.given()
                .when()
                .get((String) URL);
        Assert.assertEquals(expectedStatus,response.getStatusCode());
        response.then().log().all();
        return response;
    }
    public static Response deleteApiCall(Object url,Object expectedStatus){
        Response response = RestAssured.given()
                .when()
                .delete((String) url);
        Assert.assertEquals(expectedStatus,response.getStatusCode());
        response.then().log().all();
        return response;
    }
}
