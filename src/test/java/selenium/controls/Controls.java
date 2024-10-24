package SELENIUM.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SELENIUM.session.Session;

public class Controls {

    protected By locator;

    protected WebElement control;

    public Controls(By locator) {
        this.locator = locator;
    }

    protected void findControl() {
        this.control = Session.getInstance().getBrowser().findElement(locator);
    }

    public void click() {
        this.findControl();
        this.control.click();
    }

    public boolean isControlDisplayed() {
        try {
            this.findControl();
            return this.control.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getText(){
        this.findControl();
        return control.getText();
    }
}
