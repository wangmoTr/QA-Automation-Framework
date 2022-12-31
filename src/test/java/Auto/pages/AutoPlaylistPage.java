package Auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutoPlaylistPage extends AutoBasePage {

    //Locators
      By playlistLocator =By.xpath("//*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']");
      //By addingPlaylistBtnSelector =By.xpath("//*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']//li[@data-testid='playlist-context-menu-create-simple']");
   ////li[contains(text(),'New Playlist']
       By addingPlaylistBtn = By.xpath("//div[contains(text(),'New Playlist']");

    //By enterNameList = By.cssSelector("[type ='text]");



    public AutoPlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public AutoPlaylistPage playListArea() {
        driver.findElement(playlistLocator).click();
        return this;
    }
     ////li[(contains(.,'New Playlist'))]
    public AutoPlaylistPage addingPlaylistbtn() {
        WebElement input= driver.findElement(By.xpath("//li[(contains(.,'New Playlist'))]"));
        //input.sendKeys(playlistName);
        input.click();
        return this;
    }

    private void choosePlaylistByName(String name) {
        By playlistLocator = By.xpath("//a[contains(text(), '" + name + "')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(playlistLocator)).click();
    }

}
