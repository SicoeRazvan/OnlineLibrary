package org.razvan.steps.serenity;

import org.razvan.pages.HomePage;
import org.razvan.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;



public class LoginSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;

    @Step
    public void navigateToLogin() {
        homePage.open();
        homePage.clickOnLoginButton();
    }

    @Step
    public void enterCredentials(String usernameOrEmailAddress, String password) {
        loginPage.setUsernameOrEmailAddressField(usernameOrEmailAddress);
        loginPage.setPasswordField(password);
        loginPage.clickLogin();
    }
}
