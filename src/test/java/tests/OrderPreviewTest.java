package tests;

import baseTests.BaseTest;
import org.openqa.selenium.io.Read;
import org.testng.annotations.Test;
import utils.ReadData;

public class OrderPreviewTest extends BaseTest {

    @Test(priority = 21)
    public void verifyDeviceSummary() {
        orderPreviewPage.showDeviceSummary();
    }

    @Test(priority = 22)
    public void clickShippingMethod() {
        orderPreviewPage.selectShippingMethod(ReadData.shippingMethod);
    }

    @Test(priority = 23)
    public void clickWarranty() {
        orderPreviewPage.selectWarrantyOption(ReadData.warranty);
    }

    @Test(priority = 24)
    public void enterDiscountCodeTest() {
        orderPreviewPage.enterDiscountCode(ReadData.discountCode);
    }

    @Test(priority = 25)
    public void clickApplyDiscountButtonTest() {
        orderPreviewPage.clickApplyDiscountBtn();
    }

    @Test(priority = 26)
    public void verifyDiscountFeedbackText() {
        orderPreviewPage.showDiscountFeedbackText();;
    }

    @Test(priority = 27)
    public void verifyPreviewSummaryTest() {
        orderPreviewPage.showPreviewSummary();
    }

    @Test(priority = 28)
    public void verifyBreakDownSummaryTest() {
        orderPreviewPage.showPriceBreakDown();
    }

    @Test(priority = 29)
    public void clickConfirmPurchaseTest() {
        orderPreviewPage.clickConfirmPurchaseBtn();
        takesScreenshots.takesSnapShot(driver, "Inventory Extras");
    }

    @Test(priority = 30)
    public void verifyOrderModalTest() {
        orderPreviewPage.showOrderSuccessfullyModal();
        takesScreenshots.takesSnapShot(driver, "Order Successful");
    }

    @Test(priority = 31)
    public void clickViewInvoiceButtonTest() {
        orderPreviewPage.clickViewInvoiceBtn();
    }

    @Test(priority = 32)
    public void verifyViewInvoiceHistoryModalTest() throws InterruptedException {
        orderPreviewPage.showViewInvoiceHistoryModal();
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver, "invoice history");
    }

    @Test(priority = 33)
    public void clickViewHistoryButtonTest() throws InterruptedException {
        orderPreviewPage.clickViewHistoryBtn();
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver, "view history");
    }
}
