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

public class CreatePlayList extends BaseTest{

    String [] nameofList = { "abc", "abc", "abcd", "abcdef", "tencharact","eleveneCharcter"};
    @Test
    public void createNewList () {
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playList = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        playList.playListArea();
        playList.addingPlaylistbtn();
        //playList.inputPlayListName("abc");
        //Assert.assertEquals(getConfirmationPopupText(), "Created playlist abc");

    }

    ////*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']//li[@data-testid='playlist-context-menu-create-simple']
    private String getConfirmationPopupText() {
        return driver.findElement(By.cssSelector("div.success.show")).getText();
    }
}
