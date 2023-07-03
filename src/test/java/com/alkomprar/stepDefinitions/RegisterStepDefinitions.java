package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.EmailVerificationSteps;
import com.alkomprar.steps.MyAccountSteps;
import com.alkomprar.steps.RegisterSteps;
import com.alkomprar.steps.RootSteps;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegisterStepDefinitions {

    @Steps
    RootSteps rootSteps;
    @Steps
    EmailVerificationSteps emailVerificationSteps;

    @Steps
    RegisterSteps registerSteps;

    @Steps
    MyAccountSteps myAccountSteps;



    @Given("^The user opens the page alkomprar$")
    public void theUserOpensThePageAlkomprar() throws IOException{
        rootSteps.openBrowser();
    }


    @And("^click on label mi cuenta$")
    public void clickOnLabelMiCuenta() {

        rootSteps.clickMiCuenta();
    }


    @And("^the user enter his email and click on button continuar$")
    public void theUserEnterHisEmailAndClickOnButtonContinuar() throws IOException{
        emailVerificationSteps.sendEmail();
        emailVerificationSteps.clickContinuar();
    }

    @When("^fills in the required fields with their data and click on button continuar$")
    public void fillsInTheRequiredFieldsWithTheirDataAndClickOnButtonContinuar() throws IOException{
        registerSteps.sendName();
        registerSteps.sendLastName();
        registerSteps.sendNumberPhone();
        registerSteps.verifyTerms();
        registerSteps.clickBtnContinuar();
    }

    @Then("^the user can see the title$")
    public void theUserCanSeeTheTitle() {
        myAccountSteps.verifyRegister();
    }
}

