package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_LoginPage {

    public CRM_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy( xpath = "//input[@placeholder='Login']")
    public WebElement inputEmail;
    @FindBy(xpath="//input[@placeholder='Password']")
    public WebElement inputPassword;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;
    @FindBy(xpath = "//div[@class='log-popup-header']")
    public WebElement loginPageTopic;

    public static void login(){
        CRM_LoginPage crm_loginPage=new CRM_LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("crm-env"));
        crm_loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("crm-username"));
        crm_loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("crm-password"));
        crm_loginPage.loginBtn.click();

    }

}
