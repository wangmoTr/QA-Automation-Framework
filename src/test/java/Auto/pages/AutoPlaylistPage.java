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
    By addingPlaylistBtn = By.xpath("//div[contains(text(),'New Playlist']");
    By playListsection = By.cssSelector(".playlist:nth-child(3)");
    By delBtn = By.cssSelector(".btn-delete-playlist");

    //By navigatetoDelete = By.xpath("//*[@id=\"playlists\"]//li[(contains(.,'Delete'))]");
    public AutoPlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public AutoPlaylistPage playListArea() {
        driver.findElement(playlistLocator).click();
        return this;
    }

    ////li[(contains(.,'New Playlist'))]
    public AutoPlaylistPage addingPlaylistbtn() {
        WebElement input = driver.findElement(By.xpath("//li[(contains(.,'New Playlist'))]"));
        input.click();
        return this;
    }

    private void choosePlaylistByName(String name) {
        By playlistLocator = By.xpath("//a[contains(text(), '" + name + "')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(playlistLocator)).click();
    }

    public AutoPlaylistPage deletingPlaylist(String name) {
        List<WebElement> playlists = driver.findElements(By.cssSelector(".playlist"));
            actions.contextClick(playlists.get(2)).perform();
            WebElement deleting = driver.findElement((delBtn));
            deleting.click();
            return this;
        }
}