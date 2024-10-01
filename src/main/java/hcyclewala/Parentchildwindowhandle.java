package hcyclewala;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Parentchildwindowhandle {
    public static void main(String[] args)
    {
         System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

        //opening nee blank Tab or Window. this action responsible to fire the action but handle is remain at parent window.
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);

        Set<String> winIds = driver.getWindowHandles();
        Iterator<String> it = winIds.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        String UserName = driver.findElement(By.xpath("//strong/a")).getText();

        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(UserName);
    }
}
