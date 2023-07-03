package com.alkomprar.steps;

import com.alkomprar.pageObject.ProductsListPage;
import com.alkomprar.utils.SelectProductRandom;

import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class ProductsListSteps {

    @Page
    ProductsListPage productsListPage;

    @Step("User select product")
    public void selectProduct(){
        List<WebElementFacade> products = productsListPage.productsList;
        int sizeProducts = products.size();

        WebElementFacade product = products.get(SelectProductRandom.generateIndexRandom(sizeProducts));
        product.click();

    }



}



