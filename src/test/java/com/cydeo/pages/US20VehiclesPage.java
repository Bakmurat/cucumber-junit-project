package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US20VehiclesPage {
    public US20VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[title~='of']")
    public WebElement exportGrid;

    @FindBy(css = "a[title='CSV']")
    public WebElement csvButton;

    @FindBy(css = ".refresh-action")
    public WebElement refreshBtn;

}
