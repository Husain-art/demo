package hcyclewala;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Spicejet_Realtest {

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);
        // rom input click= //div[@data-testid="to-testID-origin"]//input[@class="css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu"]
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("ar");
        Thread.sleep(5000);
        // autosuggest = //div[@class="css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73"]
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
        for(WebElement option: options)
        {
            if(option.getText().equalsIgnoreCase("Jamnagar"))
            {
                option.click();
                break;
            }
        }
        Thread.sleep(2000);

        //To input Click = //div[@data-testid='to-testID-destination']//input        
        driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input")).sendKeys("d");
        Thread.sleep(5000);
        // autosuggest = //div[@class="css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73"]
        List<WebElement> Toptions = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
        for(WebElement option: Toptions)
        {
            if(option.getText().equalsIgnoreCase("Delhi"))
            {
                option.click();
                break;
            }

        }

        Thread.sleep(2000);

        //Select date = //div[contains(@class, 'r-y47klf')]
        driver.findElement(By.xpath("//div[contains(@class, 'r-y47klf')]")).click();
        Thread.sleep(2000);
        //Adult input = //div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click();
        Thread.sleep(2000);
        //ult Incr = //div[@data-testid="Adult-testID-plus-one-cta"]
        
        for(int i=0; i<3;i++)
        {
            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
        }
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click();
        Thread.sleep(2000);

        //ChecboxCount = //div[@class="css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa"]

        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']"));
        System.out.println(checkboxes.size());

        //click = //div[text() = 'Family & Friends']
        driver.findElement(By.xpath("//div[text() = 'Family & Friends']")).click();
        Thread.sleep(2000);
        //div[text() = 'Search Flight']
        //div[@data-testid='home-page-flight-cta']
        driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
        Thread.sleep(9000);
    }

}
