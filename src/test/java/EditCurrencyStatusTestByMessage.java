import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.CurrencyPageBL;
import com.opencart.steps.LoginAdminPageBL;
import org.testng.annotations.Test;

public class EditCurrencyStatusTestByMessage extends BaseTest {

    @Test
    public void editCurrencyStatus() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        CurrencyPageBL editCurrency = loginAdminPageBL.loginToAdminAccount()
                .getAdminNavigation()
                .getToCurrencyPage()
                .getToEditCurrencyPage()
                .changeStatusOfCurrencyForDisabled();
        editCurrency.verifyEditingCurrency();
    }
}
