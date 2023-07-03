package com.alkomprar.steps;

import com.alkomprar.pageObject.EmailVerificationPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class EmailVerificationSteps {

    EmailVerificationPage emailVerificationPage = new EmailVerificationPage();

    @Step("User Validates and enter his email")
    public void sendEmail() throws IOException{

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Credentials");
        String email = data.get(0).get("email");
        emailVerificationPage.txtEmail.click();
        emailVerificationPage.txtEmail.sendKeys(email);

    }

    @Step("User Click on button Continuar")
    public void clickContinuar(){
        emailVerificationPage.btnContinuar.click();
    }
}


