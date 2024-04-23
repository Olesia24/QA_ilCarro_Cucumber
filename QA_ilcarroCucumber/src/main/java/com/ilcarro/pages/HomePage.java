package com.ilcarro.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(css= "h1")
    WebElement homePageTitle;
    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(homePageTitle);
        return new HomePage(driver);
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;
    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }
}
