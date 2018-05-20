package org.razvan.steps.serenity;

import org.razvan.pages.CartPage;
import org.razvan.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CartSteps extends ScenarioSteps{


    CartPage cartPage;
    ShopPage shopPage;

    @Step
    public void navigateToShopPage(){
        shopPage.open();
    }

    @Step
    public void navigateToCartPage(){
        cartPage.open();
    }
    @Step
    public void addAProductToCart(){
        shopPage.clickOnAddBatmanBookButton();
    }

    @Step
    public void addMultipleProductsToCart(){
        shopPage.clickOnAddBatmanBookButton();
        shopPage.clickOnAddEuroBikeBook();
        shopPage.clickOnAddWalkAcrossTheSunBook();
    }

    @Step
    public void removeABookFromCart(){
        cartPage.removebatmanTheDarkBook();
    }
}
