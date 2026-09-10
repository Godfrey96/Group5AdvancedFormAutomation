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

    @FindBy(id = "shipping-option-standard")
    WebElement shippingOptionStandard;

    @FindBy(id = "shipping-option-express")
    WebElement shippingOptionExpress;

    @FindBy(id = "warranty-option-none")
    WebElement warrantyOptionNone;

    @FindBy(id = "warranty-option-1yr")
    WebElement warrantyOptionOneYear;

    @FindBy(id = "warranty-option-2yr")
    WebElement warrantyOptionTwoYear;

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
        deviceSummaryTitleLabel.isDisplayed();
    }

    public void selectShippingMethod(String storageValue) {

        switch (storageValue.trim()) {
            case "Standard":
                shippingOptionStandard.click();
                break;
            case "Express":
                shippingOptionExpress.click();
                break;
            default:
                throw new RuntimeException("Invalid shipping method value from Excel: " + storageValue);
        }
    }

    public void selectWarrantyOption(String storageValue) {

        switch (storageValue.trim()) {
            case "None":
                warrantyOptionNone.click();
                break;
            case "1 Year":
                warrantyOptionOneYear.click();
                break;
            case "2 Year":
                warrantyOptionTwoYear.click();
                break;
            default:
                throw new RuntimeException("Invalid warranty value from Excel: " + storageValue);
        }
    }

    public void enterDiscountCode(String discount) {
        discountCode.sendKeys(discount);
    }

    public void clickApplyDiscountBtn() {
        applyDiscountBtn.click();
    }

    public void showDiscountFeedbackText() {
        discountFeedbackText.isDisplayed();
    }

    public void showPreviewSummary() {
        preview.isDisplayed();
    }

    public void showPriceBreakDown() {
        priceBreakDown.isDisplayed();
    }

    public void clickConfirmPurchaseBtn() {
        confirmPurchaseBtn.click();
    }

    public void showOrderSuccessfullyModal() {
        orderSuccessfullyModal.isDisplayed();
    }

    public void clickViewInvoiceBtn() {
        viewInvoiceBtn.click();
    }

    public void showViewInvoiceHistoryModal() {
        viewInvoiceHistoryModal.isDisplayed();
    }

    public void clickViewHistoryBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(viewInvoiceHistoryModal));
        viewHistoryBtn.click();
    }
}
