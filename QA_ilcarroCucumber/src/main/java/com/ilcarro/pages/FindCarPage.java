package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FindCarPage extends BasePage{
    public FindCarPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "city")
    WebElement enterCity;
    public FindCarPage enterTheCity(String findCity) {
        enterCity.sendKeys(findCity);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        return this;
    }

    @FindBy(id = "dates")
    WebElement enterDates;
    public FindCarPage enterDates(String dates) {
        enterDates.clear();
        enterDates.sendKeys(dates);
        enterDates.sendKeys(Keys.ENTER);
        return this;
    }
    @FindBy(css = "button[type='submit']")
    WebElement submitButton;
    public FindCarPage clickToFindACar() {
        click(submitButton);
        return this;
    }

    @FindBy(css = "[type='button']")
    WebElement clickOnOk;
    public FindCarPage clickOnOkButton() {
        click(clickOnOk);
        return this;
    }
    @FindBy(css = ".title")
    WebElement title;
    public FindCarPage isMessageDisplayed(String text) {
        assert title.getText().contains(text);
        return this;
    }
}
