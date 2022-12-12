import Intern.pages.FavoritePageIntern;
import Intern.pages.HomePageIntern;
import Intern.pages.LoginPageIntern;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FavLIst extends BaseTestIntern {
    @Test(enabled = true)
    public void addingFavoriteSong() {

        LoginPageIntern loginPageIntern = new LoginPageIntern(driver);
        FavoritePageIntern favoritesList= new FavoritePageIntern(driver);
        HomePageIntern homePage = new HomePageIntern(driver);

        //login();
        loginPageIntern.login();
        // first go to all songs
        favoritesList.allSongMenu();
        //favoritesList.deleteAllFavSongs();
        //addSongtoFavorites();
        //String selectedSongTitle = getSongText();
        //checkFavoriteList();
        //String  favSong = checkSongInFavList();

        //Assert.assertEquals(favSong,selectedSongTitle);

        //click on the song to add to Favoritesfa
        //get the text of the songs
        //add song to favorites
        //go to favorites
        //check if the song is there
    }
   @Test(enabled =true)
   public void deleteFavoritesSong() {
       LoginPageIntern loginPageIntern = new LoginPageIntern(driver);
       FavoritePageIntern favoritesList= new FavoritePageIntern(driver);
       //BasePage basePage = new BasePage(driver);
       HomePageIntern homePage = new HomePageIntern(driver);

       //login();
       loginPageIntern.login();
       checkFavoriteList();


   }
    @Test(enabled = false)
    public void emptySong() {
        LoginPageIntern loginPageIntern = new LoginPageIntern(driver);
        FavoritePageIntern favoritesList= new FavoritePageIntern(driver);
        //BasePage basePage = new BasePage(driver);
        HomePageIntern homePage = new HomePageIntern(driver);

        //login();
        loginPageIntern.login();
        checkFavoriteList();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#favoritesWrapper div.text")));
        WebElement textMessage = driver.findElement(By.cssSelector("#favoritesWrapper div.text"));
        textMessage.isDisplayed();
    }


    private void checkFavoriteList() {
        WebElement favList = driver.findElement(By.xpath("//a[@href='#!/favorites']"));
        favList.click();
    }
    @Test(enabled = true)
    public void downloadSong() {
        LoginPageIntern loginPageIntern = new LoginPageIntern(driver);
        HomePageIntern homePage = new HomePageIntern(driver);
        FavoritePageIntern favoritesList= new FavoritePageIntern(driver);
        loginPageIntern.login();
        favoritesList.allSongMenu();
        String songName = "Episode 2";

        WebElement songtoSelect = driver.findElement(By.xpath("//*[@id='songsWrapper']//td[text()='Episode 2']"));
        //WebElement songtoSelect = driver.findElement(By.xpath(songName));
        songtoSelect.click();
        actions.contextClick(songtoSelect).perform();

        WebElement favList = driver.findElement(By.xpath("//li[@class='download']"));
        favList.click();
    }
}


