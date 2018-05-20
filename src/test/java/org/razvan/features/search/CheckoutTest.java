package org.razvan.features.search;

import org.razvan.steps.serenity.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private CheckoutSteps checkoutSteps;

    ///Valid credentials
    private String firstName = "Andrei";
    private String lastName = "Pop";
    private String email = "andreipop@gmail.com";
    private String phone = "0744558976";
    private String address = "Observatorului, nr.60";
    private String apartment = "ap.23";
    private String postalCode = "455000";
    private String town = "Cluj";

    ///Invalid credentials
    private String invalidFirstName = "qdwqdw";
    private String invalidLastName = "wqdqwdwq";
    private String invalidEmail = "awqdqqdwd";
    private String invalidPhone = "656565959595";
    private String invalidAddress = "qdwqdwqdqwdqwd";
    private String invalidApartment = "dwqdwqdwq";
    private String invalidPostalCode = "5545454544656";
    private String invalidTown = "qwdqwdwqdqwd";

    @Test
    public void checkIfAnUserCanProceedToCheckoutWithValidCredentials(){
        checkoutSteps.navigateToShopPage();
        checkoutSteps.addMultipleProductsToCart();
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.enterCredentials(firstName, lastName, email, phone, address, apartment, postalCode, town);
    }

    @Test
    public void checkIfAnUserCanProceedToCheckoutWithInvalidCredentials(){
        checkoutSteps.navigateToShopPage();
        checkoutSteps.addMultipleProductsToCart();
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.enterCredentials(invalidFirstName, invalidLastName, invalidEmail, invalidPhone, invalidAddress, invalidApartment, invalidPostalCode, invalidTown);
    }
}
