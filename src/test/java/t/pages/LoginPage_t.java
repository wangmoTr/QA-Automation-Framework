package t.pages;

import POM.pages.BasePage;
import POM.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage_t extends BasePage {
    WebDriver driver;
    String url;
    WebDriverWait wait;
    //locators
    By submitButtonLocator = By.cssSelector("[type='submit']");
    By emailField = By.cssSelector("[type='email']");
    By passwordField = By.cssSelector("[type='password']");

    public LoginPage_t(WebDriver givenDriver) {
        driver = givenDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }


//    public HomePage login(){
//        provideEmail("demo@class.com")
//                .providePassword("te$t$tudent")
//                .clickSubmitBtn();
//        return new HomePage(driver);
//    }



}
