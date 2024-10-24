package apirest.tests;


import apirest.configUSER.ApiConfigUser;
import apirest.factoryRequest.FactoryRequest;
import apirest.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateUser {
    public RequestInfo request = new RequestInfo();
    public Response response;
    public String auth="";
    public String valueAuth="";
    public JSONObject body = new JSONObject();

    @Test
    @DisplayName("Verify Create User")
    public void CreateUser() {
        body.put("Email", "mishelespinoza0624@gmail.com");
        body.put("Fullname", "Mishel");
        body.put("Password", "mishel1234");
        request.setUrl(ApiConfigUser.CREATE_USER)
                .setBody(body.toString());
        response = FactoryRequest.makeRequest("post").send(request);
        response.then().assertThat().statusCode(200);
    }
    }
