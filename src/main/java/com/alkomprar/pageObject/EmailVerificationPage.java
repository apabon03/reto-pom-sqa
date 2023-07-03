package com.alkomprar.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class EmailVerificationPage extends PageObject {

    @FindBy(how = How.ID, using = "js-login-email")
    public WebElementFacade txtEmail;

    @FindBy(how = How.ID, using = "js-login-continue")
    public WebElementFacade btnContinuar;
}









