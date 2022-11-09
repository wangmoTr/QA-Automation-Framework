package t.pages;

import POM.pages.BasePage;
import POM.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_t extends BasePage {

    // Declaring the locators
    //By emailFieldLocator = By.cssSelector("[type='email']");
    @FindBy(css="[type='email']")
    WebElement emailField;
    //By passwordFieldLocator = By.cssSelector("[type='password']");
    @FindBy(css="[type='password']")
    WebElement passwordField;
    //By submitButtonLocator = By.cssSelector("[type='submit']");
    @FindBy(css="[type='submit']")
    WebElement submitButton;

    //passing the driver from our LoginTests page
    public LoginPage_t(WebDriver givenDriver){
        super(givenDriver);
    }

    public LoginPage_t clickSubmitBtn(){
        submitButton.click();
        return this;
    }

    public LoginPage_t provideEmail(String email){
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage_t providePassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public HomePage login(){
        provideEmail("demo@class.com")
                .providePassword("te$t$tudent")
                .clickSubmitBtn();
        return new HomePage(driver);
    }



}
