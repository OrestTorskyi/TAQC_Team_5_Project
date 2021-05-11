package com.opencart.steps;

import com.opencart.datamodel.FailSearchModel;
import com.opencart.datamodel.SearchModel;
import com.opencart.pages.FailSearchPage;
import com.opencart.pages.SearchPage;
import com.opencart.pages.SuccessSearchPage;
import com.opencart.repository.FailSearchModelRepository;
import com.opencart.repository.SearchModelRepository;
import com.opencart.util.DriverUtils;
import org.apache.bcel.generic.Select;
import org.testng.Assert;

public class SearchPageBL {

    private SearchPage searchPage;
    private SuccessSearchPage successSearchPage;
    private FailSearchPage failSearchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    public SearchPageBL searchProductsByKeywords() {
        SearchModel searchModel = SearchModelRepository.getSearchModel();

        inputKeywords(searchModel.getKeywords());

        clickDescriptionCheckbox();
        clickOnStartSearchButton();

        successSearchPage = new SuccessSearchPage();

        return this;
    }

    public SearchPageBL searchProductsByIncorrectKeywords() {
        FailSearchModel failSearchModel = FailSearchModelRepository.getFailSearchModel();

        inputKeywords(failSearchModel.getIncorrectKeywords());

        clickDescriptionCheckbox();
        clickOnStartSearchButton();

        failSearchPage = new FailSearchPage();

        return this;
    }

    public SearchPageBL searchProductsByCategories() {
        SearchModel searchModel = SearchModelRepository.getSearchModel();

        inputKeywords(searchModel.getKeywords());

        clickOnChooseCategory();

        clickDescriptionCheckbox();
        clickSubcategoriesCheckbox();
        clickOnStartSearchButton();

        successSearchPage = new SuccessSearchPage();

        return this;
    }

    public SearchPageBL searchProductsByIncorrectCategories() {
        FailSearchModel failSearchModel = FailSearchModelRepository.getFailSearchModel();

        inputKeywords(failSearchModel.getIncorrectKeywords());

        clickOnChooseCategory();

        clickDescriptionCheckbox();
        clickSubcategoriesCheckbox();
        clickOnStartSearchButton();

        failSearchPage = new FailSearchPage();

        return this;
    }

    //Products search
    private void inputKeywords(String keywords) {

        searchPage.getKeywordsInput().clear();
        searchPage.getKeywordsInput().sendKeys(keywords);
    }

    //Search by Categories
    private void clickOnChooseCategory() {

        searchPage.getChooseCategory().selectByVisibleText();
    }

    private void clickDescriptionCheckbox() {

        new DriverUtils().clickOnElementsJS(searchPage.getSearchInDescriptions());
    }

    private void clickSubcategoriesCheckbox() {

        new DriverUtils().clickOnElementsJS(searchPage.getSearchInSubcategories());
    }

    //Start search
    public void clickOnStartSearchButton() {

        searchPage.getStartSearchButton().click();
    }

    public void verifyUserSearching() {
        String expectedMessage = "iMac";
        Assert.assertEquals(successSearchPage.getSuccessSearch().getText(),
                expectedMessage, "Incorrect page title");
    }

    public void notVerifyUserSearching(){
        String expectedMessage = "There is no product that matches the search criteria.";
        Assert.assertEquals(failSearchPage.getFailSearch().getText(),
                expectedMessage, "Incorrect page title");
    }
}
