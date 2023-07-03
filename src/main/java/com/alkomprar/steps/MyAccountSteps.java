package com.alkomprar.steps;

import com.alkomprar.pageObject.MyAccountPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class MyAccountSteps {

    MyAccountPage myAccountPage = new MyAccountPage();


    @Step("Validation user register successfully")
    public void verifyRegister(){
        Assert.assertThat(
                myAccountPage.headerSession.getText(),
                Matchers.is("Mi cuenta")
        );
    }


}
