import InternSearch.pages.LoginPageSearch;
import InternSearch.pages.SearchPageSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Search extends BaseTest {
    @Test(enabled = true)// dataProvider = "songTitles", dataProviderClass = BaseTest.class)
    public void searchSongTitle() throws InterruptedException{

//        login();
        LoginPageSearch Login = new LoginPageSearch(driver);
        SearchPageSearch searching = new SearchPageSearch(driver);
        Login.login();
        searching.songTitleInfofromAllSong();
        //Assert.assertEquals(searching.songTitleInfofromAllSong(),true);

//        WebElement searchInput = driver.findElement(By.cssSelector("[type='search']"));
//        searchInput.sendKeys("Dark Days");


    }
     //expect to see result
     public void resultFromSearch(){
        
     }


}