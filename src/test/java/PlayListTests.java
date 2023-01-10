import Auto.pages.AutoHomePage;
import Auto.pages.AutoLoginPage;
import Auto.pages.AutoPlaylistPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayListTests extends BaseTest {

    By enterNameList = By.cssSelector("[type ='text]");
    String playListName = "my list";
    String name= "\""+ playListName+"."+"\"";
    String tenChars="TenthTenth";
    String two="two";
    String elevenChars="elevenChars";

    @Test(enabled = true, priority = 0)
    public void createNewList () {
        //GIVEN
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playListPage = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        //WHEN
        playListPage.playListArea();
        playListPage.addingPlaylistbtn();
        playListPage.enterPlayListName(playListName);
        //THEN
        Assert.assertEquals(playListPage.getConfirmationPopupText(),"Created playlist "+ "\""+ playListName+"."+"\"" );
    }

    @Test(enabled = true, priority = 1)
    public void deletePlaylist() {
        //GIVEN
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playListPage = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        //WHEN
        playListPage.deletingPlaylist(playListName);
        //THEN
        Assert.assertEquals(playListPage.getConfirmationMessage(),true);
    }

    @Test(enabled = true, priority = 2)
    public void createNameTwice () {
        //GIVEN
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playListPage = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        //WHEN
        playListPage.playListArea();
        playListPage.addingPlaylistbtn();
        playListPage.enterPlayListName("second");
        //THEN
        Assert.assertEquals(playListPage.getConfirmationPopupText(), "Created playlist " + "\"" + "second" + "." + "\"");
        //REPEAT
        playListPage.playListArea();
        playListPage.addingPlaylistbtn();
        playListPage.enterPlayListName("second");
        //EXPECTED TO BE FALSE
        Assert.assertEquals(playListPage.getConfirmationMessage(),false,"CANNOT ENTER SAME NAME");
    }

    @Test(enabled = true, priority = 3)
    public void createNameWith10Chars ()  {
        //GIVEN
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playListPage = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        //WHEN
        playListPage.playListArea();
        playListPage.addingPlaylistbtn();
        playListPage.enterPlayListName(tenChars);
        //THEN
        Assert.assertEquals(playListPage.getConfirmationPopupText(), "Created playlist " + "\"" + tenChars + "." + "\"");
    }
    @Test(enabled = true, priority = 4)
    public void createNameWith11Chars ()  {
        //GIVEN
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playListPage = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        //WHEN
        playListPage.playListArea();
        playListPage.addingPlaylistbtn();
        playListPage.enterPlayListName(elevenChars);
        //THEN
        Assert.assertEquals(playListPage.getConfirmationMessage(),false);
    }
    @Test(enabled = true, priority = 3)
    public void createNameTwoChars ()  {
        //GIVEN
        AutoLoginPage loginPage = new AutoLoginPage(driver);
        AutoHomePage homePage = new AutoHomePage(driver);
        AutoPlaylistPage playListPage = new AutoPlaylistPage(driver);
        loginPage.login();
        Assert.assertTrue(homePage.isUserAvatarDisplayed());
        //WHEN
        //THEN
        playListPage.playListArea();
        playListPage.addingPlaylistbtn();
        playListPage.enterPlayListName(two);
        Assert.assertEquals(playListPage.getConfirmationMessage(),false);
    }


}
