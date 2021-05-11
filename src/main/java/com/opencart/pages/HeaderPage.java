package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {
    @FindBy(xpath = "//*[@id = 'search']/span/button")
    private WebElement mainSearchButton;

    public WebElement getMainSearchButton() {
        wait.until(ExpectedConditions.visibilityOf(mainSearchButton));
        return mainSearchButton;
    }
}
