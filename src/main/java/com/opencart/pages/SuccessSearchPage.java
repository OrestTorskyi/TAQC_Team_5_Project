package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessSearchPage extends BasePage {

    @FindBy(xpath = "//*[@id='content']/h2")
    private WebElement successSearch;

    public WebElement getSuccessSearch() {
        return successSearch;
    }
}
