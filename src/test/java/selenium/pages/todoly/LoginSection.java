package SELENIUM.pages.todoly;

import SELENIUM.controls.Button;
import SELENIUM.controls.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public  Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));

    public void login(String email, String pwd){
        this.emailTxtBox.setText(email);
        this.pwdTxtBox.setText(pwd);
        this.loginButton.click();
    }

}
