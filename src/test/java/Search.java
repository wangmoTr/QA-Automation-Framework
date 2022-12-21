import InternSearch.pages.LoginPageSearch;
import InternSearch.pages.SearchPageSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Search extends BaseTest {
    String songName = "Dark Days";
    @Test(enabled = true)// dataProvider = "songTitles", dataProviderClass = BaseTest.class)
    public void searchSongTitle() throws InterruptedException{

//        login();
        LoginPageSearch Login = new LoginPageSearch(driver);
        SearchPageSearch searching = new SearchPageSearch(driver);
        Login.login();
        searching.searchBox(songName);
        //check for the results
        resultFromSearch();
        //*[@id='songResultsWrapper']//td[@class='title']
        //Assert.assertEquals(songresult.getText(), "Dark Days");

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
     public boolean isSongExisting(String songName) {
         WebElement allsongs = driver.findElement(By.xpath("//a[@href='#!/songs']"));
         allsongs.click();
        WebElement songText= driver.findElement(By.xpath("//*[@id='songsWrapper']//td[text()='"+ songName+"']"));
        return songText.isDisplayed();
     }


}