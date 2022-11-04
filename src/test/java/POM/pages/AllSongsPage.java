package POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllSongsPage extends BasePage{

    //Locators
    By shuffleBtnLocator = By.cssSelector(".btn-shuffle-all");
    By firstSongLocator = By.cssSelector(".play");

    public AllSongsPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public void shuffle(){
        driver.findElement(shuffleBtnLocator).click();
    }

    public void doubleClickFirstSong() {
        actions.doubleClick(driver.findElement(firstSongLocator));
    }

    //Shuffle
    //Add to Favorite
    //PlaySong
    //SortByTitle
}
