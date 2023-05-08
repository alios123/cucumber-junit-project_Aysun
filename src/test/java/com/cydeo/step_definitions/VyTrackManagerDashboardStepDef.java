package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.pages.VyTrackManagerDashboardPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VyTrackManagerDashboardStepDef {
    VyTrackLoginPage vyTrackLoginPage=new VyTrackLoginPage();
    VyTrackManagerDashboardPage vyTrackManagerDashboardPage=new VyTrackManagerDashboardPage();

    @Then("user should see difference navigation")
    public void user_should_see_difference_navigation(List<String > expectedMenu) {
        BrowserUtils.waitFor(3);
        List<String> actualMenu=new ArrayList<>();
        for (WebElement menu: vyTrackManagerDashboardPage.menus) {
            actualMenu.add(menu.getText());

        }
        System.out.println("actualMenu = " + actualMenu);
        Assert.assertEquals(actualMenu,expectedMenu);
    }

    @When("user choose manager {string}")
    public void user_choose_manager(String roleName) throws IOException {
        String path="VyTrack.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=workbook.getSheet("data");
        String username="";
        String password="";

        switch(roleName){
            case "Sales":
                username=sheet.getRow(3).getCell(0).toString();
                 password=sheet.getRow(3).getCell(1).toString();

                break;
            case "Store":
                username=sheet.getRow(4).getCell(0).toString();
                password=sheet.getRow(4).getCell(1).toString();

                break;
        }

        vyTrackLoginPage.inputUsername.sendKeys(username);
        vyTrackLoginPage.inputPassword.sendKeys(password);
        vyTrackLoginPage.clickLoginBtn.click();

    }



    @Then("user should be able see dashboard page")
    public void userShouldBeAbleSeeDashboardPage() {
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyTitle(Driver.getDriver(),"Dashboard");
    }
}
