package hcyclewala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativelocators {
    public static void main(String[] args) {
        System.getProperty("wedriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement inputElmnt = driver.findElement(By.xpath("//input[@name='name']"));
        String name = driver.findElement(with(By.tagName("label")).above(inputElmnt)).getText();
        System.out.println(name);

        WebElement chkbxElmnt = driver.findElement(By.xpath("//input[@id='exampleCheck1']"));
        String chkbxtxt = driver.findElement(with(By.tagName("label")).toRightOf(chkbxElmnt)).getText();
        System.out.println(chkbxtxt);

        
    }
}
