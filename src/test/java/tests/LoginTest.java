package tests;

import baseTests.BaseTest;
import org.testng.annotations.Test;
import utils.ReadData;

public class LoginTest extends BaseTest {

    @Test
    public void clickLoginButton() {
        takesScreenshots.takesSnapShot(driver, "home page");
        homePage.clickLoginButton();
    }

    @Test(priority = 1)
    public void enterUsernameTest() {
        //loginPage.enterUsername("testmogau@gmail.com");
        loginPage.enterUsername(ReadData.username);
    }

    @Test(priority = 2)
    public void enterPasswordTest() {
        //loginPage.enterPassword("@123456789");
        loginPage.enterPassword(ReadData.password);
        takesScreenshots.takesSnapShot(driver, "login page");
    }

    @Test(priority = 3)
    public void clickLoginSubmitButton() throws InterruptedException {
        loginPage.clickLoginSubmitButton();
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver, "dashboard page");
    }

    @Test(priority = 4)
    public void verifyLoginSuccessTest() {
        landingPage.verifyLoginSuccess();
        takesScreenshots.takesSnapShot(driver, "landing page");
    }
}
