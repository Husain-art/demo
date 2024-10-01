package hcyclewala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {
    public static void main(String args[]) throws InterruptedException
    {
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertbtn")).click();

        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
        // System.out.println(driver.switchTo().alert().hashCode());

        driver.findElement(By.id("confirmbtn")).click();
        // driver.switchTo().alert().notify();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();





    }
}
