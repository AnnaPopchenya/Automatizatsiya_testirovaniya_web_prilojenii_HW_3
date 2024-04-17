package org.example.pom;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    private final SelenideElement usernameField = $(By.cssSelector("form#login input[type='text']"));
    private final SelenideElement passwordField = $(By.cssSelector("form#login input[type='password']"));
    private final SelenideElement loginButton = $(By.cssSelector("form#login button"));
    private final SelenideElement errorBlock = $(By.cssSelector("div.error-block"));


    public void login(String username, String password) {
        typeUsernameInField(username);
        typePasswordInField(password);
        clickLoginButton();
    }

    public void typeUsernameInField(String username) {
        usernameField.setValue(username);
    }

    public void typePasswordInField(String password) {
        passwordField.setValue(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorBlockText() {
        return errorBlock.shouldBe(visible).getText().replace("\n", " ");
    }

}
