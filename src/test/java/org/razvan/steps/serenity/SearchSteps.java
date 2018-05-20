package org.razvan.steps.serenity;

import org.razvan.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps{

    HomePage homePage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void enterCredentials(String text){
        homePage.setSearchField(text);
        homePage.clickOnSearchButton();
    }
}
