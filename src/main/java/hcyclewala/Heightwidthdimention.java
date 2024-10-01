package hcyclewala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Heightwidthdimention {
    public static void main(String[] args) {
        
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com/");
        WebElement imgElmnt = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        int dH = imgElmnt.getRect().getDimension().getHeight();
        int nH = imgElmnt.getRect().getHeight();

        System.out.println(dH + " " + nH);
    }

}
