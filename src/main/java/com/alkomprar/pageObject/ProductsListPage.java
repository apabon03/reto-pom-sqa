package com.alkomprar.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


import java.util.List;

public class ProductsListPage extends PageObject {

        @FindBy(how = How.CSS, using = ".js-algolia-product-click js-algolia-product-title")
        public List<WebElementFacade> productsList;


}












