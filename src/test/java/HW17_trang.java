import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW17_trang extends SimpleBaseTest {

    @Test
    public void addSongToPlayList() {
        login();
        WebElement avatarIcon = driver.findElement(By.xpath("//*[@alt='Avatar of t']"));
        Assert.assertTrue(avatarIcon.isDisplayed());

        WebElement  allSongs = driver.findElement(By.xpath("//*[@href='#!/songs']"));
        allSongs.click();
        //td
        //BossStatus

        WebElement  songTitle = driver.findElement(By.xpath("//td[contains(text(),'BossStatus']"));
        songTitle.click();
       //  //span[contains(.,'DarkDays')
    }
    // find the song you like to add
    

    // add to songlist


    //make sure the song is added


}

//        WebElement  listtoAdd = driver.findElement(By.xpath("//a[contains(text(), 'list1')]"));
//        listtoAdd.click();
