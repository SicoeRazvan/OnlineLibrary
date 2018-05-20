package org.razvan.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.fasttrackit.org/OnlineLibrary/shortcodes/checkout/")
public class CheckoutPage extends PageObject {

    @FindBy(id = "billing_first_name")
    WebElementFacade firstNameField;

    @FindBy(id = "billing_last_name")
    WebElementFacade lastNameField;

    @FindBy(id = "billing_email")
    WebElementFacade emailField;

    @FindBy(id = "billing_phone")
    WebElementFacade phoneField;

    @FindBy(id =  "billing_address_1")
    WebElementFacade streetaddressField;

    @FindBy(id =  "billing_address_2")
    WebElementFacade apartmentaddressField;

    @FindBy(id =  "billing_city")
    WebElementFacade townField;

    @FindBy(id =  "billing_postcode")
    WebElementFacade postcodeField;

    @FindBy(id = "payment_method_bacs")
    WebElementFacade directBankTranferButton;

    @FindBy(id = "payment_method_cheque")
    WebElementFacade checkPaymentsButton;

    @FindBy(id = "payment_method_cheque")
    WebElementFacade cashOnDeliveryButton;

    @FindBy(id = "place_order")
    WebElementFacade placeOrderButton;

    public void setFirstNameField(String text){
        typeInto(firstNameField, text);
    }

    public void setLastNameField(String text){
        typeInto(lastNameField, text);
    }

    public void setEmailField(String text){
        typeInto(emailField, text);
    }

    public void setPhoneField(String text){
        typeInto(phoneField, text);
    }

    public void setApartmentField(String text){
        typeInto(apartmentaddressField, text);
    }

    public void setAddressField(String text){
        typeInto(streetaddressField, text);
    }

    public void setTownField(String text){
        typeInto(townField, text);
    }

    public void setPostcodeField(String text){
        typeInto(postcodeField, text);
    }

    public void setPlaceOrderButtonn(){
        clickOn(placeOrderButton);
    }
}
