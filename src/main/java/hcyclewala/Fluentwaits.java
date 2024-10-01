package hcyclewala;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.checkerframework.checker.units.qual.radians;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwaits {
    public static void main(String[] args)
    {
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new  EdgeDriver();
        driver.manage().window().maximize();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        String UserName = driver.findElement(By.xpath("//b[1]")).getText();
        driver.findElement(By.id("username")).sendKeys(UserName);

        String Password = driver.findElement(By.xpath("//b[2]")).getText();
        driver.findElement(By.id("password")).sendKeys(Password);

        driver.findElement(By.xpath("//input[@value='user']")).click();
        // w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='okayBtn']"))));
        
        Wait<WebDriver> W = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebElement f = W.until(new Function<WebDriver,WebElement>() {
            public WebElement apply(WebDriver driver){
                if(driver.findElement(By.xpath("//button[@id='okayBtn']")).isDisplayed())
                {
                    return driver.findElement(By.xpath("//button[@id='okayBtn']"));
                }
                else{
                    return null;
                }
            }
        });
        driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
        WebElement SelectElement = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
        //"//select[@data-style='btn-info']"
        Select S = new Select(SelectElement);
        S.selectByVisibleText("Consultant");

        driver.findElement(By.name("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        w.until(ExpectedConditions.urlMatches("https://rahulshettyacademy.com/angularpractice/shop"));
        List<WebElement> AddButtons = driver.findElements(By.xpath("//div[@class='card-footer']/button"));
        
        for(WebElement AddButton:AddButtons)
        {
            AddButton.click();
        }

        driver.findElement(By.partialLinkText("Checkout")).click();

    }
}
