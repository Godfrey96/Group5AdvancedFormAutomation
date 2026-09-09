package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class InventoryPage {

    WebDriver driver;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropdown;

    @FindBy(id = "brand")
    WebElement brandDropdown;

    @FindBy(id = "storage-64GB")
    WebElement storage64GB;

    @FindBy(id = "storage-128GB")
    WebElement storage128GB;

    @FindBy(id = "storage-256GB")
    WebElement storage256GB;

    @FindBy(xpath = "//*[@id=\"inventory-form-grid\"]/div[4]/div")
    private List<WebElement> storageGroup;

    @FindBy(id = "color")
    WebElement colorDropdown;

    @FindBy(id = "quantity")
    WebElement quantityInput;

    @FindBy(id = "address")
    WebElement deliveryAddress;

    @FindBy(id = "unit-price-value")
    WebElement currentPriceValue;

    @FindBy(id = "quantity-label")
    WebElement quantitySummary;

    @FindBy(id = "subtotal-label")
    WebElement subtotal;

    @FindBy(id = "pricing-note")
    WebElement pricingNote;

    @FindBy(xpath = "//*[@id=\"device-preview\"]/div")
    WebElement previewSection;

    @FindBy(id = "inventory-next-btn")
    WebElement inventoryNextButton;

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectDeviceType(String deviceType) {
        Select select = new Select(new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(deviceTypeDropdown)));
        select.selectByVisibleText(deviceType);
    }

    public void selectBrand(String brand) {
        Select select = new Select(new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(brandDropdown)));
        select.selectByVisibleText(brand);
    }

//    public void selectStorage128GB() {
//        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(storage128GB));
//        storage128GB.click();
//    }

    public void selectStorage(String storageValue) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(storage128GB));

        switch (storageValue.trim()) {
            case "64GB":
                storage64GB.click();
                break;
            case "128GB":
                storage128GB.click();
                break;
            case "256GB":
                storage256GB.click();
                break;
            default:
                throw new RuntimeException("Invalid storage value from Excel: " + storageValue);
        }
    }

    public void selectColor(String color) {
        Select select = new Select(new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(colorDropdown)));
        select.selectByVisibleText(color);
    }

    public void incrementQuantity(int steps) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(quantityInput));
        quantityInput.click();
        for (int i = 0; i < steps; i++) {
            quantityInput.sendKeys(Keys.ARROW_UP);
        }
    }

    public void enterDeliveryAddress(String address) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(deliveryAddress));
        deliveryAddress.sendKeys(address);
    }

    public void VerifyCurrentPriceValue() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(currentPriceValue));
        currentPriceValue.isDisplayed();
    }

    public void verifyQuantitySummary() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(quantitySummary));
        quantitySummary.isDisplayed();
    }

    public void verifySubtotal() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(subtotal));
        subtotal.isDisplayed();
    }

    public void verifyPricingNote() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(pricingNote));
        pricingNote.isDisplayed();
    }

    public void verifyPreviewSection() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(previewSection));
        previewSection.isDisplayed();
    }

    public void clickInventoryNextButton() {
        //new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(inventoryNextButton));
        inventoryNextButton.click();
    }

}
