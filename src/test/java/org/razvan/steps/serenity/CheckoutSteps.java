package org.razvan.steps.serenity;

import org.razvan.pages.CartPage;
import org.razvan.pages.CheckoutPage;
import org.razvan.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutSteps extends ScenarioSteps{

    CheckoutPage checkoutPage;
    ShopPage shopPage;

    @Step
    public void navigateToCheckoutPage(){
        checkoutPage.open();
    }

    @Step
    public void navigateToShopPage(){
        shopPage.open();
    }

    @Step
    public void addMultipleProductsToCart(){
        shopPage.clickOnAddBatmanBookButton();
        shopPage.clickOnAddEuroBikeBook();
        shopPage.clickOnAddWalkAcrossTheSunBook();
    }

    @Step
    public void enterCredentials(String firstName, String lastName, String email, String phone,String address, String apartment, String postalCode, String town){
        checkoutPage.setFirstNameField(firstName);
        checkoutPage.setLastNameField(lastName);
        checkoutPage.setEmailField(email);
        checkoutPage.setPhoneField(phone);
        checkoutPage.setAddressField(address);
        checkoutPage.setApartmentField(apartment);
        checkoutPage.setPostcodeField(postalCode);
        checkoutPage.setTownField(town);
        checkoutPage.setPlaceOrderButtonn();
    }


}
