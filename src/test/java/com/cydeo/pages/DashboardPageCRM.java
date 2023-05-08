package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageCRM {

    public DashboardPageCRM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement userProfileLink;
    @FindBy(xpath ="//span[normalize-space()='Log out']")
    public WebElement logOutButton;
    @FindBy(xpath = "//a[@title=\"Tasks\"]")
    public WebElement taskModuleBtn;
    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement taskPageHeader;
    @FindBy(xpath = "//a[@id='tasks-buttonAdd']")
    public WebElement addTask;
    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement newTaskHeader;
}
