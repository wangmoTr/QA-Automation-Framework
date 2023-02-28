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

        WebElement allSongs = driver.findElement(By.xpath("//*[@href='#!/songs']"));
        allSongs.click();
        getFAvSongLocator();
        addToButton();
        superList();
       // WebElement message = driver.findElement(By.cssSelector(".success.show"));
        //message.isDisplayed();
       //confirmMessageofAddingSong();
        //Assert.assertEquals(confirmMessageofAddingSong(),"Added 1 song into \"list1\"");
    }

    private void getFAvSongLocator() {
        WebElement songName = driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]//td[text()=\"BossStatus\"]"));
        songName.click();
    }

    public void addToButton() {
        WebElement addToBtn = driver.findElement(By.xpath("//*[@class=\"btn-add-to\"]"));
        addToBtn.click();
    }

    public void superList() {
        WebElement targetList = driver.findElement((By.xpath("//section[@id='songsWrapper']//li[contains(text(), 'list1')]")));
        targetList.click();
    }

    public void confirmMessageofAddingSong() {
        WebElement message = driver.findElement(By.cssSelector(".success.show"));
       message.isDisplayed();
    }
}
