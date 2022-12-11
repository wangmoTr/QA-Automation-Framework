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


        //click on the song to add to Favorites
        //get the text of the songs
        //add song to favorites
        //go to favorites
        //check if the song is there
    }



    private void addingSongtoFavorites() {
        WebElement AllSongsPage = driver.findElement(By.cssSelector(".songs"));
        AllSongsPage.click();
    }

}


