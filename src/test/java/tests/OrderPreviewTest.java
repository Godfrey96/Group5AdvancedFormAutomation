package tests;

import baseTests.BaseTest;
import org.openqa.selenium.io.Read;
import org.testng.annotations.Test;
import utils.ReadData;

public class OrderPreviewTest extends BaseTest {

    @Test(priority = 21)
    public void verifyDeviceSummary() throws InterruptedException {
        orderPreviewPage.showDeviceSummary();
        Thread.sleep(2000);
    }

    @Test(priority = 22)
    public void clickShippingMethod() throws InterruptedException {
        orderPreviewPage.selectShippingMethod(ReadData.shippingMethod);
        Thread.sleep(2000);
    }

    @Test(priority = 23)
    public void clickWarranty() throws InterruptedException {
        orderPreviewPage.selectWarrantyOption(ReadData.warranty);
        Thread.sleep(2000);
    }

    @Test(priority = 24)
    public void enterDiscountCodeTest() throws InterruptedException {
        orderPreviewPage.enterDiscountCode(ReadData.discountCode);
        Thread.sleep(2000);
    }

    @Test(priority = 25)
    public void clickApplyDiscountButtonTest() throws InterruptedException {
        orderPreviewPage.clickApplyDiscountBtn();
        Thread.sleep(2000);
    }

    @Test(priority = 26)
    public void verifyDiscountFeedbackText() throws InterruptedException {
        orderPreviewPage.showDiscountFeedbackText();;
        Thread.sleep(2000);
    }

    @Test(priority = 27)
    public void verifyPreviewSummaryTest() {
        orderPreviewPage.showPreviewSummary();
    }

    @Test(priority = 28)
    public void verifyBreakDownSummaryTest() throws InterruptedException {
        orderPreviewPage.showPriceBreakDown();
        Thread.sleep(2000);
    }

    @Test(priority = 29)
    public void clickConfirmPurchaseTest() throws InterruptedException {
        orderPreviewPage.clickConfirmPurchaseBtn();
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver, "Inventory Requirements");
    }

    @Test(priority = 30)
    public void verifyOrderModalTest() throws InterruptedException {
        orderPreviewPage.showOrderSuccessfullyModal();
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver, "Order Successful");
    }

    @Test(priority = 31)
    public void clickViewInvoiceButtonTest() throws InterruptedException {
        orderPreviewPage.clickViewInvoiceBtn();
        Thread.sleep(2000);
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
