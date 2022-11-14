package t.pages;

import POM.pages.BasePage;
import POM.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage_t extends BasePage_t {
    WebDriver driver;
    String url;
    WebDriverWait wait;
    //locators
    By submitButtonLocator = By.cssSelector("[type='submit']");
    By emailField = By.cssSelector("[type='email']");
    By passwordField = By.cssSelector("[type='password']");

     //passing the driver from our LoginTests page
    public LoginPage_t(WebDriver givenDriver) {
        driver = givenDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickSubmitBtn() {
        driver.findElement(submitButtonLocator).click();
    }
    public void provideEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void providePassword( String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

//    public HomePage login(){
//        provideEmail("demo@class.com")
//                .providePassword("te$t$tudent")
//                .clickSubmitBtn();
//        return new HomePage(driver);
//    }
    public void login() {
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmitBtn();
    }



}
