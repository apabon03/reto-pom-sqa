
package com.alkomprar.steps;

import com.alkomprar.pageObject.RegisterPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();

    @Step("User fills required fields name with his name")
    public void sendName() throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Credentials");
        String name = data.get(0).get("name");
        registerPage.txtName.clear();
        registerPage.txtName.sendKeys(name);
    }

    @Step("User fills required fields lastname with his lastname")
    public void sendLastName() throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Credentials");
        String lastName = data.get(0).get("lastname");
        registerPage.txtLastName.clear();
        registerPage.txtLastName.sendKeys(lastName);
    }

    @Step("User fills required fields mobileNumber with his Mobile number")
    public void sendNumberPhone() throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Credentials");
        String numberPhone = data.get(0).get("numberPhone");
        registerPage.txtMobileNumber.click();
        registerPage.txtMobileNumber.sendKeys(numberPhone);
    }


    @Step("User check terms and conditions form")
    public void verifyTerms(){
        registerPage.checkTermsConditions.waitUntilClickable().click();

    }

    @Step("User click on button Continuar")
    public void clickBtnContinuar(){
        registerPage.btnClickContinuar.click();
    }



}