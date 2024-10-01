package hcyclewala;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class Javastreamshandson {
    public static void main(String[] args) {
        
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        List<WebElement> namesEle = driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody/tr/td[1]"));

        List<String> orgList = namesEle.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> sortedList = orgList.stream().sorted().collect(Collectors.toList());
        
        org.testng.Assert.assertTrue(sortedList.equals(orgList));
        
        List<String> Amounts = namesEle.stream().filter(s->s.getText().contains("Joe")).map(s->s.findElement(By.xpath("./following-sibling::td[3]")).getText()).collect(Collectors.toList());
        List<String> chkAmnt = Arrays.asList("46");
        Assert.assertTrue(Amounts.equals(chkAmnt));

    }
}
