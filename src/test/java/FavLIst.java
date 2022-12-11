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
        //BasePage basePage = new BasePage(driver);
        HomePageIntern homePage = new HomePageIntern(driver);

        //login();
        loginPageIntern.login();
        // first go to all songs
        favoritesList.allSongMenu();
        //favoritesList.deleteAllFavSongs();
        favoritesList.addSongtoFavorites();
        String selectedSongTitle;
                selectedSongTitle= favoritesList.getSongText();
        checkFavoriteList();
        String  favSong = favoritesList.checkSongInFavList();

        Assert.assertEquals(favSong,selectedSongTitle);

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
    @Test(enabled = true)
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

    private void addingSongtoFavorites() {
        WebElement AllSongsPage = driver.findElement(By.cssSelector(".songs"));
        AllSongsPage.click();
    }
    private void checkFavoriteList() {
        WebElement favList = driver.findElement(By.xpath("//a[@href='#!/favorites']"));
        favList.click();
    }

}


