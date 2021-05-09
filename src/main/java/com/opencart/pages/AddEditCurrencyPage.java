package com.opencart.pages;

import com.opencart.enums.CurrencyStatus;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AddEditCurrencyPage extends AdminNavigation {

    @FindBy(id = "input-title")
    private WebElement currencyTitleInput;

    @FindBy(id = "input-code")
    private WebElement currencyCodeInput;

    @FindBy(id = "input-symbol-left")
    private WebElement currencySymbolLeftInput;

    @FindBy(id = "input-symbol-right")
    private WebElement currencySymbolRightInput;

    @FindBy(id = "input-decimal-place")
    private WebElement decimalPlaceInput;

    @FindBy(id = "input-value")
    private WebElement currencyValueInput;

    @FindBy(id = "input-status")
    private WebElement currencyStatusPopUpMenu;

    @FindBy(xpath = ".//button[@type = 'submit']")
    private WebElement submitNewCurrencyButton;

    @FindBy(xpath = ".//button[@type = 'submit']/following-sibling::*[@class = 'btn btn-default']")
    private WebElement cancelNewCurrencyButton;

    public WebElement getCurrencyStatus(CurrencyStatus currencyStatus) {
        return webDriver.findElement(By.xpath(".//option[@value = '" + currencyStatus.getValue() + "']"));
    }
}
