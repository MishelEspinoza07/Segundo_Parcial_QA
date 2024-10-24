package SELENIUM.factoryBrowser;

public class FactoryBrowser {

    public static IBrowser make(String type) {
        IBrowser browser;
        switch (type.toLowerCase()) {
            case "firefox":
                browser = new Firefox();
                break;
            case "chrome":
                browser = new Chrome();
                break;
            default:
                browser = new Edge();
                break;
        }
        return browser;
    }
}
