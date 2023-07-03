package com.alkomprar.pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class RegisterPage extends PageObject {
    @FindBy(how = How.ID, using = "register.firstName")
    public WebElementFacade txtName;

    @FindBy(how = How.ID, using = "register.lastName")
    public WebElementFacade txtLastName;
    @FindBy(how = How.XPATH, using = "//input[@id='register.mobileNumber']")
    public WebElementFacade txtMobileNumber;


    @FindBy(how = How.XPATH, using = "//label[@for='registerChkTermsConditions']")
    public WebElementFacade checkTermsConditions;

    @FindBy(how = How.XPATH, using = "//button[@class='button-primary btn-block js-btn-register-myaccount']")
    public WebElementFacade btnClickContinuar;




}
