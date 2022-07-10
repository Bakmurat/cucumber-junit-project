package com.cydeo.step_definitions;

import com.cydeo.pages.US20LogPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory20StepDef {

    US20LogPage US20LogPage = new US20LogPage();

    @Given("user is in Vytrack login page")
    public void user_is_in_vytrack_login_page() throws InterruptedException {
        Thread.sleep(2000);
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackUrl"));
        Thread.sleep(2000);
    }

    @When("user logs in")
    public void userLogsIn() throws InterruptedException {
        Thread.sleep(2000);
        US20LogPage.login(ConfigurationReader.getProperty("vytrackUsername"), ConfigurationReader.getProperty("vytrackPassword"));
        Thread.sleep(2000);
    }

    @Then("user should see title {string}")
    public void userShouldSeeTitle(String expectedTitle) throws InterruptedException {
        Thread.sleep(2000);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification failed", actualTitle, expectedTitle);
        Thread.sleep(2000);
    }
}
