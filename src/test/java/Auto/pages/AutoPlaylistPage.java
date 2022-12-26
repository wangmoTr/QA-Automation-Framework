package Auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutoPlaylistPage extends AutoBasePage {

    //Locators
      //By addPlaylistBtn =By.xpath("//*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']");
    By addPlaylistBtn =By.xpath("//*[@id='playlists']//*[@data-testid='sidebar-create-playlist-btn']//li[@data-testid='playlist-context-menu-create-simple']");

    String [] nameofList = { "abc", "abc", "abcd", "abcdef", "tencharact","eleveneCharcter"};

    public AutoPlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public AutoPlaylistPage createListPage() {
        driver.findElement(addPlaylistBtn).click();
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
