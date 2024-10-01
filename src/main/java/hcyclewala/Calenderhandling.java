package hcyclewala;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Calenderhandling {
    public static void main(String[] args) {
        int day = 12, month = 6, year = 2026;
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector("div.react-date-picker")).click();
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        // driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        String crrentYear = driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']/span")).getText();
        int currentYear = Integer.parseInt(crrentYear);
        while(currentYear!=year)
        {
            if(currentYear>year)
                driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__prev-button']")).click();
            else if(currentYear<year)
                driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
            else
                break;

            crrentYear = driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']/span")).getText();
            currentYear = Integer.parseInt(crrentYear);
        }
        //class="react-calendar__tile react-calendar__year-view__months__month"
        driver.findElement(By.xpath("//button[contains(@class, 'react-calendar__year-view__months__month')]["+month+"]")).click();
        driver.findElement(By.xpath("//abbr[text() = '" + day +"']")).click();
        List<WebElement> dateComponent = driver.findElements(By.xpath("//input[contains(@class, 'react-date-picker__inputGroup__input react-date-picker__inputGroup')]"));

        int sDay = Integer.parseInt(dateComponent.get(1).getAttribute("value"));
        int sMonth = Integer.parseInt(dateComponent.get(0).getAttribute("value"));
        int sYear = Integer.parseInt(dateComponent.get(2).getAttribute("value"));
        
        Assert.assertEquals(sDay, day);
        Assert.assertEquals(sMonth, month);
        Assert.assertEquals(sYear, year);

        System.out.println(sDay + " " + sMonth+ " "+ sYear);

    }
}
