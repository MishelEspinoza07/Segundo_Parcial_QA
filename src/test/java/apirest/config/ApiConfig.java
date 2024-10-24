package APIREST.config;

public class ApiConfig {

    public static String host="https://todo.ly";
    public static String user="api2024@2024.com";
    public static String pwd="12345";

    public static final String CREATE_PROJECT=host +"/api/projects.json";
    public static final String UPDATE_PROJECT=host +"/api/projects/{id}.json";
    public static final String READ_PROJECT=host +"/api/projects/{id}.json";
    public static final String DELETE_PROJECT=host +"/api/projects/{id}.json";
}
