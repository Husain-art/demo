package hcyclewala;

import java.time.Duration;
import java.util.ArrayList;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-hcyclewala\\JavaProjects\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        // System.setProperty("webdriver.gecko.driver", "Path to GeckoDriver exe");
        // WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.edge.driver","C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john123@rsa");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("John123@rgh");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("8989898987");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String name = "Husain";
        String password = getPassword(driver);
        // System.out.println(password);

        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type *='pass'] ")).sendKeys(password);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        driver.findElement(By.xpath("//button[text() = 'Log Out']")).click();
        driver.close();
        // travering between sibling with xpath: "//header/div//button[1]/following-sibling::button[1]" 
        //traversing to parent: //header/div//button[1]/parent::div/parent::header
    }

    public static String getPassword(WebDriver driver)
    {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String Ps = driver.findElement(By.cssSelector("form p")).getText();
        String[] PsArray = Ps.split("'");
        String Ps1Index = PsArray[1];
        String[] PsArrayN = Ps1Index.split("'");
        String  Ps0Index = PsArrayN[0];
        return Ps0Index;
    }
}
