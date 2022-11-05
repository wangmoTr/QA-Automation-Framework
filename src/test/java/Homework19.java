import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Homework19 extends BaseTest{

//    @Test
//    public void deletePlayList(){
//        provideEmail("demo@class.com");
//        providePassword("te$t$tudent");
//        clickSubmitBtn();
//    }
    @Test
    public void deletePlaylist() throws InterruptedException {
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmitBtn();
        deleteIt();
        //to check confirm message
        Assert.assertEquals("Deleted playlist","Deleted playlist");

    }

    private void deleteIt() throws InterruptedException {
        //select one playlist name "MySongs"
        WebElement playlisttobeDeleted = driver.findElement(By.xpath("//a[text()='MySongs']"));
        playlisttobeDeleted.click();

        Thread.sleep(3000);

        //click on delete button xpath //button[@class="btn-delete-playlist"]
        WebElement deleteBtn = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        deleteBtn.click();
        Thread.sleep(5000);

    }
    private String confirmDelete() {
        WebElement confirmmessage = driver.findElement(By.xpath("//div[contains.text(),'Deleted playlist']"));
        return confirmmessage.getText();
    }

}
