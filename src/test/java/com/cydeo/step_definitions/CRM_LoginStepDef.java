package com.cydeo.step_definitions;

import com.cydeo.pages.CRM_LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRM_LoginStepDef {
    CRM_LoginPage crm_loginPage=new CRM_LoginPage();


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get("https://login1.nextbasecrm.com/");

    }
    @When("I entered valid credentials")
    public void i_entered_valid_credentials() {
        crm_loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("crm-username"));
        crm_loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("crm-password"));


    }
    @When("I clicked the login button")
    public void i_clicked_the_login_button() {
        crm_loginPage.loginBtn.click();

    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyTitle(Driver.getDriver(),"Portal");

    }


}
