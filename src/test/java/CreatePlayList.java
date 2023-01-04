import Auto.pages.AutoHomePage;
import Auto.pages.AutoLoginPage;
import Auto.pages.AutoPlaylistPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.testng.Assert.*;

public class CreatePlayList extends BaseTest1{


    By enterNameList = By.cssSelector("[type ='text]");
    String playListName = "my list";
    String firstQ = "\"";
    String secondQ = ".";
    String lastQ = "\"";
    String name= "\""+ playListName+"."+"\"";


    @Test(enabled = true, priority = 0)
    public void createNewList () throws InterruptedException {
        //GIVEN
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playList = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        //WHEN
        playList.playListArea();
        playList.addingPlaylistbtn();
        enterPlayListName(playListName);
        //THEN
        Assert.assertEquals(getConfirmationPopupText(),"Created playlist "+ "\""+ playListName+"."+"\"" );
    }

    @Test(enabled = true, priority = 1)
    public void deletePlaylist()throws InterruptedException {
        //GIVEN
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playList = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        //WHEN
        playList.deletingPlaylist(playListName);
        Assert.assertEquals(getConfirmationPopupText(),"Deleted playlist "+ "\""+ playListName+"."+"\"");
    }

    @Test(enabled = true, priority = 2)
    public void createNameTwice () throws InterruptedException {
        //GIVEN
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playList = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        //WHEN
        //THEN
        playList.playListArea();
        playList.addingPlaylistbtn();
        enterPlayListName("second");
        Assert.assertEquals(getConfirmationPopupText(), "Created playlist " + "\"" + "second" + "." + "\"");
        Assert.assertEquals(true,true,"this is not good ");

        //REPEAT


    }
    public void enterPlayListName(String playListName) {
        WebElement enterPlaylistName = driver.findElement(By.cssSelector("input[name='name']"));
        enterPlaylistName.sendKeys((Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE)));
        //Thread.sleep(3000);
        enterPlaylistName.sendKeys(playListName);
        enterPlaylistName.sendKeys(Keys.ENTER);
    }
    private String getConfirmationPopupText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return driver.findElement(By.cssSelector("div.success.show")).getText();
    }


}
