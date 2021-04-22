package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CurrencyPage extends BasePage {

    @FindBy(xpath = ".//button[@class = 'btn btn-danger']/preceding-sibling::a[@class = 'btn btn-primary']")
    private WebElement addCurrencyButton;

    @FindBy(xpath = ".//button[@class = 'btn btn-danger']")
    private WebElement deleteCurrencyButton;

    @FindBy(xpath = ".//button[@class = 'btn btn-danger']/preceding-sibling::a[@class = 'btn btn-warning']")
    private WebElement refreshCurrencyButton;

    @FindBy(xpath = ".//div[@class = 'alert alert-success alert-dismissible']")
    private WebElement successChangesMessage;

    @FindBy(xpath = ".//button[@class = 'close']")
    private WebElement successMessageCloseButton;

    @FindBy (xpath = ".//thead//a[contains(@href, 'modified')]")
    private WebElement lastUpdatedButton;

    @FindBy (xpath = ".//tbody//following-sibling::tr[last() - 1]//input[@type = 'checkbox']")
    private WebElement inputCheckboxForRow;

    @FindBy (xpath = ".//tbody//following-sibling::tr[last() - 1]//a[@data-toggle = 'tooltip']")
    private WebElement editCurrencyButton;

    @FindBy (xpath = ".//tbody//following-sibling::tr[last() - 1]//following-sibling::td[last() - 2]")
    private WebElement currencyValue;

    @FindBy (css = "tbody tr")
    private List<WebElement> tableCurrencies;
}
