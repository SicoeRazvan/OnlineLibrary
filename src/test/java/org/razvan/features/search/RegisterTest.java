package org.razvan.features.search;

import org.razvan.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private RegisterSteps registerSteps;

    private String userName = "lupasco";
    private String userEmail = "lupasco@yahoo.com";
    private String invaliduserName = "wrong";
    private String invaliduserEmail = "xyz.com";
    private String nouserName = " ";
    private String nouserEmail = " ";
    private String biguserName = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    private String biguserEmail = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxy@yahoo.com";

    @Test
    public void testRegisterWithAValidAccount() {
        registerSteps.navigateToRegister();
        registerSteps.eneterCredentials(userName, userEmail);
    }

    @Test
    public void testRegisterWithAInvalidAccount() {
        registerSteps.navigateToRegister();
        registerSteps.eneterCredentials(invaliduserName, invaliduserEmail);
    }

    @Test
    public void testRegisterWithoutCredentials() {
        registerSteps.navigateToRegister();
        registerSteps.eneterCredentials(nouserName, nouserEmail);
    }

    @Test
    public void testRegisterWithBigUserName() {
        registerSteps.navigateToRegister();
        registerSteps.eneterCredentials(biguserName, userEmail);
    }

    @Test
    public void testRegisterWithBigUserEmail() {
        registerSteps.navigateToRegister();
        registerSteps.eneterCredentials(userName, biguserEmail);
    }
}
