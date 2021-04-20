package com.opencart.navigation;

import com.opencart.driver.DriverRepository;
import org.openqa.selenium.WebDriver;

public class Navigation {

    private WebDriver webDriver;

    public Navigation() {
        webDriver = DriverRepository.DRIVERS.get();
    }

    public void navigateToUrl(String url) {
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }
}
