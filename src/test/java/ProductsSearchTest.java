import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.SearchPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class ProductsSearchTest extends BaseTest {

    @Test
    public void searchProductsWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPage()
                .clickOnMainSearchButton()
                .searchProductsByKeywords()
                .clickOnStartSearchButton();

        searchPageBL.verifyUserSearching();
    }

    @Test
    public void searchProductsWithInvalidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPage()
                .clickOnMainSearchButton()
                .searchProductsByIncorrectKeywords()
                .clickOnStartSearchButton();

        searchPageBL.notVerifyUserSearching();
    }
}
