package com.opencart.pages;

import com.opencart.enums.SubscribeChoice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmInput;

    @FindBy(xpath = ".//input[@name = 'agree']")
    private WebElement policy;

    @FindBy(xpath = ".//input[@type = 'submit']")
    private WebElement continueButton;

    public WebElement getSubscribeRadioButton(SubscribeChoice choice) {
        return webDriver.findElement(By.xpath(".//input[@type = 'radio' and @value = '" + choice.getChoice() + "']"));
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getPasswordConfirmInput() {
        return passwordConfirmInput;
    }

    public WebElement getPolicy() {
        return policy;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
