import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class EditCurrencyValueTestByComparingValues extends BaseTest {

    @Test
    public void editCurrencyValue() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        MainAdminPageBL mainAdminPageBL = loginAdminPageBL.loginToAdminAccount();
        AdminNavigationBL adminNavigationBL = mainAdminPageBL.getAdminNavigation();
        CurrencyPageBL currencyPageBL = adminNavigationBL.getToCurrencyPage();
        currencyPageBL.sortCurrencyByLastUpdateFromOldest();
        double getInitialValueOfCurrencyInTable = currencyPageBL.getCurrencyValue();
        EditCurrencyPageBL editCurrencyPageBL = currencyPageBL.getToEditCurrencyPage();
        CurrencyPageBL resultCurrencyPageBL = editCurrencyPageBL.changeValueOfCurrency();
        resultCurrencyPageBL.clickOnRefreshCurrencyButton();
        double getResultValueOfCurrencyInTable = resultCurrencyPageBL.getCurrencyValue();
        resultCurrencyPageBL.verifyEditingCurrency(getInitialValueOfCurrencyInTable,getResultValueOfCurrencyInTable);
    }
}
