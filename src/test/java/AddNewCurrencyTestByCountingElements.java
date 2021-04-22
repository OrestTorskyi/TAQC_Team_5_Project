import com.opencart.enums.URLs;
import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

public class AddNewCurrencyTestByCountingElements extends BaseTest {



    @Test
    public void addNewCurrency()
    {
        new Navigation().navigateToUrl(URLs.ADMIN_URL.getUrl());
        LoginAdminPageBL loginAdminPageBL = new LoginAdminPageBL();

        MainAdminPageBL mainAdminPageBL = loginAdminPageBL.loginToAdminAccount();
        AdminNavigationBL adminNavigationBL = mainAdminPageBL.getAdminNavigation();
        CurrencyPageBL currencyPageBL = adminNavigationBL.getToCurrencyPage();
        int getInitialCountOfElementsInTable = currencyPageBL.getSizeOfCurrencyElements();
        AddNewCurrencyPageBL addNewCurrencyPageBL = currencyPageBL.getToAddingNewCurrency();
        CurrencyPageBL currencyPageBLResult = addNewCurrencyPageBL.addNewCurrency();
        int getResultCountOfElementsInTable = currencyPageBLResult.getSizeOfCurrencyElements();
        currencyPageBLResult.verifyAddingNewCurrency(getInitialCountOfElementsInTable,getResultCountOfElementsInTable);

    }
}
