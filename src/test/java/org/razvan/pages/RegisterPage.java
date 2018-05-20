package org.razvan.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.fasttrackit.org/OnlineLibrary/wp-login.php?action=register")
public class RegisterPage extends PageObject {

    @FindBy(id = "user_login")
    private WebElementFacade usernameField;

    @FindBy(id = "user_email")
    private WebElementFacade emailField;

    @FindBy(id = "wp-submit")
    private WebElementFacade registerButton;

    public void setUsernameField(String userName){
        typeInto(usernameField, userName);
    }

    public void setemailField(String email){
        typeInto(emailField, email);
    }

    public void clickRegister(){
        clickOn(registerButton);
    }


}

