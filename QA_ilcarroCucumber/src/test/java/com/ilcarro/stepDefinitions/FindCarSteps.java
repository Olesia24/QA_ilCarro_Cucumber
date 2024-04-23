package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.FindCarPage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class FindCarSteps {
    @And("User click on Ok button")
    public void click_on_Ok_button(){
        new FindCarPage(driver).clickOnOkButton();
    }
    @And("User enter the city")
    public void enter_the_city(){
        new LoginPage(driver).pause(1000);
        new FindCarPage(driver).enterTheCity("Haifa" );
    }
    @And("User enter dates")
    public void enter_dates(){
        new FindCarPage(driver).enterDates("4/29/2024 - 4/30/2024");
    }

    @And("User click on Yalla button to find a car")
    public void click_on_Yalla_button(){
        new FindCarPage(driver).clickToFindACar();
    }
    @Then("User verifies care page title is displayed")
    public void verify_Message(){
        new FindCarPage(driver).isMessageDisplayed("Find your car now!");
    }
}
