package hcyclewala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownSelect {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.edge.driver","C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        // dropdown.deselectByIndex(3);  //Deselect apply only on multiselect
        // System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        System.out.println(dropdown.getFirstSelectedOption().getAttribute("value"));
        
        driver.close();
        // String[] option = new String[3];
        // ArrayList<WebElement> options = new ArrayList<>();

        // options = dropdown.getOptions().get


    }
}
