package org.razvan.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.fasttrackit.org/OnlineLibrary/shortcodes/my-account/")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade usernameOrEmailAddressField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = ".button[name='login']")
    private WebElementFacade loginButton;

    public void setUsernameOrEmailAddressField(String usernameOrEmailAddress) {
        typeInto(usernameOrEmailAddressField, usernameOrEmailAddress);
    }

    public void setPasswordField(String password) {
        usernameOrEmailAddressField.sendKeys(Keys.TAB);
        waitFor(passwordField);
        typeInto(passwordField, password);
    }

    public void clickLogin() {
        clickOn(loginButton);
    }
}
