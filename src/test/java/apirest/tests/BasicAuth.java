package apirest.tests;

import apirest.config.ApiConfig;
import apirest.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.Base64;

public class BasicAuth {

    public RequestInfo request = new RequestInfo();
    public Response response;
    public String auth="";
    public String valueAuth="";
    public JSONObject body = new JSONObject();

    @BeforeEach
    public void before(){
        body.put("Content", "UPB2024Mish");
        auth = "Authorization";
        valueAuth="Basic" +Base64.getEncoder().encodeToString((ApiConfig.user+":"+ApiConfig.pwd).getBytes());
    }


@AfterEach
public void after() {

}


}


