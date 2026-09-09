package baseTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.*;
import utils.BrowserFactory;
import utils.ReadData;

import java.io.IOException;

public class BaseTest {

   protected static WebDriver driver;

   protected static HomePage homePage;
   protected static  LoginPage loginPage;
   protected static LandingPage landingPage;
   protected static InventoryPage inventoryPage;
   protected static OrderPreviewPage orderPreviewPage;
   //protected static ReadData readData;

   @BeforeSuite
   public void setUpSuite() throws IOException {

    driver = BrowserFactory.launchBrowser("edged","https://ndosisimplifiedautomation.vercel.app/");

    homePage = PageFactory.initElements(driver, HomePage.class);
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    landingPage = PageFactory.initElements(driver, LandingPage.class);
    inventoryPage = PageFactory.initElements(driver, InventoryPage.class);
    orderPreviewPage = PageFactory.initElements(driver, OrderPreviewPage.class);


   }

   @AfterSuite
   public void tearDownSuite() {
       BrowserFactory.quitBrowser();
   }
}
