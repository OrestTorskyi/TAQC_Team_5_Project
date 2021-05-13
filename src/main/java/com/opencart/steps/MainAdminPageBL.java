package com.opencart.steps;

public class MainAdminPageBL extends AdminNavigationBL {

    public CurrencyPageBL getCurrencyPage() {
        return new MainAdminPageBL().getToCurrencyPage();
    }
}
