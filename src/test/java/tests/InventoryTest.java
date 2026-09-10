package tests;

import baseTests.BaseTest;
import org.openqa.selenium.io.Read;
import org.testng.annotations.Test;
import utils.ReadData;

public class InventoryTest extends BaseTest {

    @Test(priority = 5)
    public void clickLearnNavButton() {
        landingPage.clickLearnNavButtonDropdown();
    }

    @Test(priority = 6)
    public void clickLearningMaterialsButton() {
        landingPage.learningMaterialsButton();
    }

    @Test(priority = 7)
    public void clickWebAutomationAdvanceFormTab() {
        landingPage.webAutomationAdvanceFormTab();
    }

    @Test(priority = 8)
    public void selectDeviceTypeDropdown() {
        inventoryPage.selectDeviceType(ReadData.deviceType);
    }

    @Test(priority = 9)
    public void selectBrandDropdown() {
        inventoryPage.selectBrand(ReadData.brand);
    }

    @Test(priority = 10)
    public void selectStorageGB() {
        inventoryPage.selectStorage(ReadData.storage);
    }

    @Test(priority = 11)
    public void selectColorDropdown() {
        inventoryPage.selectColor(ReadData.color);
    }

    @Test(priority = 12)
    public void enterQuantityTest() {
        inventoryPage.incrementQuantity(ReadData.quantity);
    }

    @Test(priority = 13)
    public void enterDeliveryAddressTest() {
        inventoryPage.enterDeliveryAddress(ReadData.address);
    }

    @Test(priority = 14)
    public void VerifyCurrentPriceValueTest() {
        inventoryPage.VerifyCurrentPriceValue();
    }

    @Test(priority = 15)
    public void verifyQuantitySummaryTest() {
        inventoryPage.verifyQuantitySummary();
    }

    @Test(priority = 16)
    public void verifySubtotalTest() {
        inventoryPage.verifySubtotal();
    }

    @Test(priority = 18)
    public void verifyPricingNoteTest() {
        inventoryPage.verifyPricingNote();
    }

    @Test(priority = 19)
    public void verifyPreviewSectionTest() {
        inventoryPage.verifyPreviewSection();
    }

    @Test(priority = 20)
    public void clickInventoryNextButtonTest() {
        inventoryPage.clickInventoryNextButton();
        takesScreenshots.takesSnapShot(driver, "Inventory Form");
    }
}
