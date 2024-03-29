package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="q")
    public WebElement searchBox;
    @FindBy(xpath = "//div[@class='kp-header']//a[@class='FLP8od']")
    public WebElement capitalResult;
    @FindBy(xpath = "//div[@class='ayqGOc kno-fb-ctx KBXm4e']")
    public WebElement populationResult;


}
