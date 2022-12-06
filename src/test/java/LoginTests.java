import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginTests extends BaseTest{


   @Test(priority = 0)
    public void LoginEmptyEmailPasswordTest ()  {
             Assert.assertEquals(driver.getCurrentUrl(), url);
             driver.quit();
    }

    @Test(priority = 1)
    public void LoginValidEmailValidPasswordTest ()  {
        provideEmail("trangoishi99@gmail.com");
        providePassword("te$t$tudent");
        clickSubmitBtn();

        WebElement avatarIcon = driver.findElement(By.xpath("//img[contains(@alt,'Avatar of')]"));
        //WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
        Assert.assertTrue(avatarIcon.isDisplayed());

        driver.quit();
    }



    @Test(enabled = false,priority = 2)
    public void LoginInvalidEmailPasswordTest () throws InterruptedException {
        provideEmail("dem@class.com");
        providePassword("");
        clickSubmitBtn();

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();

        // Vd
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        driver.quit();
    }

//    private void providePassword(String pass) {
//        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
//        passwordField.click();
//        passwordField.sendKeys(pass);
//    }
//
//    private void provideEmail(String email) {
//        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
//        emailField.click();
//        emailField.sendKeys(email);
//    }
//    private void clickSubmitBtn() {
//        WebElement clickBtn = driver.findElement(By.cssSelector("[type='submit']"));
//        clickBtn.click();
//
//    }
    @Test(enabled = false)
    public void LoginValidEmailEmptyPasswordTest () {

        provideEmail("demo@class.com");
        providePassword("");
        clickSubmitBtn();

        driver.quit();
    }

    @Test(enabled = false)
    public void SwitchToSongsMenu () throws InterruptedException {


        By avatarSelector = By.cssSelector("[alt='Avatar of student']");
        By songMenuSelector = By.className("songs");
        By allButtonSelector = By.className("btn-shuffle-all");

        Assert.assertTrue(driver.findElement(avatarSelector).isDisplayed());
        // WebElement songsMenu = driver.findElement(By.className("songs"));
        // WebElement songsMenu = driver.findElement(songMenuSelector);
        driver.findElement(songMenuSelector).click();
        Assert.assertTrue(driver.findElement(allButtonSelector).isDisplayed());
        Thread.sleep(2000);

        driver.quit();
    }

    @Test(enabled = false)
    public void SearchSong () throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);
        //By emailSelector = By.cssSelector("[type='email']");
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        By avatarSelector = By.cssSelector("[alt='Avatar of student']");
        //By searchBarSelector = By.id("searchForm");
        WebElement searchBarSelector = driver.findElement(By.cssSelector("[type='search']"));
        //By allButtonSelector = By.className("btn-shuffle-all");
        emailField.click();
        emailField.sendKeys("demo@class.com");

        passwordField.click();
        passwordField.sendKeys("te$t$tudent");

        submitButton.click();
        Assert.assertTrue(driver.findElement(avatarSelector).isDisplayed());
        // WebElement songsMenu = driver.findElement(By.className("songs"));
        // WebElement songsMenu = driver.findElement(songMenuSelector);

        searchBarSelector.sendKeys("Veggie Straws");
        Thread.sleep(2000);
        searchBarSelector.click();
        //Assert.assertTrue(driver.findElement().isDisplayed());
        Thread.sleep(5000);
        driver.quit();
    }

}
