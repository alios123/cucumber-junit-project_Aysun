package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackDashboardPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VyTrackDashboardStepDef {

    VyTrackDashboardPage vyTrackDashboardPage=new VyTrackDashboardPage();

    @Then("user should be able to see options")
    public void userShouldBeAbleToSeeOptions(List<String> expectedMenu) {

        BrowserUtils.waitFor(3);
        List<String > actualMenu=new ArrayList<>();

        for (WebElement menu: vyTrackDashboardPage.menus) {
            actualMenu.add(menu.getText());

        }
        System.out.println("actualMenu = " + actualMenu);
        Assert.assertEquals(expectedMenu,actualMenu);
    }


}
