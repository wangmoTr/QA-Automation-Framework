import POM.pages.AllSongsPage;
import POM.pages.BasePage;
import POM.pages.HomePage;
import POM.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class FavoritesLIst extends BaseTestIntern {
    @Test
    public void addingFavoriteSong () {
//        LoginPage loginPage = new LoginPage(driver);
//        HomePage homePage = new HomePage(driver);

//        loginPage.provideEmail("trangoishi99@gmail.com");
//        loginPage.providePassword("te$t$tudent");
//        loginPage.clickSubmitBtn();
//        Assert.assertTrue(homePage.isUserAvatarDisplayed());
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

   @Test
    public void deleteFavSongList() {
        login();
       checkFavoriteList();
//       //WebElement favList = driver.findElement(By.xpath("//section[@id='favoritesWrapper'']//i[@class='fa fa-heart text-maroon']"));
//       //i[@data-test='btn-like-liked']
       WebElement favList = driver.findElement(By.xpath("//section[@id='favoritesWrapper']//td[@class='title']"));
       //WebElement favList = driver.findElement(By.xpath("//i[@data-test='btn-like-liked']"));
       actions.doubleClick(favList).perform();
//
//       //find the heart symbol and unclick
//       WebElement songPlay = driver.findElement(By.xpath("//div[@class='wrapper']//i[@class='fa fa-heart text-maroon']"));
//       actions.doubleClick(songPlay).perform();

       WebElement songPlay = driver.findElement(By.xpath("//tr[@class='song-item selected']//td[@class='favorite']//i[@data-test='btn-like-unliked']"));
         actions.doubleClick(songPlay).perform();


       //tr[@class='song-item selected']//td[@class='favorite']//i[@data-test='btn-like-unliked']

//       List<WebElement> songLists = driver.findElement(By.xpath());
//       for(WebElement item: songLists){
//           actions.doubleClick(item).perform();
//           boolean issSelected = item.getAttribute("class").contains();
//           if(!issSelected) {
//               return;
//           }
//
//       }

    }
    @Test
   public void emptyFavList() {
        login();
   }

}
