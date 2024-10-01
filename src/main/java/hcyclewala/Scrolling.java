package hcyclewala;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
         System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        //getting text from java script executor
        //String val = "return.document.getElementById(\"hiddentext\").value";
        //String text = (String) js.executeScript(val);
        List<WebElement> amounts = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
        int sum = 0;
        for(int i=0; i<amounts.size(); i++)
        {
            sum = sum + Integer.parseInt(amounts.get(i).getText());
        }
        System.out.println(sum);
    }
}
