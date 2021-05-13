import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.SearchPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class SearchByCategoriesTest extends BaseTest {
    @Test
    public void searchProductsByCategoriesWithValidParameters(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPage()
                .clickOnMainSearchButton()
                .searchProductsByCategories()
                .clickOnStartSearchButton();

        searchPageBL.verifyUserSearching();
    }

    @Test
    public void searchProductsByCategoriesWithInvalidParameters(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPage()
                .clickOnMainSearchButton()
                .searchProductsByIncorrectCategories()
                .clickOnStartSearchButton();

        searchPageBL.notVerifyUserSearching();
    }
}
