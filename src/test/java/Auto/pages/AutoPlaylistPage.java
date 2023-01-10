package Auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Date;
import java.util.List;

public class AutoPlaylistPage extends AutoBasePage {

    //Locators
    By playlistLocator = By.xpath("//*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']");
    By delBtn = By.cssSelector(".btn-delete-playlist");

    public AutoPlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public AutoPlaylistPage playListArea() {
        driver.findElement(playlistLocator).click();
        return this;
    }

    public AutoPlaylistPage addingPlaylistbtn() {
        WebElement input = driver.findElement(By.xpath("//li[(contains(.,'New Playlist'))]"));
        input.click();
        return this;
    }

    public AutoPlaylistPage deletingPlaylist(String name) {
        List<WebElement> playlists = driver.findElements(By.cssSelector(".playlist"));
            actions.contextClick(playlists.get(2)).perform();
            WebElement deleting = driver.findElement((delBtn));
            deleting.click();
            return this;
    }
    public void enterPlayListName(String playListName) {
        WebElement enteringPlaylistName = driver.findElement(By.cssSelector("input[name='name']"));
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