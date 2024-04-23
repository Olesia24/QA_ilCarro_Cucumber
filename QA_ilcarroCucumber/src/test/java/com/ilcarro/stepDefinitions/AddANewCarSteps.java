package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddANewCarPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddANewCarSteps {
    @And("User clicks on Let the car work")
    public void click_on_let_the_car_work(){
        new AddANewCarPage(driver).clickOnLetTheCarWorkButton();
    }
    @And("User enter location")
    public void enter_Location(){
        new HomePage(driver).pause(1000);
        new AddANewCarPage(driver).enterLocation("Haifa");
    }
    @And("User enter manufacture")
    public void enter_Manufacture(){
        new AddANewCarPage(driver).enterManufacture("BMW");
    }
    @And("User enter model")
    public void enter_Model(){
        new AddANewCarPage(driver).enterModel("X7");
    }
    @And("User enter year")
    public void enter_Year(){
        new AddANewCarPage(driver).enterYear("2021");
    }
    @And("User enter fuel")
    public void enter_Fuel(){
        new AddANewCarPage(driver).enterFuel("Gas");
    }
    @And("User enter seats")
    public void enter_Seats(){
        new AddANewCarPage(driver).enterSeats("4");
    }
    @And("User enter car class")
    public void enter_Car_Class(){
        new AddANewCarPage(driver).enterCarClass("SUV class");
    }
    @And("User enter car registration number")
    public void enter_Registration_Number(){
        new AddANewCarPage(driver).enterRegistrationNumber("HA123-123");
    }
    @And("User enter price")
    public void enter_Price(){
        new AddANewCarPage(driver).enterPrice("1000");
    }
    @And("click on submit button")
    public void click_Submit_Button(){
        new AddANewCarPage(driver).clickSubmitButton();
    }
    @Then("User verifies Success message")
    public void verify_Message(){
        new HomePage(driver).pause(1000);
        new AddANewCarPage(driver).isSuccesMessageDisplayed("added successful");
    }
}
