import InternSearch.pages.LoginPageSearch;
import InternSearch.pages.SearchPageSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class Search extends BaseTest {
    String songName = "Dark Days";
    //use all cases- exact spelling of song name, ingnore trailing and hading white space
    String [] list = {"Dark Days"," Dark Days ","Dark Days "};

    String [] caseSenList = {"darks day", "darKs DAy"};
    @Test(enabled = true, priority = 0)// dataProvider = "songTitles", dataProviderClass = BaseTest.class)
    public void searchSongTitle() throws InterruptedException{

//        login();
        LoginPageSearch Login = new LoginPageSearch(driver);
        SearchPageSearch searching = new SearchPageSearch(driver);
        Login.login();

        for (int i=0; i < list.length; i++) {
            //System.out.println(list[i]);
            searching.searchBox(list[i]);
        }
        //check for the results
        resultFromSearch();
    }
    @Test(enabled = true,priority=1)
    public void isSongSearchwithSentiveCase() {
        LoginPageSearch Login = new LoginPageSearch(driver);
        SearchPageSearch searching = new SearchPageSearch(driver);
        Login.login();

        for (int i=0; i < caseSenList.length; i++) {
            searching.searchBox(caseSenList[i]);
        }
        songResultpage();
        //negativeSearchResult();
        //Assert.assertFalse(negativeSearchResult(),"should not shown");
        Assert.assertEquals(negativeSearchResult(), false);

    }
     //expect to see result
     public void resultFromSearch(){
         //*[@id='searchExcerptsWrapper']//span[text()="Dark Days"]
         WebElement songresult=driver.findElement(By.xpath("//*[@data-testid='song-excerpts']//button[@data-test='view-all-songs-btn']"));
         songresult.click();

         WebElement isThatCorrectSong = driver.findElement(By.xpath("//*[@id='songResultsWrapper']//td[@class='title']"));
         Assert.assertEquals(isThatCorrectSong.getText(), "Dark Days");

         WebElement isThatCorrectartist = driver.findElement(By.xpath("//*[@id='songResultsWrapper']//td[@class='artist']"));
         Assert.assertEquals(isThatCorrectartist.getText(), "Grav");

         WebElement isThatCorrectAlbum = driver.findElement(By.xpath("//*[@id='songResultsWrapper']//td[@class='album']"));
         Assert.assertEquals(isThatCorrectAlbum.getText(), "Dark Days EP");
        
     }

     public boolean negativeSearchResult() {

         WebElement isThatCorrectSong = driver.findElement(By.xpath("//*[@id='songResultsWrapper']//td[@class='title']"));
        return isThatCorrectSong.isDisplayed();
         //return false;

     }

     public void songResultpage(){
         WebElement songresult=driver.findElement(By.xpath("//*[@data-testid='song-excerpts']//button[@data-test='view-all-songs-btn']"));
         songresult.click();

     }
     //not need yet
//     public boolean isSongExisting(String songName) {
//         WebElement allsongs = driver.findElement(By.xpath("//a[@href='#!/songs']"));
//         allsongs.click();
//        WebElement songText= driver.findElement(By.xpath("//*[@id='songsWrapper']//td[text()='"+ songName+"']"));
//        return songText.isDisplayed();
//     }
     @Test(enabled= true, priority= 2)
     public void clearQuery() {
         login();
         LoginPageSearch Login = new LoginPageSearch(driver);
         SearchPageSearch searching = new SearchPageSearch(driver);
         Login.login();
         searching.searchBox(songName);
         WebElement InputField = driver.findElement(By.cssSelector("input[name='q']"));
         InputField.sendKeys((Keys.chord(Keys.COMMAND, "a", Keys.BACK_SPACE)));
         isClearResultAfterDeleting("Dark Days");

     }
     public void isClearResultAfterDeleting(String songName){
        WebElement searchResult = driver.findElement(By.cssSelector("#searchExcerptsWrapper h1"));
        Assert.assertEquals(searchResult.getText(), "Search");

     }

}