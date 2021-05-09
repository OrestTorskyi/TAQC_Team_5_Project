import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class AddNewCurrencyTests extends BaseTest {

    @Test
    public void addNewCurrencyTestByCountingElements() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL currencyPageBL = loginAdminPageBL
                .loginToAdminAccount()
                .getCurrencyPage();
        int getInitialCountOfElementsInTable = currencyPageBL.getSizeOfCurrencyElements();
        AddNewCurrencyPageBL addNewCurrencyPageBL = currencyPageBL.clickAddNewCurrencyButton();
        CurrencyPageBL currencyPageBLResult = addNewCurrencyPageBL.addNewCurrency();
        int getResultCountOfElementsInTable = currencyPageBLResult.getSizeOfCurrencyElements();
        currencyPageBLResult.verifyAddingNewCurrency(getInitialCountOfElementsInTable, getResultCountOfElementsInTable);
    }

    @Test
    public void addNewCurrencyTestByMessage() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL currencyPage = loginAdminPageBL.loginToAdminAccount()
                .getCurrencyPage()
                .clickAddNewCurrencyButton()
                .addNewCurrency();
        currencyPage.verifyAddingNewCurrency();
    }
}
