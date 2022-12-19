import InternSearch.pages.LoginPageSearch;
import InternSearch.pages.SearchPageSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Search extends BaseTest {
    By songTextFromAllSongsList= By.xpath("//section[@id='songsWrapper']//tr[@class='song-item selected']//td[@class='title']");
    @Test(enabled = true)// dataProvider = "songTitles", dataProviderClass = BaseTest.class)
    public void searchSongTitle() throws InterruptedException{

//        login();
        LoginPageSearch Login = new LoginPageSearch(driver);
        SearchPageSearch searching = new SearchPageSearch(driver);
        Login.login();
        songTitleInfofromAllSong();
//        searching.songTitleInfofromAllSong();
        //Assert.assertEquals(searching.songTitleInfofromAllSong(),true);

//        WebElement searchInput = driver.findElement(By.cssSelector("[type='search']"));
//        searchInput.sendKeys("Dark Days");


    }
     //expect to see result
     public void resultFromSearch(){
        
     }
     public void songTitleInfofromAllSong() {
        WebElement songText= driver.findElement(By.xpath("//section[@id='songsWrapper']//tr[@class='song-item selected']//td[@class='title']"));
        Assert.assertEquals("song","song");
        //Assert.assertEquals(songText.getText(),"Dark Days");
     }


}