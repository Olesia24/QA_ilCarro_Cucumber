package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on Login link")
    public void clicks_on_Login_link(){
        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enter valid data")
    public void enter_valid_data(){
        new LoginPage(driver).enterData("olesia123@yahoo.com", "Olesia$2024");
    }
    @And("User clicks on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }
    @Then("User verifies Success Message is displayed")
    public void verify_Succes_Message(){
        new LoginPage(driver).isMessageDisplayed("Logged in success");
    }
    @And("User enter valid email and invalid password")
    public void enter_invalid_password(DataTable table){
        new LoginPage(driver).enterInvalidPassword(table);
    }
    @Then("User verifies Error Message is displayed")
    public void verify_Error(){
        new HomePage(driver).pause(1000);
        new LoginPage(driver).isMessageDisplayed("Login or Password incorrect");
    }
}
