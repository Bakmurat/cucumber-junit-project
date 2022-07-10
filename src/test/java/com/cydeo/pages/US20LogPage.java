package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US20LogPage {
    public US20LogPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="prependedInput")
    public WebElement inputUserName;

    @FindBy(id="prependedInput2")
    public WebElement inputPassword;

    @FindBy(id="_submit")
    public WebElement loginBtn;

    public void login(String username,String password){
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();
    }
}
