package Auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Date;
import java.util.List;

public class AutoPlaylistPage extends AutoBasePage {

    //Locators

//    @FindBy(css = "[type='search']")
//    private WebElement searchInput
    //By playlistLocator = By.xpath("//*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']");
    @FindBy(xpath = "//*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']")
    private WebElement playlistLocator;
    @FindBy(css = ".btn-delete-playlist")
    private WebElement delBtn;

    @FindBy(css = "[type='text']")
    private WebElement enterNameList;

    @FindBy(xpath = "//li[(contains(.,'New Playlist'))]")
    private WebElement inputPlaylist;

    @FindBy(css = "input[name='name']")
    private WebElement enteringPlaylistName;

    String playListName = "my list";
    String name= "\""+ playListName+"."+"\"";
    String tenChars="TenthTenth";
    String two="two";
    String elevenChars="elevenChars";

    public AutoPlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public AutoPlaylistPage playListArea() {
        playlistLocator.click();
        return this;
    }

    public AutoPlaylistPage addingPlaylistbtn() {
       //WebElement inputPlaylist = driver.findElement(By.xpath("//li[(contains(.,'New Playlist'))]"));
        inputPlaylist.click();
        return this;
    }

    public AutoPlaylistPage deletingPlaylist(String name) {
        List<WebElement> playlists = driver.findElements(By.cssSelector(".playlist"));
            actions.contextClick(playlists.get(2)).perform();
            WebElement deleting = driver.findElement(delBtn);
            deleting.click();
            return this;
    }
    public void enterPlayListName(String playListName) {
        //WebElement enteringPlaylistName = driver.findElement(By.cssSelector("input[name='name']"));
        enteringPlaylistName.sendKeys((Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE)));
        enteringPlaylistName.sendKeys(playListName);
        enteringPlaylistName.sendKeys(Keys.ENTER);
    }
    public String getConfirmationPopupText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return driver.findElement(By.cssSelector("div.success.show")).getText();
    }
    public boolean getConfirmationMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return driver.findElement(By.cssSelector("div.success.show")).isDisplayed();
    }
}