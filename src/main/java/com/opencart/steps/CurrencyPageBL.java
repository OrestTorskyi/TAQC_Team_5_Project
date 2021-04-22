package com.opencart.steps;

import com.opencart.pages.CurrencyPage;
import com.opencart.util.DriverUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CurrencyPageBL {
    private CurrencyPage currencyPage;

    public CurrencyPageBL() {
        currencyPage = new CurrencyPage();
    }

    public AddNewCurrencyPageBL getToAddingNewCurrency() {
        clickOnAddNewCurrencyButton();
        return new AddNewCurrencyPageBL();
    }

    public CurrencyPageBL deleteCurrency() {
        sortCurrencyByLastUpdateFromOldest();
        clickOnInputCheckbox();
        clickOnDeleteCurrencyButton();
        new DriverUtils().clickAcceptOnPopUpWindow();
        return new CurrencyPageBL();
    }

    public EditCurrencyPageBL getToEditCurrencyPage() {
        clickOnEditCurrencyButton();
        return new EditCurrencyPageBL();
    }

    private void clickOnAddNewCurrencyButton() {
        currencyPage.getAddCurrencyButton().click();
    }

    private void clickOnDeleteCurrencyButton() {
        currencyPage.getDeleteCurrencyButton().click();
    }

    private void clickOnLastUpdatedButton() {
        currencyPage.getLastUpdatedButton().click();
    }

    private void clickOnInputCheckbox() {
        new DriverUtils().clickOnElementJS(currencyPage.getInputCheckboxForRow());
    }

    private void clickOnEditCurrencyButton() {
        currencyPage.getEditCurrencyButton().click();
    }

    public void clickOnRefreshCurrencyButton() {
        currencyPage.getRefreshCurrencyButton().click();
    }

    public int getSizeOfCurrencyElements() {
        return currencyPage.getTableCurrencies().size();
    }

    public void sortCurrencyByLastUpdateFromOldest() {
        clickOnLastUpdatedButton();
        clickOnLastUpdatedButton();
    }

    public double getCurrencyValue() {
        return Double.parseDouble(currencyPage.getCurrencyValue().getText());
    }

    public void verifyDeletingCurrency() {
        String expectedMessage = "Success: You have modified currencies!";
        String actualResult = currencyPage.getSuccessChangesMessage().getText();
        actualResult = actualResult.replaceAll("[×]", "").trim();
        Assert.assertEquals(actualResult, expectedMessage, "Incorrect message!");
    }


    public void verifyAddingNewCurrency() {
        String expectedMessage = "Success: You have modified currencies!";
        String actualResult = currencyPage.getSuccessChangesMessage().getText();
        actualResult = actualResult.replaceAll("[×]", "").trim();
        Assert.assertEquals(actualResult, expectedMessage, "Incorrect message!");
    }

    public void verifyAddingNewCurrency(int initialValue, int resultValue) {
        Assert.assertTrue(resultValue == initialValue + 1, "Incorrect values!");
    }

    public void verifyDeletingCurrency(int initialValue, int resultValue) {
        Assert.assertTrue(resultValue == initialValue - 1, "Incorrect values!");
    }


    public void verifyEditingCurrency() {
        String expectedMessage = "Success: You have modified currencies!";
        String actualResult = currencyPage.getSuccessChangesMessage().getText();
        actualResult = actualResult.replaceAll("[×]", "").trim();
        Assert.assertEquals(actualResult, expectedMessage, "Incorrect message!");
    }

    public void verifyEditingCurrency(double initialValue, double resultValue) {
        Assert.assertNotEquals(initialValue, resultValue);
    }

}