package AamazonWebsite;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Productaddtocart {
    public static void main(String[] args) throws InterruptedException
    {
        System.getProperty("webdriver.edge.driver", "C:\\Users\\v-hcyclewala\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in/s?hidden-keywords=B0B6BLTGTT%7CB0BJ72WZQ7%7CB0D5LRGSCR%7CB0BVR7PGQ7%7CB0CQ4HSR2D%7CB0BF54972T%7CB0CG1Y3336%7CB0B3N7LR6K%7CB0BRQFF4HN%7CB0BY2NM7C8%7CB0BN1ZG1QZ%7CB0BW4F5PY3%7CB0C4T9J84B%7CB0C5RPCV7N%7CB0CVQG14RR%7CB0CG1V9H8T%7CB0BGSLP51D%7CB0CJ9KR5H8%7CB0BMVT1R78%7CB09V12K8NT%7CB0CNVJ39R8%7CB0BRL3C7HL%7CB0C7WFL6LK%7CB0B574QXFL%7CB0B5LVS732%7CB0CC24N1TR%7CB0BN3GHB9B%7CB0CT36R6MZ%7CB0BGGSGG35%7CB0CP9NZXLF%7CB094BLFQTM%7CB0BW5PZSGJ%7CB0CPPJ4YH8%7CB0C5D7LV7V%7CB0CR1GXM3K%7CB0C23RKWDF%7CB09PNKXSKF%7CB0CS6G3J36%7CB0CG255D44%7CB0C5CZM6FH%7CB0C96GTCGM%7CB0C5D2HW1Z%7CB0CBPL63B3%7CB0CH35WQ7T%7CB0BY2RZL6D%7CB0CN1FNZW8%7CB0D4F1D1M2%7CB0CKHRN9GT%7CB0C1YS2S26%7CB0C4KVLXVB%7CB0BZHQGVM3%7CB0CG3PDRJG%7CB0BCWKXR3Q%7CB0CB5TCLNK%7CB0C45TDR6W%7CB0CHS5JXNN%7CB0B46DZ376%7CB0C5CZ11CS%7CB09YRL7QBP%7CB0C1VSRMSB%7CB0CF1NTL6M%7CB0CCJ22FGS%7CB0CDPW2KLV%7CB0CQT3NDX7%7CB0CP7CM947%7CB0CFFD436C%7CB09ZQK9X8G%7CB0BYDLLHFX%7CB0CDSCM9BN%7CB0C5JBVN32%7CB097R25DP7%7CB0B7JTQM6Y%7CB0C5CXS8DJ%7CB0CG9SNFVS%7CB0BP18W8TM%7CB0BZVGHPCJ%7CB096VDJ5QX%7CB0CG1T39PB%7CB09ZKV1KKW%7CB0CLB7SV9M%7CB0BRFX19Y1%7CB0CG9SKN1G%7CB09HKKY58Z%7CB0C4LHRR4N%7CB0C4T91SNK%7CB0CL6KB51G%7CB0CM38LKCT%7CB0CKHV74XT%7CB0BS6TKTWF%7CB0BX2XBTWW%7CB0CHJSTMJM%7CB0CG9QL584%7CB0C7WFH4V6%7CB0CQ7N87FN%7CB0BWNB6YWG%7CB0C5WZLT9X%7CB0CC2JWCTR%7CB0C5DX12Z8%7CB0BYF8M554%7CB0CLYKDDP6&_encoding=UTF8&content-id=amzn1.sym.7357335a-266a-4319-832c-48a347da014c&pd_rd_r=7d05cba5-fe2e-40f7-be96-f31c04e2ab0d&pd_rd_w=3ueHj&pd_rd_wg=f9wlU&pf_rd_p=7357335a-266a-4319-832c-48a347da014c&pf_rd_r=EA7PWJ4YQE3N0EXYT814&ref=pd_hp_d_hero_unk");
        // driver.navigate().
        //span[@class="a-size-base-plus a-color-base a-text-normal"]
        //div[@class="a-section puis-atcb-add-container aok-inline-block"]//button

        String[] items = {"Noise Newly Launched Vortex Plus 1.46” AMOLED Display, AoD, BT Calling, Sleek Metal Finish, 7 Days Battery Life, All New OS with 100+ Watch Faces & Health Suite (Jet Black)",
                             "boAt Storm Call 3 w/Turn-by-Turn Navigation, 1.83\" (4.6 cm) HD Display, Bluetooth Calling, Crest+ OS, QR Tray, Watch Face Studio, Coins, Emergency SOS Smart Watch for Men & Women(Active Black)",
                             "Fire-Boltt Phoenix Ultra Luxury Stainless Steel, Bluetooth Calling Smartwatch, AI Voice Assistant, Metal Body with 120+ Sports Modes, SpO2, Heart Rate Monitoring (Multicolor)"};
        // Thread.sleep(3000);
        List<WebElement> Products = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        int j=0;
        for(int i=0; i<Products.size(); i++)
        {   
            String ProductName = Products.get(i).getText();
            List<String> itemsNeededList = Arrays.asList(items);

            if(itemsNeededList.contains(ProductName))
            {
                j=j+1;
                driver.findElements(By.xpath("//div[@class='a-section puis-atcb-add-container aok-inline-block']//button")).get(i).click();
            } 
            if(j==items.length)
            {
                break;
            }           
        }
        // Thread.sleep(5000);
        // driver.close();
    }

}
