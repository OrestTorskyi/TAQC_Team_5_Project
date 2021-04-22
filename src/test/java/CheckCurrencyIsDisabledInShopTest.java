import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class CheckCurrencyIsDisabledInShopTest extends BaseTest {

    @Test
    public void editCurrencyValue() {

        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());

        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        MainAdminPageBL mainAdminPageBL = loginAdminPageBL.loginToAdminAccount();
        AdminNavigationBL adminNavigationBL = mainAdminPageBL.getAdminNavigation();
        CurrencyPageBL currencyPageBL = adminNavigationBL.getToCurrencyPage();
        currencyPageBL.sortCurrencyByLastUpdateFromOldest();
        String disabledCurrencyTitle = currencyPageBL.getCurrencyTitle();
        EditCurrencyPageBL editCurrencyPageBL = currencyPageBL.getToEditCurrencyPage();
        editCurrencyPageBL.changeStatusOfCurrencyForDisabled();

        new Navigation().navigateToUrl(URLs.BASE_URL.getUrl());
        MainPageBL mainPageBL = new MainPageBL();
        HeaderPageBL headerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCurrencyDropdownButton()
                .verifyCurrencyDisabled(disabledCurrencyTitle);
    }
}
