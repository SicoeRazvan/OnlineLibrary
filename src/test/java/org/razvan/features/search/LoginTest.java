package org.razvan.features.search;

import org.razvan.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private LoginSteps loginSteps;

    private String userNameOrEmailAddress = "lupasco.serghei@yahoo.com";
    private String password = "Lupasco:1234";
    private String invaliduserNameOrEmailAddress = "lupascoyahoo.com";
    private String invalidpassword = "1234";
    private String nouserNameOrEmailAddress = "   ";
    private String nopassword = "   ";

    @Test
    public void testLoginWithAValidEmail() {
        loginSteps.navigateToLogin();
        loginSteps.enterCredentials(userNameOrEmailAddress, password);

    }

    @Test
    public void testLoginWithAnInvalidEmail() {
        loginSteps.navigateToLogin();
        loginSteps.enterCredentials(invaliduserNameOrEmailAddress, invalidpassword);
    }

    @Test
    public void testLoginWithNoEmail() {
        loginSteps.navigateToLogin();
        loginSteps.enterCredentials(nouserNameOrEmailAddress, password);
    }

    @Test
    public void testLoginWithNoEmailAndNoPassword() {
        loginSteps.navigateToLogin();
        loginSteps.enterCredentials(nouserNameOrEmailAddress, nopassword);
    }
}


