import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {

    @Test
    public static void LoginEmptyEmailPasswordTest () {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        driver.quit();
    }
    @Test
    public static void searchSongbyTrangCode () throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://bbb.testpro.io/#!/home";
            driver.get(url);

            WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
            emailField.click();
            emailField.sendKeys("demo@class.com");

            WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
            passwordField.click();
            passwordField.sendKeys("te$t$tudent");


            WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
            submitButton.click();
            //
            WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
            Assert.assertTrue(avatarIcon.isDisplayed());

            //use Queue
            WebElement queueLink = driver.findElement(By.cssSelector("[href=\"#!/queue\"]"));
            //Assert.assertTrue(avatarIcon.isDisplayed());
            queueLink.click();

            WebElement queueContainer = driver.findElement(By.id("queueWrapper"));
            Assert.assertTrue(queueContainer.isDisplayed());

            WebElement artists = driver.findElement(By.cssSelector("[href=\"#!/artists\"]"));
            //Assert.assertTrue(avatarIcon.isDisplayed());
            artists.click();




            Thread.sleep(8000);



//            //there is two clas name home so we use [href="#!/home"]
//            WebElement homeLink = driver.findElement(By.cssSelector("[href=\"#!/home\"]"));
//            //Assert.assertTrue(avatarIcon.isDisplayed());
//            homeLink.click();
//            //there is another to use home

            WebElement homeLink = driver.findElement(By.linkText("Home"));
            //Assert.assertTrue(avatarIcon.isDisplayed());
            homeLink.click();

            //test search function
//            WebElement searchField = driver.findElement(By.cssSelector("[type='search']"));
//            searchField.click();
//            searchField.sendKeys("Pluto");

        }
        finally {
            Thread.sleep(5000);
            //Assert.assertEquals(driver.getCurrentUrl(), url);
            driver.quit();
        }

    }


}
