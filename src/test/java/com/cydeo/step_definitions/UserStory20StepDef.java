package com.cydeo.step_definitions;

import com.cydeo.pages.US20HomePage;
import com.cydeo.pages.US20LogPage;
import com.cydeo.pages.US20VehiclesPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory20StepDef {

    US20LogPage US20LogPage = new US20LogPage();
    US20HomePage us20HomePage = new US20HomePage();
    US20VehiclesPage us20VehiclesPage = new US20VehiclesPage();


    @Given("user is in Vytrack login page")
    public void user_is_in_vytrack_login_page() throws InterruptedException {
        Thread.sleep(2000);
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackUrl"));
    }

    @When("user logs in")
    public void userLogsIn() throws InterruptedException {
        Thread.sleep(2000);
        US20LogPage.login(ConfigurationReader.getProperty("vytrackUsername"), ConfigurationReader.getProperty("vytrackPassword"));
    }

    @Then("user should see title {string}")
    public void userShouldSeeTitle(String expectedTitle) throws InterruptedException {
        Thread.sleep(2000);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification failed", actualTitle, expectedTitle);
    }


    @Given("I'm a user on Home page.")
    public void i_m_a_user_on_home_page() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("I'm in the Home Page.");
    }
    @When("I go to Fleet Module.")
    public void i_go_to_fleet_module() throws InterruptedException {
        Thread.sleep(2000);
        us20HomePage.fleetModule.click();
    }
    @When("I click on Vehicles.")
    public void i_click_on_vehicles() throws InterruptedException {
        Thread.sleep(2000);
        us20HomePage.vehicleModule.click();
        Thread.sleep(2000);
        Assert.assertTrue("Vehicle page URL failed", Driver.getDriver().getCurrentUrl().contains("Extend_Entity_Carreservation"));
    }
    @Then("I should be able to click Export Grid dropdown.")
    public void i_should_be_able_to_click_export_grid_dropdown() throws InterruptedException {
        Thread.sleep(6000);
        us20VehiclesPage.exportGrid.click();
        Thread.sleep(3000);
        Assert.assertTrue("Export Grid Test failed.",us20VehiclesPage.csvButton.isDisplayed());

    }

    @Then("I should see Export Grid dropdown on left side.")
    public void iShouldSeeExportGridDropdownOnLeftSide() {

        int winWidth = Driver.getDriver().manage().window().getSize().getWidth();

        int xPos = us20VehiclesPage.exportGrid.getLocation().getX();
        Assert.assertTrue("Logo position failed",xPos <= winWidth/2);
    }

    @Then("I should be able to click refresh button")
    public void iShouldBeAbleToClickRefreshButton() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue("Refresh button verification failed", us20VehiclesPage.refreshBtn.isEnabled());
        us20VehiclesPage.refreshBtn.click();
    }

    @Then("I should be able to click reset button")
    public void iShouldBeAbleToClickResetButton() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue("Refresh button verification failed", us20VehiclesPage.resetBtn.isEnabled());
        us20VehiclesPage.resetBtn.click();
    }

    @Then("I should be able to click Grid Settings button")
    public void iShouldBeAbleToClickGridSettingsButton() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue("Grid settings button verification failed", us20VehiclesPage..isEnabled());
        us20VehiclesPage.resetBtn.click();
    }
}














