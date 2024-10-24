package APIREST.factoryRequest;

import java.util.HashMap;
import java.util.Map;

public class RequestInfo {

    private String url;
    private String body;
    private Map<String,String> headers;

    public RequestInfo(){
        headers = new HashMap<>();
    }

    public String getUrl() {
        return url;
    }

    public RequestInfo setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBody() {
        return body;
    }

    public RequestInfo setBody(String body) {
        this.body = body;
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public RequestInfo setHeaders(String key,String value) {
        this.headers.put(key,value);
        return this;
    }

}
