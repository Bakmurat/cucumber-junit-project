package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US20HomePage {
    public US20HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetModule;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[1]")
    public WebElement vehicleModule;

    
}
