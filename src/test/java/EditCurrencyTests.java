import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class EditCurrencyTests extends BaseTest {

    @Test
    public void editCurrencyStatusTestByMessage() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL editCurrency = loginAdminPageBL.loginToAdminAccount()
                .getCurrencyPage()
                .clickEditCurrencyButton()
                .changeStatusOfCurrencyForDisabled();
        editCurrency.verifyEditingCurrency();
    }

    @Test
    public void editCurrencyValueTestByComparingValues() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL currencyPageBL = loginAdminPageBL
                .loginToAdminAccount()
                .getCurrencyPage();
        currencyPageBL.sortCurrencyByLastUpdateFromOldest();
        double getInitialValueOfCurrencyInTable = currencyPageBL.getCurrencyValue();
        EditCurrencyPageBL editCurrencyPageBL = currencyPageBL.clickEditCurrencyButton();
        CurrencyPageBL resultCurrencyPageBL = editCurrencyPageBL.changeValueOfCurrency();
        resultCurrencyPageBL.clickOnRefreshCurrencyButton();
        double getResultValueOfCurrencyInTable = resultCurrencyPageBL.getCurrencyValue();
        resultCurrencyPageBL.verifyEditingCurrency(getInitialValueOfCurrencyInTable,getResultValueOfCurrencyInTable);
    }

    @Test
    public void editCurrencyValueTestByMessage() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL editCurrency = loginAdminPageBL.loginToAdminAccount()
                .getCurrencyPage()
                .clickEditCurrencyButton()
                .changeValueOfCurrency();
        editCurrency.verifyEditingCurrency();
    }
}
