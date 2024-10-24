package SELENIUM.pages.todoly;

import SELENIUM.controls.Button;
import org.openqa.selenium.By;

public class SubMenuOptionSection {
    public Button editButton = new Button(By.xpath("//ul[contains(@style,\"block;\")]//a[text()='Edit']"));
    public Button deleteButton = new Button(By.xpath(""));

}
