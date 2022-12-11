package Intern.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritePageIntern extends BasePageIntern {

    public FavoritePageIntern(WebDriver givenDriver) {
        super(givenDriver);
    }
    public FavoritePageIntern selectSong(String songName) {
        driver.findElement(By.xpath("//section[@id='favoritesWrapper']//td[text()=" + songName+ "]"));
        return this;
    }

}
