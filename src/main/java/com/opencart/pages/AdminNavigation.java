package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Getter
public class AdminNavigation extends BasePage {

    @FindBy(id = "menu-system")
    private WebElement systemMenu;

    @FindBy(xpath = ".//ul[@id = 'collapse7']//a[contains(@href,'#collapse7-2')]")
    private WebElement localizationMenu;

    @FindBy(xpath = ".//*[contains(@href, 'currency')]")
    private WebElement currencyMenu;

    public WebElement getSystemMenu() {
        webDriverWait.until(ExpectedConditions.visibilityOf(systemMenu));
        return systemMenu;
    }

    public WebElement getLocalizationMenu() {
        webDriverWait.until(ExpectedConditions.visibilityOf(localizationMenu));
        return localizationMenu;
    }

    public WebElement getCurrencyMenu() {
        webDriverWait.until(ExpectedConditions.visibilityOf(currencyMenu));
        return currencyMenu;
    }
}
