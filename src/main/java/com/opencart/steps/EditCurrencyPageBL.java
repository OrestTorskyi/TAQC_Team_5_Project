package com.opencart.steps;

import com.opencart.datamodel.CurrencyModel;
import com.opencart.enums.CurrencyStatus;
import com.opencart.pages.AddEditCurrencyPage;
import com.opencart.pages.CurrencyPage;
import com.opencart.repository.CurrencyModelRepository;

public class EditCurrencyPageBL extends AddEditBasePageBL {

    public EditCurrencyPageBL() {
        super();
    }

    //type - AddNewCurrencyPageBL ?
    public CurrencyPageBL changeValueOfCurrency() {
        CurrencyModel currencyModel = CurrencyModelRepository.getCurrencyModel();
        inputCurrencyValue(currencyModel.getCurrencyValue());
        clickOnConfirmCurrencyButton();

        return new CurrencyPageBL();
    }

    public CurrencyPageBL changeStatusOfCurrencyForDisabled() {
        clickOnCurrencyStatusPopUpMenu();
        clickOnCurrencyStatus(CurrencyStatus.DISABLED);
        clickOnConfirmCurrencyButton();

        return new CurrencyPageBL();
    }

    public CurrencyPageBL changeStatusOfCurrencyForEnabled() {
        clickOnCurrencyStatusPopUpMenu();
        clickOnCurrencyStatus(CurrencyStatus.ENABLED);
        clickOnConfirmCurrencyButton();

        return new CurrencyPageBL();
    }
}
