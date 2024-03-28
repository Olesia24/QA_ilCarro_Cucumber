package hw_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HW_02 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void findThreeElementsByTagName(){
        List<WebElement> form = driver.findElements(By.tagName("form"));
        System.out.println(form.size());

        WebElement form1 = driver.findElement(By.tagName("form"));
        System.out.println("Name:" + form1.getText());

        List<WebElement> div = driver.findElements(By.tagName("div"));
        System.out.println(div.size());

        List<WebElement> input = driver.findElements(By.tagName("input"));
        System.out.println(input.size());

        List<WebElement> span = driver.findElements(By.tagName("span"));
        System.out.println(span.size());

        List<WebElement> elements = driver.findElements(By.tagName("li"));
        System.out.println(elements.size());

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
