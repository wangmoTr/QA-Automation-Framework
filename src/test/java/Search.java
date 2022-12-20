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

    }
     //expect to see result
     public void resultFromSearch(){
         //*[@id='searchExcerptsWrapper']//span[text()="Dark Days"]
        
     }
     public boolean isSongExisting(String songName) {
         WebElement allsongs = driver.findElement(By.xpath("//a[@href='#!/songs']"));
         allsongs.click();
        WebElement songText= driver.findElement(By.xpath("//*[@id='songsWrapper']//td[text()='"+ songName+"']"));
        return songText.isDisplayed();
     }


}