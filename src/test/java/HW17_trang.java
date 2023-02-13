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

        WebElement  selectedSong = driver.findElement(By.xpath("//td[contains(text(),'BossStatus']"));
        selectedSong.click();
       //  //span[contains(.,'DarkDays')
    }

}

//        WebElement  listtoAdd = driver.findElement(By.xpath("//a[contains(text(), 'list1')]"));
//        listtoAdd.click();
