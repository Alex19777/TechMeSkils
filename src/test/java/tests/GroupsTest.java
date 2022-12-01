package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = "smoke")
    public void stepb()
    {
        Assert.assertEquals(1,1);
    }

    @Test(groups = "regression")
    public void stepa()
    {
        Assert.assertEquals(1,2);
    }

    @Test(groups = "regression")
    public void stepd()
    {
    }

    @Test(groups = {"smoke", "regression"})
    public void stepc()
    {
    }
}
