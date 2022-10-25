import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import stash.Stashed;

import java.time.Duration;

public void class hw16 extends BaseTest{
    @Test
    public static void hw16() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        
            // By emailFieldSelector = By.cssSelector("[type='email']");
            //*[@id="app"]/div/form/input[1]

            String loginEmail = "demo@class.com";
            String loginPass ="te$t$tudent";
            String url ="http://bbb.testpro.io/";

            driver.get(url);

            Selectors selectMe = new Selectors();

            Login(loginEmail,loginPass,driver);
            //
            WebElement avatarIcon = driver.findElement(selectMe.avatarIconSelector);
            Assert.assertTrue(avatarIcon.isDisplayed());

            //search pluto with xpath and validate the song is correct xpath //article//*[contains(text(),'Pluto']

            //*[@data-test='song-card']//*[contains(text(),'Pluto')]

            WebElement searchField = driver.findElement(selectMe.searchFieldSelector);
            searchField.click();
            searchField.sendKeys("Pluto");
            // how to validate song pluto

            WebElement isCorrectSong = driver.findElement(By.xpath("//*[@data-test='song-card']//*[contains(text(),'Pluto')]"));
            Assert.assertTrue(isCorrectSong.isDisplayed());
            Assert.assertTrue(true, "Pluto");

        } finally {
            Thread.sleep(2000);
            //Assert.assertEquals(driver.getCurrentUrl(), url);
            driver.quit();
        }

    }
    public static void Login(String loginEmail, String loginPass, WebDriver driver ) {
        Selectors selectMe = new Selectors();
        WebElement emailField = driver.findElement(selectMe.emailFieldSelector);
        emailField.click();
        emailField.sendKeys(loginEmail);

//            WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        WebElement passwordField = driver.findElement(selectMe.passFieldSelector);
        passwordField.click();
        passwordField.sendKeys(loginPass);


        WebElement submitButton = driver.findElement(selectMe.submitButtonSelector);
        submitButton.click();

    }


}
}