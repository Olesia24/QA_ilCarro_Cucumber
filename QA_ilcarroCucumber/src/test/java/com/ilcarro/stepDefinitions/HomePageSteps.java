package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {
    @Given("User launches Chrome browser")
    public void launch_Chrome_browser(){
        new HomePage(driver).launchBrowser();
    }
    @When("User open ilCarro HomePage")
    public void open_HomePage(){
        new HomePage(driver).openUrl();
    }
    @Then("User verifies HomePage title is displayed")
    public void verify_HomePage_title(){
        new HomePage(driver).isHomePageTitleDisplayed();
    }
    @Then("User enter the city")
    public void enter_the_city(){
        new HomePage(driver).enterTheCity("Haifa, Israel" );
    }
    @Then("User enter dates")
    public void enter_dates(){
        new HomePage(driver).enterDates("4/29/2024 - 4/30/2024");
    }

    @Then("User click on Yalla button to find a car")
    public void click_on_Yalla_button(){
        new HomePage(driver).clickToFindACar();
    }
    @And("User quites browser")
    public void quit_browser(){
        new HomePage(driver).quit();
    }
}
