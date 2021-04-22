package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginAdminPage extends BasePage {

    @FindBy(id = "input-username")
    private WebElement username;

    @FindBy(id = "input-password")
    private WebElement userPassword;


    @FindBy(xpath = ".//button[@type = 'submit']")
    private WebElement loginButton;

}
