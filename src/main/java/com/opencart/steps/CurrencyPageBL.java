package com.opencart.steps;

import com.opencart.pages.CurrencyPage;
import com.opencart.util.DriverUtils;
import org.testng.Assert;

public class CurrencyPageBL {

    private CurrencyPage currencyPage;

    public CurrencyPageBL() {
        currencyPage = new CurrencyPage();
    }

    public AddNewCurrencyPageBL clickAddNewCurrencyButton() {
        clickOnAddNewCurrencyButton();
        return new AddNewCurrencyPageBL();
    }

    public CurrencyPageBL deleteCurrency(String currencyTitle) {
        clickOnInputCheckboxOfElement(currencyTitle);
        clickOnDeleteCurrencyButton();
        new DriverUtils().clickAcceptOnPopUpWindow();
        return new CurrencyPageBL();
    }

    public EditCurrencyPageBL clickEditCurrencyButton() {
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

    private void clickOnInputCheckboxOfElement(String currencyTitle) {
        new DriverUtils().clickOnElementJS(currencyPage.getInputCheckBoxOfElement(currencyTitle));
    }

    private void clickOnEditCurrencyButton() {
        currencyPage.getEditCurrencyButton().click();
    }

    public void clickOnRefreshCurrencyButton() { currencyPage.getRefreshCurrencyButton().click(); }

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

    public String getCurrencyTitle() { return currencyPage.getCurrencyTitle().getText(); }

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
        Assert.assertNotEquals(initialValue, resultValue, "Error in comparing values!");
    }
}
