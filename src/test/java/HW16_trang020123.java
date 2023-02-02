import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class HW16_trang020123 {
    @Test(enabled = true)
    public void CreatePlayListHW () throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);

        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        emailField.click();
        emailField.sendKeys("trangoishi99@gmail.com");

        WebElement passwordField= driver.findElement(By.xpath("//*[@type='password']"));
        passwordField.click();
        passwordField.sendKeys("te$t$tudent");

        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));
        submitButton.click();

        WebElement avatarSelector = driver.findElement(By.xpath("//a[@href='/#!/profile']"));
        Assert.assertTrue(avatarSelector.isDisplayed());






        driver.quit();
    }

}


