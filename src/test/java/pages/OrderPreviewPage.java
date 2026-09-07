package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPreviewPage {

    WebDriver driver;

    @FindBy(id = "device-summary-title")
    WebElement deviceSummaryTitleLabel;

    @FindBy(id = "shipping-option-express")
    WebElement shippingOptionExpress;

    @FindBy(id = "warranty-option-1yr")
    WebElement warrantyOptionOneYear;

    @FindBy(id = "discount-code")
    WebElement discountCode;

    @FindBy(id = "discount-feedback")
    WebElement discountFeedbackText;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountBtn;

    @FindBy(xpath = "//*[@id=\"device-preview-wrapper\"]/div")
    WebElement preview;

    @FindBy(xpath = "//*[@id=\"pricing-summary\"]")
    WebElement priceBreakDown;

    @FindBy(id = "purchase-device-btn")
    WebElement confirmPurchaseBtn;

    @FindBy(id = "purchase-success-toast")
    WebElement orderSuccessfullyModal;

    @FindBy(xpath = "//*[@id=\"view-history-btn\"]")
    WebElement viewInvoiceBtn;

    @FindBy(id = "invoice-history-panel")
    WebElement viewInvoiceHistoryModal;

    @FindBy(xpath = "//*[starts-with(@id, 'view-invoice-INV')]")
    WebElement viewHistoryBtn;

    public OrderPreviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void showDeviceSummary() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(deviceSummaryTitleLabel));
        deviceSummaryTitleLabel.isDisplayed();
    }

    public void selectShippingMethod() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(shippingOptionExpress));
        shippingOptionExpress.click();
    }

    public void selectWarranty() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(warrantyOptionOneYear));
        warrantyOptionOneYear.click();
    }

    public void enterDiscountCode(String discount) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(discountCode));
        discountCode.sendKeys(discount);
    }

    public void clickApplyDiscountBtn() {
        //new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(applyDiscountBtn));
        applyDiscountBtn.click();
    }

    public void showDiscountFeedbackText() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(discountFeedbackText));
        discountFeedbackText.isDisplayed();
    }

    public void showPreviewSummary() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(preview));
        preview.isDisplayed();
    }

    public void showPriceBreakDown() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(priceBreakDown));
        priceBreakDown.isDisplayed();
    }

    public void clickConfirmPurchaseBtn() {
        //new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(confirmPurchaseBtn));
        confirmPurchaseBtn.click();
    }

    public void showOrderSuccessfullyModal() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(orderSuccessfullyModal));
        orderSuccessfullyModal.isDisplayed();
    }

    public void clickViewInvoiceBtn() {
        //new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(viewInvoiceBtn));
        viewInvoiceBtn.click();
    }

    public void showViewInvoiceHistoryModal() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(viewInvoiceHistoryModal));
        viewInvoiceHistoryModal.isDisplayed();
    }

    public void clickViewHistoryBtn() {
        //new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(viewHistoryBtn));
        viewHistoryBtn.click();
    }


}
