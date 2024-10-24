package SELENIUM.session;

import SELENIUM.factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {

    //Hay 5 formas de crear un singleton
    //Hay que cumplir 3 cosas para poder crear el singleton

    private static Session session = null;
    private WebDriver browser;
    // constructor privado
    private Session(){
        //todo -- read from property file
        browser = FactoryBrowser.make("chrome").create();
    }
    // metodo de acceso global publico
    public static Session getInstance(){
        if (session == null)
            session = new Session();
        return session;
    }

    public void closeSession(){
        browser.quit();
        session=null;
    }

    public WebDriver getBrowser() {
        return browser;
    }
 }
