package hcyclewala;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

    @AfterSuite
    public void AfTest(){
        System.out.println("I am on last No.");
    }

    @BeforeClass
    public void BfClass(){
        System.out.println("I will execute before execute any method of this class");
        // using for delete cookies or cacthes before we execute method
    }
    @BeforeMethod
    public void BfEvery(){
        System.out.println("I will execute before execute every method of this class");
        // using for delete cookies or cacthes before we execute method
    }

    @AfterMethod
    public void AfEvery(){
        System.out.println("I will execute After execute every method of this class");
    }
    @Test(groups = {"smoke"})
    public void postRequisite(){
        System.out.println("I Will Execute last");
    }

    @AfterTest(groups = {"smoke"})
    @Parameters({"URL", "APIKey"})
    public void webloginHomeLoan(String url, String key){
        System.out.println("webloginHomeLoan");
        System.out.println(url);
        System.out.println(key);
    }

    //if i already know that this function have some bugs then this enable false will help to not trigger "mobileloginHomeLoan" method.
    @Test(enabled = false) 
    public void mobileloginHomeLoan(){
        System.out.println("mobileloginHomeLoan");
    }

    @Test(dependsOnMethods = {"mobileloginHomeLoan"}) //this will excute "mobileloginHomeLoan" first than excute loginAPIHomeLoan.
    public void loginAPIHomeLoan(){
        System.out.println("loginAPIHomeLoan");
    }

    // timeOut will help to wait 4 sec before failing the test

    @BeforeSuite(timeOut = 4000)
    public void bfTest(){
        System.out.println("I am on no.1");
    }
}
