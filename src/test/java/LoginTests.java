import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import stash.Stashed;


import java.time.Duration;

public class LoginTests {

    @Test
    public static void LoginValidEmailPasswordTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
        } finally {
            Thread.sleep(5000);
            //Assert.assertEquals(driver.getCurrentUrl(), url);
            driver.quit();
        }

    }


    //@Test
    public static void LoginEmptyPasswordTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://bbb.testpro.io/#!/home";
            driver.get(url);

            WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
            emailField.click();
            emailField.sendKeys("demo@class.com");

//        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
//        passwordField.click();
//        passwordField.sendKeys("te$t$tudent");


            WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
            submitButton.click();
            //
            WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
            Assert.assertTrue(avatarIcon.isDisplayed());
        } finally {
            Thread.sleep(5000);
            //Assert.assertEquals(driver.getCurrentUrl(), url);
            driver.quit();
        }


    }

    //@Test
    public static void LoginInvalidEmailTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://bbb.testpro.io/#!/home";
            driver.get(url);

            WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
            emailField.click();
            emailField.sendKeys("demopp@class.com");

            WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
            passwordField.click();
            passwordField.sendKeys("te$t$tudent");


            WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
            submitButton.click();
            //
            WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
            Assert.assertTrue(avatarIcon.isDisplayed());
        } finally {
            Thread.sleep(5000);
            //Assert.assertEquals(driver.getCurrentUrl(), url);
            driver.quit();
        }

    }

    // @Test
    public static void registrationTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

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

        WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
        Assert.assertTrue(avatarIcon.isDisplayed());


        WebElement songMenu = driver.findElement(By.className("songs"));
        songMenu.click();


        Thread.sleep(5000);
        driver.quit();


    }

    //@Test
    public static void songMenuTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

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

        WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
        Assert.assertTrue(avatarIcon.isDisplayed());


        WebElement songMenu = driver.findElement(By.className("songs"));
        songMenu.click();
        // short way
        //driver.findElement(songMenu).click();


        Thread.sleep(5000);
        driver.quit();


    }

    // @Test
    public static void HW14() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io";
        driver.get(url);

        WebElement registrationBtn = driver.findElement(By.id("hel"));
        registrationBtn.click();

        Thread.sleep(5000);
        driver.quit();

    }

    // @Test
    public static void HW15() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

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

        WebElement searchField = driver.findElement(By.cssSelector("[type='search']"));
        searchField.click();
        searchField.sendKeys("Pluto");

        Thread.sleep(5000);
        driver.quit();

    }

    @Test
    public static void LoginingTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //String url = "https://bbb.testpro.io/#!/home";
            //driver.get(url);
            By emailFieldSelector = By.cssSelector("[type='email']");
            By passFieldSelector = By.cssSelector("[type='password']");
            By submitButtonSelector = By.cssSelector("[type='submit']");
            By avatarIconSelector = By.cssSelector("[alt='Avatar of student']");
            By queueLinkSelector = By.cssSelector("[href=\"#!/queue\"]");
            By queueContainerSelector = By.cssSelector("#queueWrapper");
            By homeLinkSelector = By.linkText("Home");
            By searchFieldSelector = By.name("q");

            String loginEmail = "demo@class.com";
            String loginPass ="te$t$tudent";
            String url ="http://bbb.testpro.io/";

            driver.get(url);

            WebElement emailField = driver.findElement(emailFieldSelector);
            emailField.click();
            emailField.sendKeys("demo@class.com");

//            WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
            WebElement passwordField = driver.findElement(passFieldSelector);
            passwordField.click();
            passwordField.sendKeys("te$t$tudent");


            WebElement submitButton = driver.findElement(submitButtonSelector);
            submitButton.click();
            //
//            WebElement avatarIcon = driver.findElement(avatarIconSelector);
//            Assert.assertTrue(avatarIcon.isDisplayed());
        } finally {
            Thread.sleep(2000);
            //Assert.assertEquals(driver.getCurrentUrl(), url);
            driver.quit();
        }

    }
}

