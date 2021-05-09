import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class CheckCurrencyStatusInShopTests extends BaseTest {

    @Test
    public void checkCurrencyIsDisabledTest() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        MainAdminPageBL mainAdminPageBL = loginAdminPageBL.loginToAdminAccount();
        AdminNavigationBL adminNavigationBL = mainAdminPageBL.getAdminNavigation();
        CurrencyPageBL currencyPageBL = adminNavigationBL.getToCurrencyPage();
        currencyPageBL.sortCurrencyByLastUpdateFromOldest();
        String disabledCurrencyTitle = currencyPageBL.getCurrencyTitle();
        EditCurrencyPageBL editCurrencyPageBL = currencyPageBL.clickEditCurrencyButton();
        editCurrencyPageBL.changeStatusOfCurrencyForDisabled();

        new Navigation().navigateToUrl(URLs.BASE_URL.getUrl());
        MainPageBL mainPageBL = new MainPageBL();
        HeaderPageBL headerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCurrencyDropdownButton()
                .verifyCurrencyDisabled(disabledCurrencyTitle);
    }

    @Test
    public void checkCurrencyIsEnabledTest() {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();
        MainAdminPageBL mainAdminPageBL = loginAdminPageBL.loginToAdminAccount();
        AdminNavigationBL adminNavigationBL = mainAdminPageBL.getAdminNavigation();
        CurrencyPageBL currencyPageBL = adminNavigationBL.getToCurrencyPage();
        currencyPageBL.sortCurrencyByLastUpdateFromOldest();
        String disabledCurrencyTitle = currencyPageBL.getCurrencyTitle();
        EditCurrencyPageBL editCurrencyPageBL = currencyPageBL.clickEditCurrencyButton();
        editCurrencyPageBL.changeStatusOfCurrencyForEnabled();

        new Navigation().navigateToUrl(URLs.BASE_URL.getUrl());
        MainPageBL mainPageBL = new MainPageBL();
        HeaderPageBL headerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCurrencyDropdownButton()
                .verifyCurrencyEnabled(disabledCurrencyTitle);
    }
}
