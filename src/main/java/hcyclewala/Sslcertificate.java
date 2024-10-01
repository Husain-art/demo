package hcyclewala;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Sslcertificate {
    public static void main(String[] args) throws InterruptedException 
    {
        EdgeOptions option = new EdgeOptions();
        option.setAcceptInsecureCerts(true);

        // ChromeOptions option = new ChromeOptions();
        // option.setAcceptInsecureCerts(true);

        // FirefoxOptions option = new FirefoxOptions();
        // option.setAcceptInsecureCerts(true);

        //Set proxy
        Proxy proxy = new Proxy();
        proxy.getHttpProxy();
        option.setCapability("proxy", proxy);

        //add Extention
        // option.addExtensions("C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.crx");

        //block popups
        option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        //set default directory
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download-default-directory", "/Directory/Path");
        option.setExperimentalOption("pref", prefs);

    
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());

        //deleting cookies
        driver.manage().deleteAllCookies();
        //test scenario to chk site directed to login page after deleting session cookie
        driver.manage().deleteCookieNamed("Sessionkey");
    }
}
