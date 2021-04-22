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

    public HeaderPageBL verifyCurrencyDisabled(String currencyTitle) {
        Assert.assertFalse(currencyInList(currencyTitle));
        return this;
    }

    public HeaderPageBL verifyCurrencyEnabled(String currencyTitle) {
        Assert.assertTrue(currencyInList(currencyTitle));
        return this;
    }

    private boolean currencyInList(String currencyTitle) {
        List<WebElement> currencies = headerPage.getEnabledCurrenciesList();
        boolean isInList = true;
        for (WebElement currency : currencies) {
            if (currency.getText().contains(currencyTitle)) {
                isInList = true;
                break;
            } else isInList = false;
        }
        return isInList;
    }
}
