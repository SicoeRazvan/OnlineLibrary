package org.razvan.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.fasttrackit.org/OnlineLibrary/")
public class HomePage extends PageObject{

    @FindBy(id ="menu-item-3266")
    private WebElementFacade shopButton;

    @FindBy(className ="shopping_cart_link")
    private WebElementFacade cartButton;

    @FindBy(className ="checkout_link")
    private WebElementFacade checkoutButton;

    @FindBy(id ="s")
    private WebElementFacade searchField;

    @FindBy(id ="searchsubmit")
    private WebElementFacade searchButton;

    @FindBy(className ="register_link" )
    private WebElementFacade registerButton;

    @FindBy(className ="account_login_link")
    private WebElementFacade loginButton;

    public void clickOnShopButton(){
        clickOn(shopButton);
    }
    public void clickOnCartButton(){
        clickOn(cartButton);
    }
    public void clickOnCheckoutButton(){
        clickOn(checkoutButton);
    }
    public void clickOnSearchButton(){
        clickOn(searchButton);
    }
    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }

    public void clickOnLoginButton() {
        clickOn(loginButton);
    }

    public void setSearchField(String text){
        typeInto(searchField, text);
    }
}
