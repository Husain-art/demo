package hcyclewala;

import org.testng.annotations.Test;

public class AppTest 
{
    @Test(groups = {"smoke"})
    public void demo()
    {
        System.out.println("Hello");
    }

    @Test
    public void secondTest()
    {
        System.out.println("Bye");
    }

}
