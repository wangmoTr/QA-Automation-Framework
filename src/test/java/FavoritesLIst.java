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
          WebElement AllSongsPage = driver.findElement(By.cssSelector(".songs"));
          AllSongsPage.click();

          WebElement favoringSong = driver.findElement(By.xpath("//section[@id='songsWrapper']//tr[@class='song-item']//td[@class='favorite']"));
          favoringSong.click();
    }


}
