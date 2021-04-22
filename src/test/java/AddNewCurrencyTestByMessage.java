import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class AddNewCurrencyTestByMessage extends BaseTest {

    @Test
    public void addNewCurrency() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL currencyPage = loginAdminPageBL.loginToAdminAccount()
                .getAdminNavigation()
                .getToCurrencyPage()
                .getToAddingNewCurrency()
                .addNewCurrency();
        currencyPage.verifyAddingNewCurrency();
    }
}
