import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class DeleteCurrencyTestByMessage extends BaseTest {

    @Test
    public void deleteCurrencyFromList() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL currencyPage = loginAdminPageBL.loginToAdminAccount()
                .getAdminNavigation()
                .getToCurrencyPage()
                .deleteCurrency();
        currencyPage.verifyDeletingCurrency();
    }
}
