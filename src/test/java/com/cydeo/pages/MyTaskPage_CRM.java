package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTaskPage_CRM {

    MyTaskPage_CRM myTaskPage_crm=new MyTaskPage_CRM();

    public MyTaskPage_CRM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "tasks-buttonAdd")
    public WebElement newTaskBtn;

    @FindBy(id="//label[@for='tasks-task-priority-cb']")
    public WebElement checkBox;




}
