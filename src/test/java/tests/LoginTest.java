package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest{

    @Test
    public void positiveLogin(){
        boolean isLoggedIn = loginPage.open().login(USERNAME,PASSWORD).isPageOpened();
       assertTrue(isLoggedIn);
    }
}
