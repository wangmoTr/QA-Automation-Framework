package InternSearch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePageSearch {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    By avatarLocator = By.cssSelector("img.avatar");
    By soundBarPlayLocator = By.cssSelector("[data-testid = 'sound-bar-play']");
    By allSongsMenuItemLocator = By.cssSelector("li a.songs");
    //search locator
    //locator at favorites Page
    By gotoFavorites = By.xpath("//a[@href='#!/favorites']");

    By songToBeSelectFromAllSongs = By.cssSelector("#songsWrapper .selected");

    By addButton = By.cssSelector((".btn-add-to"));

    By favoritesBtn = By.xpath("//*[@id='songsWrapper']//li[@class='favorites']");
    //
    By favSonginFavList = By.xpath("//section[@id='playlistWrapper']//tr[@class='song-item']//td[@class='title']");

    By nosSongOnFavList = By.cssSelector("#favoritesWrapper div.text");
    //private WebDriver ;
    String songTitle ="Dark Days";
    By songTextFromAllSongsList= By.xpath("//section[@id='songsWrapper']//tr[@class='song-item selected']//td[@class='title']");

    By songArtistfromAllSongsList= By.xpath("//section[@id='songsWrapper']//tr[@class='song-item selected']//td[@class='artist']");
    By songAlbumfromAllSongsList = By.xpath("//section[@id='songsWrapper']//tr[@class='song-item selected']//td[@class='album']");

    //from result page id="searchExcerptsWrapper;
    // section data-testid ="song-excerpts" class songs, span, class =details has text "Dark Days
    //section[@id='searchExcerptsWrapper']//section[@data-testid='song-excerpts']//span[@class='details']
    //section  data-testid ="artist-excerpts"

    //section  data-testid ="album-excerpts"


    public BasePageSearch(WebDriver givenDriver){
        driver = givenDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        PageFactory.initElements(driver,this);
    }

    public WebElement getUserAvatar(){
        return driver.findElement(avatarLocator);
    }

    public boolean isUserAvatarDisplayed(){
        return driver.findElement(avatarLocator).isDisplayed();
    }

//    public SearchPageSearch enterTextsearchField(String text) {
//        driver.findElement(searchInput).sendKeys(text);
//        return this;
//    }

    public AllSongsPage clickOnAllSongs(){
        driver.findElement(allSongsMenuItemLocator).click();
        return new AllSongsPage(driver);
    }

    public void songTitleInfofromAllSong() {
         String songText= "Dark Days";

//        WebElement songText =driver.findElement(songTextFromAllSongsList).getText();
          Assert.assertEquals(songText, "Dark Days");
    }
    public void SongArtistfromAllSongsList() {
        driver.findElement(songTextFromAllSongsList).getText();
    }
    public void songAlbumfromAllSongsList() {
        driver.findElement(songTextFromAllSongsList).getText();
    }


}
