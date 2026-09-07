package tests;

import baseTests.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void clickLoginButton() {
        homePage.clickLoginButton();
    }

    @Test(priority = 1)
    public void enterUsernameTest() {
        loginPage.enterUsername("testmogau@gmail.com");
    }

    @Test(priority = 2)
    public void enterPasswordTest() {
        loginPage.enterPassword("@123456789");
    }

    @Test(priority = 3)
    public void clickLoginSubmitButton() throws InterruptedException {
        loginPage.clickLoginSubmitButton();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void verifyLoginSuccessTest() {
        landingPage.verifyLoginSuccess();
    }
}
