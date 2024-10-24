package selenium.testSuit;

import selenium.pages.todoly.LoginSection;
import selenium.pages.todoly.MainPage;
import selenium.pages.todoly.MenuSection;
import selenium.pages.todoly.SignUpSection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class CreateUser {
    protected MainPage mainPage = new MainPage();
    protected SignUpSection signUpSection = new SignUpSection();
    protected LoginSection loginSection = new LoginSection();
    protected MenuSection menuSection = new MenuSection();
    @Test
    @DisplayName("Create User Test")
    public void createUser() {
        String FullName = "Mishel";
        String Email = "mishelespinoza0624@gmail.com";
        String Password = "mishel1234";
        mainPage.SignUpFree.click();
        signUpSection.FullName.setText(FullName);
        signUpSection.Email.setText(Email);
        signUpSection.Password.setText(Password);
        signUpSection.SignUpAdd.click();
        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText(Email);
        loginSection.pwdTxtBox.setText(Password);
        loginSection.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR! the login was failed");
    }
}
