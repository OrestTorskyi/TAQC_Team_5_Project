import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class DeleteCurrencyTestByCountingElements extends BaseTest {

    @Test
    public void deleteCurrencyFromList() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        MainAdminPageBL mainAdminPageBL = loginAdminPageBL.loginToAdminAccount();
        AdminNavigationBL adminNavigationBL = mainAdminPageBL.getAdminNavigation();
        CurrencyPageBL currencyPageBL = adminNavigationBL.getToCurrencyPage();
        int getInitialCountOfElementsInTable = currencyPageBL.getSizeOfCurrencyElements();
        CurrencyPageBL currencyPageBLResult = currencyPageBL.deleteCurrency();
        int getResultCountOfElementsInTable = currencyPageBLResult.getSizeOfCurrencyElements();
        currencyPageBL.verifyDeletingCurrency(getInitialCountOfElementsInTable,getResultCountOfElementsInTable);
    }
}
