package org.razvan.features.search;

import org.razvan.steps.serenity.CartSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void checkIfAnUserCanAddAProductToCart(){
        cartSteps.navigateToShopPage();
        cartSteps.addAProductToCart();
    }

    @Test
    public void checkIfAnUserCanAddMultipleProductsToCart(){
        cartSteps.navigateToShopPage();
        cartSteps.addMultipleProductsToCart();
    }

    @Test
    public void checkIfAnUserCanRemoveABookFromCart(){
        checkIfAnUserCanAddMultipleProductsToCart();
        cartSteps.navigateToCartPage();
        cartSteps.removeABookFromCart();
    }
}
