package hcyclewala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;

public class DropdownLoop {
    public static void main(String[] args)
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int i =1;
        while (i<4)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i = i+1;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.close();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
    }
}
