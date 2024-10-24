package SELENIUM.pages.todoly;

import SELENIUM.controls.Button;
import SELENIUM.controls.Label;
import SELENIUM.controls.TextBox;
import org.openqa.selenium.By;

public class RightSection {
    public TextBox textBox = new TextBox(By.id("NewItemContentInput"));
    public Button buttonAddItem = new Button(By.id("NewItemAddButton"));
    public Button buttonEdit = new Button(By.xpath("//div[@onClick]//div[@id='ItemEditDiv']//textarea[@id='ItemEditTextbox']"));
    public TextBox txtBoxUpdate = new TextBox(By.xpath("//div[@onClick]//div[@id='ItemEditDiv']//textarea[@id='ItemEditTextbox']"));
    public Button buttonSave = new Button(By.xpath("//img[@id='f']"));

    public void createItem(String name){
        textBox.setText(name);
        buttonAddItem.click();
    }



    public Label getProjectLabel(String name) {
        Label projectLabel = new Label(By.xpath("//ul[@id='mainItemList']//li//div//table//tbody//tr//td//div[text()='" + name + "'] "));
        return projectLabel;
    }
}
