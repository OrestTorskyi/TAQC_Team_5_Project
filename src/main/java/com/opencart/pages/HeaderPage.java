package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = ".//form[@id = 'form-currency']//button[@class = 'btn btn-link dropdown-toggle']")
    private WebElement currencyDropdownButton;

    @FindBy(css = "form#form-currency ul.dropdown-menu button")
    private List<WebElement> enabledCurrencies;

    public WebElement getMyAccountButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(registerButton));
        return registerButton;
    }

    public WebElement getCurrencyDropdownButton()
    {
        return currencyDropdownButton;
    }

    public List<WebElement> getEnabledCurrenciesList()
    {
        return enabledCurrencies;
    }
}
