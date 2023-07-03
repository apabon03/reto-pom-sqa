package com.alkomprar.steps;

import com.alkomprar.pageObject.RootPage;
import com.alkomprar.utils.Excel;

import net.thucydides.core.annotations.Step;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class RootSteps {
    RootPage rootPage = new RootPage();

    @Step("User open browser on alkomprar.com")
    public void openBrowser() throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Credentials");
        String url = data.get(0).get("url");
        rootPage.openUrl(url);
    }

    @Step("User click on label Mi Cuenta")
    public void clickMiCuenta(){

        rootPage.lblMicuenta.click();
    }
}