package InternSearch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPageSearch extends BasePageSearch {

    //Locators
    @FindBy(css="[type='search']")
    WebElement searchInput;

    //By searchInput = By.cssSelector("[type='search']");


    public SearchPageSearch(WebDriver givenDriver) {
        super(givenDriver);
    }

    public SearchPageSearch searchBox(String songName){
        searchInput.sendKeys(songName);
        return this;

    }


}
