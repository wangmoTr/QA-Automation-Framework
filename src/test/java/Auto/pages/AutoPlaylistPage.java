package Auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutoPlaylistPage extends AutoBasePage {

    //Locators
      By playlistLocator =By.xpath("//*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']");
      By addingPlaylistBtn =By.xpath("//*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']//li[@data-testid='playlist-context-menu-create-simple']");
   ////li[contains(text(),'New Playlist']
       //By addingPlaylistBtn = By.xpath("//div[contains(text(),'New Playlist']");

    By enterNameList = By.cssSelector("[type ='text]");



    public AutoPlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public AutoPlaylistPage playListArea() {
        driver.findElement(playlistLocator).click();
        return this;
    }

    public void addingPlaylistbtn() {
        driver.findElement(addingPlaylistBtn).click();

    }

    public AutoPlaylistPage inputPlayListName(String playlistName) {
      driver.findElement(enterNameList).sendKeys(playlistName);
      return this;
    }

//    public AutoPlaylistPage shuffle(){
//        driver.findElement(shuffleBtnLocator).click();
//        return this;
//    }
//
//    public void doubleClickFirstSong() {
//        actions.doubleClick(driver.findElement(firstSongLocator));
//    }
//
//    public void contextClickFirstSong() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".all-songs tr.song-item:nth-child(1)")));
//        WebElement firstSong = driver.findElement(By.cssSelector(".all-songs tr.song-item:nth-child(1)"));
//        actions.contextClick(firstSong).perform();
//    }
//
//    public void playFromContextMenu() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playback"))).click();
//    }

    //Shuffle
    //Add to Favorite
    //PlaySong
    //SortByTitle
}
