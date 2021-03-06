package com.opencart.steps;

import com.opencart.datamodel.CurrencyModel;
import com.opencart.enums.CurrencyStatus;
import com.opencart.repository.CurrencyModelRepository;

public class AddNewCurrencyPageBL extends AddEditBasePageBL {

    public AddNewCurrencyPageBL() {
        super();
    }

    public CurrencyPageBL addNewCurrency() {
        CurrencyModel currencyModel = CurrencyModelRepository.getCurrencyModel();
        inputCurrencyTitle(currencyModel.getCurrencyTitle());
        inputCurrencyCode(currencyModel.getCurrencyCode());
        inputCurrencySymbolLeft(currencyModel.getCurrencySymbolLeft());
        inputCurrencySymbolRight(currencyModel.getCurrencySymbolRight());
        inputCurrencyDecimalPlaces(currencyModel.getCurrencyDecimalPlaces());
        inputCurrencyValue(currencyModel.getCurrencyValue());
        clickOnCurrencyStatusPopUpMenu();
        clickOnCurrencyStatus(CurrencyStatus.ENABLED);
        clickOnConfirmCurrencyButton();

        return new CurrencyPageBL();
    }
}
