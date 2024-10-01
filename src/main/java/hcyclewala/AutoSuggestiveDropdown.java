package hcyclewala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // //ul[@id="ui-id-1"]
        //input[@id='autosuggest']
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option:options)
        {
            if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }
        }

            // Assignment 8
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("Uni");
        Thread.sleep(3000);
        List<WebElement> optns = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

        for(WebElement option:optns)
        {
            if(option.getText().contains("United Kingdom"))
            {
                option.click();
                break;
            }
        }

    }



    
}
