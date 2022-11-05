package class23POMbrandNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePageSimple {
    WebDriver driver;
    WebDriverWait wait;

    public BasePageSimple(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://bbb.testpro.io/");
    }

    public void closeBrowser(){
        driver.quit();
    }

    public boolean isAvatarDisplaying(){
        return driver.findElement(By.cssSelector("img.avatar")).isDisplayed();

    }


}
