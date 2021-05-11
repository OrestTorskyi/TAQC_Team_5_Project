package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessSearchPage extends BasePage {

    @FindBy(xpath = ".//*[contains(@href, 'sub_category=true')]")
    private WebElement successSearch;

    public WebElement getSuccessSearch() {
        return successSearch;
    }
}
