package com.alkomprar.steps;

import com.alkomprar.pageObject.SearchProductPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class SearchProductSteps {
    SearchProductPage searchProductPage = new SearchProductPage();
    /*
    @Step("User close the alert if exist")
    public void closeAlert(){
        if(searchProductPage.linkCookie.isDisplayed()){
            searchProductPage.altCookies.click();
        }
    }

     */

    @Step("User search product on search engine")
    public void sendProduct() throws IOException{

        ArrayList<Map<String, String>> data  = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Credentials");
        String product = data.get(0).get("product");
        searchProductPage.getDriver().findElement(searchProductPage.getTxtSearchProduct()).clear();
        searchProductPage.getDriver().findElement(searchProductPage.getTxtSearchProduct()).sendKeys(product);

    }

    public void btnSearchProduct(){

        JavascriptExecutor JsExec = (JavascriptExecutor) searchProductPage.getDriver();
        JsExec.executeScript("arguments[0].click();",searchProductPage.getDriver().findElement(searchProductPage.getBtnSearchProduct()));
        //System.out.println("Hola mundo");
    }






}







