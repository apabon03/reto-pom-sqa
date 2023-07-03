package com.alkomprar.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//div[@class='account-section-header visible module-title']")
    public WebElementFacade headerSession;
}
