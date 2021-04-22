package com.opencart.steps;

import com.opencart.enums.AdminDataLogin;
import com.opencart.pages.LoginAdminPage;

public class LoginAdminPageBL {

    LoginAdminPage loginAdminPage;

    public LoginAdminPageBL()
    {
        loginAdminPage = new LoginAdminPage();
    }

    public MainAdminPageBL loginToAdminAccount()
    {
        inputAdminUsername(AdminDataLogin.ADMIN);
        inputAdminPassword(AdminDataLogin.ADMIN);
        clickOnConfirmLoginButton();
        return new MainAdminPageBL();
    }

    private void inputAdminUsername(AdminDataLogin adminData)
    {
        loginAdminPage.getUsername().clear();
        loginAdminPage.getUsername().sendKeys(adminData.getLogin());
    }

    private void inputAdminPassword(AdminDataLogin adminData)
    {
        loginAdminPage.getUserPassword().clear();
        loginAdminPage.getUserPassword().sendKeys(adminData.getPassword());
    }

    private void clickOnConfirmLoginButton()
    {
        loginAdminPage.getLoginButton().click();
    }
}
