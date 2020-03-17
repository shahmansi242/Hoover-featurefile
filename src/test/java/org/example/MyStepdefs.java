package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();


    @Given("user is on home page")
    public void user_is_on_home_page() {
        homePage.verifyUserIsOnHomePage();

    }

    @When("user hoover over {string} category link and click on subcategory link {string}")
    public void userHooverOverCategoryLinkAndClickOnSubcategoryLink(String category, String subcategory) {
        homePage.hooverOverCategory(category);
        homePage.clickOnSubcategory(subcategory);
    }


    @Then("user should able to navigate to subcategory page {string} successfully")
    public void user_should_able_to_navigate_to_subcategory_page_successfully(String subcategory) {
        homePage.userNavigateToSubcategoryPageSuccessfully(subcategory);

    }


}
