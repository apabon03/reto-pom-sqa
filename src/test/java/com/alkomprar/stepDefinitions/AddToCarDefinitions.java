package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.ProductsListSteps;
import com.alkomprar.steps.SearchProductSteps;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class AddToCarDefinitions {

    @Steps
    SearchProductSteps searchProductSteps;
    @Steps
    ProductsListSteps productsListSteps;



    @And("^the user close the alert if exists$")
    public void theUserCloseTheAlertIfExists() {
        //searchProductSteps.closeAlert();
    }


    @And("^write product on search bar and click enter$")
    public void writeProductOnSearchBarAndClickEnter() throws IOException{
        searchProductSteps.sendProduct();
        searchProductSteps.btnSearchProduct();
    }


    @When("^the user select a product from list$")
    public void theUserSelectAProductFromList() {
        //productsListSteps.selectProduct();
    }


    @And("^click on add to card$")
    public void clickOnAddToCard() {

    }


    @Then("^see a message of product selected added successfully$")
    public void seeAMessageOfProductSelectedAddedSuccessfully() {

    }

}
