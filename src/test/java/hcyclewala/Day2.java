package hcyclewala;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {
    @Test(dataProvider = "getData", groups = {"smoke"})
    public void ploan(String usrname, String password){
        System.out.println("good"); 
        System.out.println(usrname);
        System.out.println(password);
    }

    @BeforeTest(groups = {"smoke"})
    public void PreRequisite(){
        System.out.println("I will execute First");
        
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] arr = new Object[3][2];
        arr[0][0] = "FirstUserName";
        arr[0][1] = "FirstPassword";

        arr[1][0] = "SecondUserName";
        arr[1][1] = "SecondPassword";

        arr[2][0] = "ThirdUserName";
        arr[2][1] = "ThirdPassword";

        return arr;
    }
}
