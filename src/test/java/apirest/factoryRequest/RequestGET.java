package APIREST.factoryRequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestGET implements IRequest{
    @Override
    public Response send(RequestInfo requestInfo) {
        Response response = given()
                .headers(requestInfo.getHeaders())
                .log().all()
                .when()
                .get(requestInfo.getUrl());
        response.then().log().all();
        return response;
    }
}
