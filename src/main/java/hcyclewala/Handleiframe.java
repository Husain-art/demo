package hcyclewala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handleiframe {
    public static void main(String[] args) throws InterruptedException
    {
        System.getProperty("webdriver.egde.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));

        Actions a = new Actions(driver);
        a.dragAndDrop(source, destination).build().perform();

        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@href, 'accordion')]")).click();

        //Assignment
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@frameborder='1']//frame[@name='frame-top']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']//frame[@name='frame-middle']")));
        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

        //a[contains(@href, "nested frames")]
    }
}
