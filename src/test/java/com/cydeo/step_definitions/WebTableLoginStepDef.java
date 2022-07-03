package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTableLoginStepDef {

    @Given("user is in web table login page")
    public void user_is_in_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {

    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

    }

}
