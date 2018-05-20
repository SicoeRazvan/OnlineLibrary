package org.razvan.steps.serenity;

import org.razvan.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SortSteps extends ScenarioSteps{

    ShopPage shopPage;

    @Step
    public void navigateToShopPage(){
        shopPage.open();
    }

    @Step
    public void clickOnDefaultSorting(){
        shopPage.clickOnDefaultSorting();
    }

    @Step
    public void clickOnPopularitySorting(){
        shopPage.clickOnPopularitySorting();
    }

    @Step
    public void clickOnAvgRatingSorting(){
        shopPage.clickOnAvgRatingSorting();
    }

    @Step
    public void clickOnAscendingSorting(){
        shopPage.clickOnAscendingSorting();
    }

    @Step
    public void clickOndescendingSorting(){
        shopPage.clickOnDescendingSorting();
    }
}
