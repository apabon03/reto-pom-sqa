package com.alkomprar.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class SearchProductPage extends PageObject {
    /*
    @FindBy(how = How.ID, using = "js-site-search-input",timeoutInSeconds = "10")
    public WebElementFacade txtSearchProduct;

     */


    /*
    @FindBy(how = How.ID, using = "js-search-button")
    public WebElementFacade btnSearchProduct;

     */



    By txtSearchProduct = By.id("js-site-search-input");
    By btnSearchProduct = By.id("js-search-button");

    public By getTxtSearchProduct(){
        return txtSearchProduct;
    }

    public By getBtnSearchProduct(){
        return btnSearchProduct;
    }

    /*

    @FindBy(how = How.ID, using = "js-cookie-notification")
    public WebElementFacade linkCookie;


    @FindBy(how = How.XPATH, using = "//button[@class='button-primary js-cookie-notification-accept']")
    public WebElementFacade altCookies;


     */


}
