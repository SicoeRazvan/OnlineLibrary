package org.razvan.features.search;

import org.razvan.steps.serenity.SortSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SortTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private SortSteps sortSteps;

    @Test
    public void checkIfSortingWorksByDefaultSorting(){
        sortSteps.navigateToShopPage();
        sortSteps.clickOnDefaultSorting();
    }

    @Test
    public void checkIfSortingWorksByPopularitySorting(){
        sortSteps.navigateToShopPage();
        sortSteps.clickOnPopularitySorting();
    }

    @Test
    public void checkIfSortingWorksByAvgSorting(){
        sortSteps.navigateToShopPage();
        sortSteps.clickOnAvgRatingSorting();
    }

    @Test
    public void checkIfSortingWorksByAscendingSorting(){
        sortSteps.navigateToShopPage();
        sortSteps.clickOnAscendingSorting();
    }

    @Test
    public void checkIfSortingWorksByDescendingSorting(){
        sortSteps.navigateToShopPage();
        sortSteps.clickOndescendingSorting();
    }
}
