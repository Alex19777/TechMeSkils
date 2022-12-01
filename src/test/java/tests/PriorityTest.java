package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PriorityTest {

    @Test(priority = 0)
    public void stepb()
    {
    }

    @Test(priority = 1)
    public void stepa()
    {
        Assert.assertEquals(2,2);
    }

    @Test(priority = 2)
    public void stepd()
    {
    }

    @Test(priority = 3)
    public void stepc()
    {
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void stepccc()
    {
       List list = null;
       list.size();
    }
}
