package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebTableLoginStepDef {

    WebTableLoginPage webTableLoginPage =new WebTableLoginPage();


    @When("user enters below credentials")
    public void user_enters_below_credentials(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
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

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
       webTableLoginPage.loginBtn.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }


}
