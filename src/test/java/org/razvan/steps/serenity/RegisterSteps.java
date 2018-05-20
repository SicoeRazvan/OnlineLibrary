package org.razvan.steps.serenity;

import org.razvan.pages.HomePage;
import org.razvan.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class RegisterSteps extends ScenarioSteps {

    HomePage homePage;
    RegisterPage registerPage;

    @Step
    public void navigateToRegister(){
      homePage.open();
      homePage.clickOnRegisterButton();
    }

    @Step
    public void eneterCredentials(String username,String email){
        registerPage.setUsernameField(username);
        registerPage.setemailField(email);
        registerPage.clickRegister();
    }

}
