package hcyclewala;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");

        //Taking Screen shot for whole page 
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\v-hcyclewala\\OneDrive - Microsoft\\V Desktop\\SS.jpg"));

        //Taking Screen shot for specific element
        File file = driver.findElement(By.xpath("//img[@class='lnXdpd']")).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\v-hcyclewala\\OneDrive - Microsoft\\V Desktop\\SSIcon.jpg"));
    }

}
