package org.razvan.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.fasttrackit.org/OnlineLibrary/shop/")
public class ShopPage extends PageObject {

    @FindBy(css = ".button.product_type_simple.add_to_cart_button.ajax_add_to_cart[data-product_id = '4208']")
    private WebElementFacade batmanTheDarkBook;

    @FindBy(css = ".button.product_type_simple.add_to_cart_button.ajax_add_to_cart[data-product_id = '75']")
    private WebElementFacade aWalkAcrrosTheSun;

    @FindBy(css = ".button.product_type_simple.add_to_cart_button.ajax_add_to_cart[data-product_id = '4364']")
    private WebElementFacade euroBike;


    @FindBy(css = "option[value = 'menu_order']")
    WebElementFacade defaultSorting;

    @FindBy(css = "option[value = 'popularity']")
    WebElementFacade popularitySorting;

    @FindBy(css = "option[value = 'rating']")
    WebElementFacade avgRatingSorting;

    @FindBy(css = "option[value = 'date']")
    WebElementFacade newnessSorting;

    @FindBy(css = "option[value = 'price']")
    WebElementFacade ascendingSorting;

    @FindBy(css = "option[value = 'price-desc']")
    WebElementFacade descendingSorting;


    public void clickOnAddBatmanBookButton(){
        clickOn(batmanTheDarkBook);
    }

    public void clickOnAddWalkAcrossTheSunBook(){
        clickOn(aWalkAcrrosTheSun);
    }

    public void clickOnAddEuroBikeBook(){
        clickOn(euroBike);
    }

    public void clickOnDefaultSorting(){
        clickOn(defaultSorting);
    }

    public void clickOnPopularitySorting(){
        clickOn(popularitySorting);
    }

    public void clickOnAvgRatingSorting(){
        clickOn(avgRatingSorting);
    }

    public void clickOnAscendingSorting(){
        clickOn(ascendingSorting);
    }

    public void clickOnDescendingSorting(){
        clickOn(descendingSorting);
    }
}
