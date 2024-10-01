package hcyclewala;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {
    public static void main(String[] args) throws MalformedURLException, IOException {
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");

        List<WebElement> urls = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
        SoftAssert  s = new SoftAssert();
        for(WebElement url:urls)
        {
            String link = url.getAttribute("href");

            HttpURLConnection conn = (HttpURLConnection)new URL(link).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int code = conn.getResponseCode();
            System.out.println(code);
            s.assertTrue(code<400, "Broken link is found on "+ url.getText()+ " with code error "+code );

        }
        s.assertAll();

    }

}
