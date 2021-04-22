package com.opencart.pages;

import com.opencart.driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public BasePage() {
        webDriver = DriverRepository.DRIVERS.get();
        webDriverWait = new WebDriverWait(webDriver, 300);
        PageFactory.initElements(webDriver, this);
    }
}
