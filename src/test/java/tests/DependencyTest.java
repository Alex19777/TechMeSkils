package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest{

    @Test
    public void stepb()
    {
    }

    @Test(dependsOnMethods = "stepb")
    public void stepa()
    {
        Assert.assertEquals(1,2);
    }

    @Test(dependsOnMethods = "stepa", alwaysRun = true)
    public void stepd()
    {
    }

    @Test(dependsOnMethods = "stepd", alwaysRun = true)
    public void stepc()
    {
    }
}
