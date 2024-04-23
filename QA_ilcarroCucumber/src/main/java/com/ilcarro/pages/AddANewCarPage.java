package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddANewCarPage extends BasePage{
    public AddANewCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/let-car-work']")
    WebElement clickLetTheCarWork;
    public AddANewCarPage clickOnLetTheCarWorkButton() {
        click(clickLetTheCarWork);
        return this;
    }

    @FindBy(id = "pickUpPlace")
    WebElement enterLocation;
    public AddANewCarPage enterLocation(String location) {
        type(enterLocation, location);
        pause(1000);
        enterLocation.sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement enterManufacture;
    public AddANewCarPage enterManufacture(String manufacture) {
        type(enterManufacture, manufacture);
        return this;
    }

    @FindBy(id = "model")
    WebElement enterModel;
    public AddANewCarPage enterModel(String model) {
        type(enterModel, model);
        return this;
    }

    @FindBy(id = "year")
    WebElement enterYear;
    public AddANewCarPage enterYear(String year) {
        type(enterYear, year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement enterFuel;
    public AddANewCarPage enterFuel(String fuelType) {
        Select select = new Select(enterFuel);
        select.selectByVisibleText(fuelType);
        return this;
    }

    @FindBy(id = "seats")
    WebElement enterSeats;
    public AddANewCarPage enterSeats(String seats) {
        type(enterSeats, seats);
        return this;
    }


    @FindBy(id = "class")
    WebElement enterClass;
    public AddANewCarPage enterCarClass(String carClass) {
        type(enterClass, carClass);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement enterCarRegNumber;
    public AddANewCarPage enterRegistrationNumber(String regNumber) {
        type(enterCarRegNumber, regNumber);
        return this;
    }

    @FindBy(id = "price")
    WebElement enterPrice;
    public AddANewCarPage enterPrice(String price) {
        type(enterPrice, price);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submitButton;
    public AddANewCarPage clickSubmitButton() {
        click(submitButton);
        return this;
    }

    @FindBy(css = ".message")
    WebElement message;
    public AddANewCarPage isSuccesMessageDisplayed(String text) {
        assert message.getText().contains(text);
        return this;
    }
}
