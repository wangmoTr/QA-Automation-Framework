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
        //getFavSongTitle();


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

        String message = noFavorites();
        
        Assert.assertEquals(message, "No favorites yet.");
    }

    private String noFavorites() {
        WebElement textStatusofEmptyList = driver.findElement(By.xpath("//section[@id='favoritesWrapper']//div[@class='text']"));
        return textStatusofEmptyList.getText();
    }

}


