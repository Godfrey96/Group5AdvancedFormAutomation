package tests;

import baseTests.BaseTest;
import org.openqa.selenium.io.Read;
import org.testng.annotations.Test;
import utils.ReadData;

public class InventoryTest extends BaseTest {

    @Test(priority = 5)
    public void clickLearnNavButton() throws InterruptedException {
        landingPage.clickLearnNavButtonDropdown();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void clickLearningMaterialsButton() throws InterruptedException {
        landingPage.learningMaterialsButton();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void clickWebAutomationAdvanceFormTab() throws InterruptedException {
        landingPage.webAutomationAdvanceFormTab();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void selectDeviceTypeDropdown() throws InterruptedException {
        inventoryPage.selectDeviceType(ReadData.deviceType);
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void selectBrandDropdown() throws InterruptedException {
        inventoryPage.selectBrand(ReadData.brand);
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void selectStorageGB() throws InterruptedException {
        inventoryPage.selectStorage(ReadData.storage);
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void selectColorDropdown() throws InterruptedException {
        inventoryPage.selectColor(ReadData.color);
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public void enterQuantityTest() throws InterruptedException {
        inventoryPage.incrementQuantity(ReadData.quantity);
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void enterDeliveryAddressTest() throws InterruptedException {
        inventoryPage.enterDeliveryAddress(ReadData.address);
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void VerifyCurrentPriceValueTest() throws InterruptedException {
        inventoryPage.VerifyCurrentPriceValue();
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void verifyQuantitySummaryTest() throws InterruptedException {
        inventoryPage.verifyQuantitySummary();
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public void verifySubtotalTest() throws InterruptedException {
        inventoryPage.verifySubtotal();
        Thread.sleep(2000);
    }

    @Test(priority = 18)
    public void verifyPricingNoteTest() throws InterruptedException {
        inventoryPage.verifyPricingNote();
        Thread.sleep(2000);
    }

    @Test(priority = 19)
    public void verifyPreviewSectionTest() throws InterruptedException {
        inventoryPage.verifyPreviewSection();
        Thread.sleep(2000);
    }

    @Test(priority = 20)
    public void clickInventoryNextButtonTest() throws InterruptedException {
        inventoryPage.clickInventoryNextButton();
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver, "Inventory Form");
    }
}
