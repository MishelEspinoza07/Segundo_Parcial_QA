package APIREST.factoryRequest;

import java.util.HashMap;
import java.util.Map;

public class FactoryRequest {

    public static IRequest makeRequest(String requestType) {
        IRequest request;
        Map<String, IRequest> data = new HashMap<>();
        data.put("get", new RequestGET());
        data.put("post", new RequestPOST());
        data.put("put", new RequestPUT());
        data.put("delete", new RequestDELETE());
        return  data.containsKey(requestType.toLowerCase())?
                data.get(requestType.toLowerCase()):
                data.get("get");
    }
}
