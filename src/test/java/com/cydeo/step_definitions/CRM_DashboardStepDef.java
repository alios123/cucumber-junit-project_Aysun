package com.cydeo.step_definitions;

import com.cydeo.pages.CRM_LoginPage;
import com.cydeo.pages.DashboardPageCRM;

import com.cydeo.utilities.BrowserUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CRM_DashboardStepDef {

    DashboardPageCRM dashboardPageCRM = new DashboardPageCRM();
    CRM_LoginPage crm_loginPage = new CRM_LoginPage();


    @When("I clicked the profile link")
    public void iClickedTheProfileLink() {
        BrowserUtils.waitFor(2);
        dashboardPageCRM.userProfileLink.click();
        BrowserUtils.waitForVisibility(dashboardPageCRM.userProfileLink, 2);
        dashboardPageCRM.logOutButton.click();
    }

    @Then("I should be logged out")
    public void iShouldBeLoggedOut() {
        System.out.println("loginCRMPage.loginPageTopic.getText() = " + crm_loginPage.loginPageTopic.getText());
        Assert.assertEquals(crm_loginPage.loginPageTopic.getText(), "Authorization");

    }

    @Given("that I am logged in to the Nextbase CRM dashboard")
    public void that_i_am_logged_in_to_the_nextbase_crm_dashboard() {
       CRM_LoginPage.login();
    }
    @When("I navigate to the {string} module")
    public void i_navigate_to_the_module(String taskModule) {
        dashboardPageCRM.taskModuleBtn.click();
    }

    @Then("I should see a header named {string}")
    public void i_should_see_a_header_named(String expected) {
        BrowserUtils.waitForVisibility(dashboardPageCRM.taskPageHeader,5);
        Assert.assertEquals(expected,dashboardPageCRM.taskPageHeader.getText());
    }

    @When("I click new task button")
    public void i_click_new_task_button() {
       Assert.assertTrue(dashboardPageCRM.newTaskHeader.isDisplayed());
        System.out.println("changed");
    }



}




