package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Netflix_Test {

    @Given("I like {string}")
    public void i_like(String string) {
        System.out.println("this from given string form");
    }
        @Given("I like")
        public void i_like(List<String> movieTypes) {

            System.out.println(movieTypes);
        }

        @Given("I like below favorite movie with certain type")
        public void i_like_below_favorite_movie_with_certain_type(Map<String,String> favouriteMovie) {

            System.out.println(favouriteMovie);
            System.out.println("favouriteMovie.get(\"actions\") = " + favouriteMovie.get("actions"));
        }


    @When("I go to homepage")
    public void i_go_to_homepage() {

    }
    @Then("I should get right recommendation")
    public void i_should_get_right_recommendation() {


    }





}
