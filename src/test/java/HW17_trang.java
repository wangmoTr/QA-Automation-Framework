import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW17_trang extends SimpleBaseTest {

    @Test
    public void addSongToPlayList() {
        login();
        WebElement avatarIcon = driver.findElement(By.cssSelector("alt='Avatar of student']"));
        //Assert.assertTrue(avatarIcon.isDisplayed());
    }


}
