package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginStepDef {

    WebTableLoginPage webTableLoginPage =new WebTableLoginPage();


    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));
    }

    @When("user enters username {string} , password {string} and login")
    public void user_enters_username_password_and_login(String username, String password) {
        webTableLoginPage.login(username,password);
    }


    @Given("user is in web table login page")
    public void user_is_in_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
      webTableLoginPage.inputUserName.sendKeys(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
     webTableLoginPage.inputPassword.sendKeys(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webTableLoginPage.loginBtn.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("I create new contact")
    public void i_create_new_contact(Map<String,String> in) {
        System.out.println("***first_name:"+in.get("first_name"));
        System.out.println("***last_name:"+in.get("last_name"));
        System.out.println("***cell_phone:"+in.get("cell_phone"));
        System.out.println("***off_phone:"+in.get("off_phone"));
    }
    @Then("I should see contact info for {string}")
    public void i_should_see_contact_info_for(String string) {
        System.out.println("***Output: "+string);
    }

}
