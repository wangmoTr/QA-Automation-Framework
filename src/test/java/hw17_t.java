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
        // WebElement allsongs = driver.findElement(By.xpath("//a[@data-testid=\"view-profile-link\"]"));
        //allsongs.click();
        recentPlaylist();
        allPlaybtn();
        firstSongInPlaylist();
        addToButton();
        dropDownMenuPlaylist();
        selectPlaylist();
    }

    private void recentPlaylist() {
         WebElement recentlist = driver.findElement(By.xpath("//section[@id=\"playlists\"]//a[@class='active']"));
        recentlist.click();
    }

    //helpers
    //go recently play

    public void allPlaybtn() {
        //all button xpaht //button[@class="btn-shuffle-all"]
        WebElement allBtn = driver.findElement(By.xpath("//button[@class=\"btn-shuffle-all\"]"));
        allBtn.click();
    }

    //hover first song  xpath
    public void firstSongInPlaylist() {
        ////section[@id="recentlyPlayedWrapper"]tr[@class="songs-item"]
        WebElement firstSong = driver.findElement(By.xpath("//section[@id=\"recentlyPlayedWrapper\"]tr[@class=\"songs-item\"]"));
        firstSong.click();
    }


    ////section[@id="recentlyPlayedWrapper"]tr[@class="songs-item selected"]
    public void addToButton(){
        //buton to add song  //button[@class="btn-add-to"]
        WebElement addSongButton = driver.findElement(By.xpath("//button[@class=\"btn-add-to\"]"));
        addSongButton.click();
    }

    //after button is drop down menu
    public void dropDownMenuPlaylist() {
        // =---//section[@class="existing-playlists"]
        WebElement dropdown = driver.findElement(By.xpath("//section[@class=\"existing-playlists\"]"));
        dropdown.click();
    }
   //search tt playlist
   public void selectPlaylist() {
       //search tt playlist //section[@class="existing-playlists"]//li[contains(text(),"tt")]
       WebElement pickedPlaylist = driver.findElement(By.xpath("//section[@class=\"existing-playlists\"]"));
       pickedPlaylist.click();
   }


}
