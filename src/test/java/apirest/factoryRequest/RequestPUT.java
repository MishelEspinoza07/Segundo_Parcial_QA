package APIREST.factoryRequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestPUT implements IRequest{
    @Override
    public Response send(RequestInfo requestInfo) {
        Response response = given()
                .headers(requestInfo.getHeaders())
                .body(requestInfo.getBody())
                .log().all()
                .when()
                .put(requestInfo.getUrl());
        response.then().log().all();
        return response;
    }
}
