package SELENIUM.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBox extends Controls{
    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String value){
        this.findControl();
        this.control.sendKeys(value);
    }

    public void clearSetText(String value){
        this.findControl();
        this.control.clear();
        this.control.sendKeys(value);
    }

    public void setTextEnter(String value){
        this.findControl();
        this.control.sendKeys(value+ Keys.ENTER);
    }
}
