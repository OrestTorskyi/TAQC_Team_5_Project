import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class DeleteCurrencyTests extends BaseTest {

    @Test
    public void deleteCurrencyTestByCountingElements() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL currencyPageBL = loginAdminPageBL
                .loginToAdminAccount()
                .getCurrencyPage();
        int getInitialCountOfElementsInTable = currencyPageBL.getSizeOfCurrencyElements();
        CurrencyPageBL currencyPageBLResult = currencyPageBL.deleteCurrency("wKtXIlQ"); // Input of currency title, which will be deleted
        int getResultCountOfElementsInTable = currencyPageBLResult.getSizeOfCurrencyElements();
        currencyPageBL.verifyDeletingCurrency(getInitialCountOfElementsInTable,getResultCountOfElementsInTable);
    }

    @Test
    public void deleteCurrencyTestByMessage() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL currencyPage = loginAdminPageBL.loginToAdminAccount()
                .getCurrencyPage()
                .deleteCurrency("WSSifsx"); // Input of currency title, which will be deleted
        currencyPage.verifyDeletingCurrency();
    }
}
