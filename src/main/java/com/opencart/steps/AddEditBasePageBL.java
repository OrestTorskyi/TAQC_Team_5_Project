package com.opencart.steps;

import com.opencart.enums.CurrencyStatus;
import com.opencart.pages.AddEditCurrencyPage;

public abstract class AddEditBasePageBL extends AdminNavigationBL {

    private AddEditCurrencyPage addEditCurrencyPage;

    protected AddEditBasePageBL() { addEditCurrencyPage = new AddEditCurrencyPage(); }

    protected void inputCurrencyTitle(String title) {
        addEditCurrencyPage.getCurrencyTitleInput().clear();
        addEditCurrencyPage.getCurrencyTitleInput().sendKeys(title);
    }

    protected void inputCurrencyCode(String code) {
        addEditCurrencyPage.getCurrencyCodeInput().clear();
        addEditCurrencyPage.getCurrencyCodeInput().sendKeys(code);
    }

    protected void inputCurrencySymbolLeft(String symbolLeft) {
        addEditCurrencyPage.getCurrencySymbolLeftInput().clear();
        addEditCurrencyPage.getCurrencySymbolLeftInput().sendKeys(symbolLeft);
    }

    protected void inputCurrencySymbolRight(String symbolRight) {
        addEditCurrencyPage.getCurrencySymbolRightInput().clear();
        addEditCurrencyPage.getCurrencySymbolRightInput().sendKeys(symbolRight);
    }

    protected void inputCurrencyDecimalPlaces(String decimal) {
        addEditCurrencyPage.getDecimalPlaceInput().clear();
        addEditCurrencyPage.getDecimalPlaceInput().sendKeys(decimal);
    }

    protected void inputCurrencyValue(String value) {
        addEditCurrencyPage.getCurrencyValueInput().clear();
        addEditCurrencyPage.getCurrencyValueInput().sendKeys(value);
    }

    protected void clickOnCurrencyStatusPopUpMenu() {
        addEditCurrencyPage.getCurrencyStatusPopUpMenu().click();
    }

    protected void clickOnCurrencyStatus(CurrencyStatus status) {
        addEditCurrencyPage.getCurrencyStatus(status).click();
    }

    protected void clickOnConfirmCurrencyButton() {
        addEditCurrencyPage.getSubmitNewCurrencyButton().click();
    }
}
