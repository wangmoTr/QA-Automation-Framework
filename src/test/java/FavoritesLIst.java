import POM.pages.AllSongsPage;
import POM.pages.BasePage;
import POM.pages.HomePage;
import POM.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FavoritesLIst extends BaseTestIntern {
    @Test(enabled = true)
    public void addingFavoriteSong() {

        login();
        addingSongtoFavorites();
        checkFavoriteList();
        //Assert.assertEquals(getFavSongTitle(),"HoliznaCCO");
    }

    private String getFavSongTitle() {
        WebElement superPlaylistSong = driver.findElement(By.xpath("//section[@id='playlistWrapper']//tr[@class='song-item']//td[@class='title']"));
        return superPlaylistSong.getText();
    }

    private void addingSongtoFavorites() {
        WebElement AllSongsPage = driver.findElement(By.cssSelector(".songs"));
        AllSongsPage.click();

        WebElement favoringSong = driver.findElement(By.xpath("//section[@id='songsWrapper']//tr[@class='song-item']//td[@class='favorite']"));
        favoringSong.click();
    }

    private void checkFavoriteList() {
        WebElement favList = driver.findElement(By.xpath("//a[@href='#!/favorites']"));
        favList.click();
    }

    @Test(enabled = true)
    public void deleteFavSongList() {
        login();
        checkFavoriteList();
        WebElement favList = driver.findElement(By.xpath("//section[@id='favoritesWrapper']//td[@class='title']"));
        //WebElement favList = driver.findElement(By.xpath("//i[@data-test='btn-like-liked']"));
        actions.sendKeys(Keys.DELETE);


    }

    @Test(enabled = true)
    public void emptyFavList() {
        login();
        checkFavoriteList();
       Assert.assertEquals(noFavorites(),true);
    }

    private boolean noFavorites() {
        WebElement textStatusofEmptyList = driver.findElement(By.xpath("//div[contains(text(),'No favorites yet.']"));
        return textStatusofEmptyList.isDisplayed();
    }
//    public void contextClickFirstSong() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".all-songs tr.song-item:nth-child(1)")));
//        WebElement firstSong = driver.findElement(By.cssSelector(".all-songs tr.song-item:nth-child(1)"));
//        actions.contextClick(firstSong).perform();
//    }

}


