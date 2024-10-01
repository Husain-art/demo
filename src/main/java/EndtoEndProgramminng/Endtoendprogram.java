package EndtoEndProgramminng;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Endtoendprogram {
    public static void main(String[] args) throws InterruptedException
    {
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        List<WebElement> footerClmLinks = driver.findElements(By.xpath("//table[@class='gf-t']//td[1]//li"));
        // System.out.println(driver.findElement(By.xpath("(//table[@class='gf-t']//ul)[1]/li/a")).getAttribute("href"));
        for(int i=1; i<footerClmLinks.size(); i++)
        {
            // System.out.println(footerClmLinks.get(i).getText());
            String clickLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
            // footerClmLinks.get(i).findElement(By.tagName("a")).sendKeys(clickLink);
            footerClmLinks.get(i).findElement(By.xpath(".//a")).sendKeys(clickLink);
            Set<String> wh = driver.getWindowHandles();
            Iterator<String> Itr = wh.iterator();
            String parentId = Itr.next();
            String childId = Itr.next();
            driver.switchTo().window(childId);
            System.out.println(driver.getTitle());
            driver.close();
            driver.switchTo().window(parentId);
            Thread.sleep(1000);
        }

        
    }

}
