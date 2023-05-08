package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

public class vyTrackLoginStepDef {
    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();

    @Given("user go to vyTrack login page")
    public void userGoToVyTrackLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @When("user enters {string} , {string} and click login button")
    public void userEntersAndClickLoginButton(String username, String password) {

        vyTrackLoginPage.inputUsername.sendKeys(username);
        vyTrackLoginPage.inputPassword.sendKeys(password);
        vyTrackLoginPage.clickLoginBtn.click();
    }

    @When("user enters credentials and click login button")
    public void userEntersCredentialsAndClickLoginButton() {
        vyTrackLoginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("vytrack.username"));
        vyTrackLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("vytrack.password"));
        vyTrackLoginPage.clickLoginBtn.click();


    }

    @Then("user should be able see dashboard title")
    public void userShouldBeAbleSeeDashboardTitle() {
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyTitle(Driver.getDriver(), "Dashboard");
    }



}