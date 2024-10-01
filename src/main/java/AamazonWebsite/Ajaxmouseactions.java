package AamazonWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajaxmouseactions {
    public static void main (String[] args)
    {
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        Actions a = new Actions(driver);

        WebElement M = driver.findElement(By.xpath("//div[@id='nav-belt']//a[@aria-label='Choose a language for shopping.']"));
        a.moveToElement(M).build().perform();
        a.click(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        a.contextClick(M).build().perform();

    }
}
