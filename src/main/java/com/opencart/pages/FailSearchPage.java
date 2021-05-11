package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FailSearchPage extends BasePage {

    @FindBy(xpath = "//*[@id='content']/p[2]")
    private WebElement failSearch;

    public WebElement getFailSearch() {
        return failSearch;
    }
}
