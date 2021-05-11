package com.opencart.steps;

import com.opencart.pages.HeaderPage;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public SearchPageBL clickOnMainSearchButton() {
        headerPage.getMainSearchButton().click();
        return new SearchPageBL();
    }
}
