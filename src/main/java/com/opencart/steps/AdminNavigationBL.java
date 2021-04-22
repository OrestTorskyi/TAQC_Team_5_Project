package com.opencart.steps;

import com.opencart.pages.AdminNavigation;
import com.opencart.pages.CurrencyPage;
import com.opencart.util.DriverUtils;

public class AdminNavigationBL {

    private AdminNavigation adminNavigation;
    private CurrencyPage currencyPage;

    public AdminNavigationBL() {
        adminNavigation = new AdminNavigation();
    }

    public CurrencyPageBL getToCurrencyPage() {
        clickOnSystemMenu();
        clickOnLocalizationMenu();
        clickOnCurrencyMenu();

        currencyPage = new CurrencyPage();
        return new CurrencyPageBL();
    }

    private void clickOnSystemMenu()
    {
        adminNavigation.getSystemMenu().click();
    }

    private void clickOnLocalizationMenu()
    {
        adminNavigation.getLocalizationMenu().click();
    }

    private void clickOnCurrencyMenu()
    {
        adminNavigation.getCurrencyMenu().click();
    }





}
