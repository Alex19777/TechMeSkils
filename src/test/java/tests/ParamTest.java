package tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class ParamTest {

    @Parameters({"login-value", "psw-value"})
    @Test
    public void paramTest(@Optional("default") String login, @Optional("default") String psw)
    {
        System.out.println("Login is: " + login);
        System.out.println("Psw is: " + psw);
    }
}
