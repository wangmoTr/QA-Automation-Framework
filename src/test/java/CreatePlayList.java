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

import static org.testng.Assert.*;

public class CreatePlayList extends BaseTest{

    String [] nameofList = { "abc", "abc", "abcd", "abcdef", "tencharact","eleveneCharcter"};
    By enterNameList = By.cssSelector("[type ='text]");
    String playListName = "my list";
    String firstQ = "\"";
    String secondQ = ".";
    String lastQ = "\"";
    String name= firstQ+ playListName+secondQ+lastQ;
    @Test
    public void createNewList () {
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playList = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        playList.playListArea();
        playList.addingPlaylistbtn();
        enterPlayListName(playListName);
        //Assert.assertEquals(getConfirmationPopupText(), "Created playlist");
        WebElement popupText = driver.findElement(By.cssSelector("div.success.show"));
        Assert.assertEquals(popupText.getText(),"Created playlist "+ name );

    }
    public void enterPlayListName(String playListName) {
        WebElement enterPlaylistName = driver.findElement(By.cssSelector("input[name='name']"));
        enterPlaylistName.sendKeys((Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE)));
        //Thread.sleep(3000);
        enterPlaylistName.sendKeys(playListName);
        enterPlaylistName.sendKeys(Keys.ENTER);
    }
    private String getConfirmationPopupText() {
        return driver.findElement(By.cssSelector("div.success.show")).getText();
    }


}
