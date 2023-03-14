package com.qa.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import java.util.Map;

public class Generic {
    public static Response postApiCall(Map<String,String> headerList,String Payload,String URL, Object ExpectedStatusCode){
        Response response = RestAssured.given()
                .headers(headerList)
                .body(Payload)
                .when()
                .post(URL);
        Assert.assertEquals(ExpectedStatusCode,response.getStatusCode());
        response.then().log().all();
        return response;
    }
}
