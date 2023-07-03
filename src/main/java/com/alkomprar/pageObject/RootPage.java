package com.alkomprar.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class RootPage extends PageObject {


    @FindBy(how = How.XPATH, using = "//span[text()='Mi cuenta']")
    public WebElementFacade lblMicuenta;
}
