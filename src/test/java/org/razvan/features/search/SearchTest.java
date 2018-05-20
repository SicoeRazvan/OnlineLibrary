package org.razvan.features.search;

import org.razvan.pages.HomePage;
import org.razvan.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    private  SearchSteps searchSteps;

    private String existentProduct = "fluturi";
    private String nonExistentProduct = "sefrgrerhre";
    private String a_z_input = "AĂÂBCDEFGHIÎJKLMNOPQRSȘTȚUVWXYZ";
    private String zeroToNine = "123456789";
    private String specialCharacters = "{   [    (     ~    !   @    #    $      %      ^     &     *   ";


    @Test
    public void testSearchWithAnExistentProduct(){
        searchSteps.navigateToHomePage();
        searchSteps.enterCredentials(existentProduct);
    }

    @Test
    public void testSearchWithAnNonExistentProduct(){
        searchSteps.navigateToHomePage();
        searchSteps.enterCredentials(nonExistentProduct);
    }

    @Test
    public void testSearchWithEnterLettersAToZ(){
        searchSteps.navigateToHomePage();
        searchSteps.enterCredentials(a_z_input);
    }

    @Test
    public void testSearchWithEnterNumbers() {
        searchSteps.navigateToHomePage();
        searchSteps.enterCredentials(zeroToNine);
    }

    @Test
    public void testSearchWithEnterSpecialCharacters() {
        searchSteps.navigateToHomePage();
        searchSteps.enterCredentials(specialCharacters);
    }

    @Test
    public void testSearchWithEnterSpecialCharacter() {

    }
}
