package hcyclewala;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

// import dev.failsafe.internal.util.Assert;
public class WindowsHandle {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.edge.driver","C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();
    }
}
