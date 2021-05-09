package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public HeaderPageBL clickOnCurrencyDropdownButton() {
        headerPage.getCurrencyDropdownButton().click();
        return this;
    }

    public void verifyCurrencyDisabled(String currencyTitle) {
        Assert.assertFalse(isCurrencyInList(currencyTitle), "Error in checking if currency disabled!");
    }

    public void verifyCurrencyEnabled(String currencyTitle) {
        Assert.assertTrue(isCurrencyInList(currencyTitle), "Error in checking if currency enabled!");
    }

    private boolean isCurrencyInList(String currencyTitle) {
        List<WebElement> currencies = headerPage.getEnabledCurrenciesList();
        boolean isInList = true;
        for (WebElement currency : currencies) {
            if (currency.getText().contains(currencyTitle)) {
                isInList = true;
                break;
            } else {
                isInList = false;
            }
        }
        return isInList;
    }
}
