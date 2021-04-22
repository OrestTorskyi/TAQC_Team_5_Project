import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.pages.AdminNavigation;
import com.opencart.pages.LoginAdminPage;
import com.opencart.steps.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddNewCurrencyTestByMessage extends BaseTest {



    @Test
    public void addNewCurrency()
    {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();

        CurrencyPageBL currencyPage = loginAdminPageBL.loginToAdminAccount()
                .getAdminNavigation()
                .getToCurrencyPage()
                .getToAddingNewCurrency()
                .addNewCurrency();
        currencyPage.verifyAddingNewCurrency();



        /*MainAdminPageBL mainAdminPageBL = loginAdminPageBL.loginToAdminAccount();
        AdminNavigationBL adminNavigationBL = mainAdminPageBL.getAdminNavigation();
        CurrencyPageBL currencyPageBL = adminNavigationBL.getToCurrencyPage();
        int getInitialCountOfElementsInTable = currencyPageBL.getSizeOfCurrencyElements();
        AddNewCurrencyPageBL addNewCurrencyPageBL = currencyPageBL.getToAddingNewCurrency();
        addNewCurrencyPageBL.addNewCurrency();
        int getResultCountOfElementsInTable = addNewCurrencyPageBL.getSizeOfCurrencyElements();
        addNewCurrencyPageBL.verifyAddingNewCurrency(getInitialCountOfElementsInTable,getResultCountOfElementsInTable);*/

    }
}
