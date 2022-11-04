package POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    //Locators
    By avatarLocator = By.cssSelector("img.avatar");
    By soundBarPlayLocator = By.cssSelector("[data-testid = 'sound-bar-play']");

    public HomePage(WebDriver sentDriver) {
        super(sentDriver);
    }

    public WebElement getUserAvatar(){
        return driver.findElement(avatarLocator);
    }

    public boolean isUserAvatarDisplayed(){
        return driver.findElement(avatarLocator).isDisplayed();
    }

    public boolean isSongPlaying() {
        WebElement soundBarVisualizer = driver.findElement(soundBarPlayLocator);
        return soundBarVisualizer.isDisplayed();
    }

    public void clickOnAllSongs(){
        driver.findElement(allSongsMenuItemLocator).click();
    }

}
