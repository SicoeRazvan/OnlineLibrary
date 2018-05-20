package org.razvan.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.fasttrackit.org/OnlineLibrary/shortcodes/cart/")
public class CartPage extends PageObject{
    @FindBy(css =".remove[data-product_id='4208']")
    private WebElementFacade removebatmanTheDarkBook;

    public void removebatmanTheDarkBook(){
        clickOn(removebatmanTheDarkBook);
    }
}
