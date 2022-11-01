import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class hw17_t extends BaseTest{
    @Test
    public void addSongToPlaylist() {
        provideEmail("trangoishi99@gmail.com");
        providePassword("te$t$tudent");
        clickSubmitBtn();

        WebElement avatarIcon = driver.findElement(By.xpath("//img[contains(@alt,'Avatar of')]"));
        //WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
        Assert.assertTrue(avatarIcon.isDisplayed());

        //select the all song
        WebElement allsongs = driver.findElement(By.xpath("//a[@data-testid=\"view-profile-link\"]"));
        allsongs.click();
        driver.quit();
    }

    //helpers
    //go recently play
    //all button xpaht //button[@class="btn-shuffle-all"]
    //hover first song  xpath
    //table[@class="item"]//tr[@class="song-item"]
    ////section[@id="recentlyPlayedWrapper"]tr[@class="songs-item"]

    ////section[@id="recentlyPlayedWrapper"]tr[@class="songs-item selected"]

    //buton to add song  //button[@class="btn-add-to"]
    //after button is drop down menu =---//section[@class="existing-playlists"]

    //search tt playlist //section[@class="existing-playlists"]//li[contains(text(),"tt")]

}
