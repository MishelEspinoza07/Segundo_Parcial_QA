package SELENIUM.pages.todoly;

import SELENIUM.controls.Button;
import SELENIUM.controls.Icon;
import SELENIUM.controls.Label;
import SELENIUM.controls.TextBox;
import org.openqa.selenium.By;

public class ProjectLeftSection {

    public Button addNewProjectButton = new Button(By.xpath("//td[text()='Add New Project']"));
    public Button addButton = new Button(By.id("NewProjNameButton"));
    public TextBox nameProjectTxtBox = new TextBox(By.id("NewProjNameInput"));
    public TextBox nameProjectEditTxtBox = new TextBox(By.xpath("//input[@id='ItemEditTextbox' and @style]"));
    public Icon menuIcon = new Icon(By.xpath("//div[@style=\"display: block;\"]/img"));
    public Icon saveIcon = new Icon(By.xpath("//img[@id=\"ItemEditSubmit\" and @itemid]"));
    public SubMenuOptionSection subMenuOptions = new SubMenuOptionSection();

    public Label getProjectLabel(String name){
        Label projectLabel = new Label(By.xpath("//li[last()]//td[text()='"+name+"'] "));
        return projectLabel;
    }

    public void createProject(String name){
        addNewProjectButton.click();
        nameProjectTxtBox.setText(name);
        addButton.click();
    }
}
