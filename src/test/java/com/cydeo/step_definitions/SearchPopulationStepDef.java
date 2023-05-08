package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchPopulationStepDef {
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    @When("user searches for population of {string}")
    public void userSearchesForPopulationOf(String country) {
        googleSearchPage.searchBox.sendKeys("population of "+country+ Keys.ENTER);
        System.out.println("googleSearchPage.populationResult= "+country+"  " + googleSearchPage.populationResult.getText());
    }

    @Then("user should see {string}")
    public void userShouldSee(String numbersOfPopulation) {
        Assert.assertEquals(numbersOfPopulation,googleSearchPage.populationResult.getText());

    }
}
