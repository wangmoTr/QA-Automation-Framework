package InternSearch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SearchPageSearch extends BasePageSearch {

    //Locators
    @FindBy(css = "[type='search']")
    WebElement searchInput;

//    String songName = "Dark Days";
//    //use all cases- exact spelling of song name, ingnore trailing and hading white space
//    String [] list = {"Dark Days"," Dark Days ","Dark Days "};
//    String [] caseSenList = {"darks day", "darKs DAy"};


    //By searchInput = By.cssSelector("[type='search']");


    public SearchPageSearch(WebDriver givenDriver) {
        super(givenDriver);
    }

    public SearchPageSearch searchBox(String songName) {
        searchInput.sendKeys(songName);
        return this;

    }

    //    public SearchPageSearch searchBox(String songName){
////        searchInput.sendKeys(songName);
////        return this;
//        for (int i=0; i < list.length; i++) {;
//            searchInput.sendKeys(songName);
//        }
//
//    }
    public SearchPageSearch resultFromSearch() {
        WebElement songresult = driver.findElement(By.xpath("//*[@data-testid='song-excerpts']//button[@data-test='view-all-songs-btn']"));
        songresult.click();
        WebElement isThatCorrectSong = driver.findElement(By.xpath("//*[@id='songResultsWrapper']//td[@class='title']"));
        Assert.assertEquals(isThatCorrectSong.getText(), "Dark Days");

        WebElement isThatCorrectartist = driver.findElement(By.xpath("//*[@id='songResultsWrapper']//td[@class='artist']"));
        Assert.assertEquals(isThatCorrectartist.getText(), "Grav");

        WebElement isThatCorrectAlbum = driver.findElement(By.xpath("//*[@id='songResultsWrapper']//td[@class='album']"));
        Assert.assertEquals(isThatCorrectAlbum.getText(), "Dark Days EP");
        return this;
    }
}


