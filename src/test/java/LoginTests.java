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
 
=======
    public static void LoginGoodPassWord () {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        By emailFieldSelector = driver.findElement(By.xpath("//input[@type='email"));
//        By emailFieldSelector = driver.findElement(By.xpath("//input[@type='email"));
//        By emailFieldSelector = driver.findElement(By.xpath("//input[@type='email"));
//        By emailFieldSelector = driver.findElement(By.xpath("//input[@type='email"));
//        By emailFieldSelector = driver.findElement(By.xpath("//input[@type='email"));
//        By emailFieldSelector = driver.findElement(By.xpath("//input[@type='email"));
//        By emailFieldSelector = driver.findElement(By.xpath("//input[@type='email"));
//        By emailFieldSelector = driver.findElement(By.xpath("//input[@type='email"));
    }


>>>>>>> Stashed changes
}
