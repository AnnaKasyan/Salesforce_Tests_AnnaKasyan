package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    protected static final String BASE_URL = "https://tms-e.my.salesforce.com/";
    final By NEW_BUTTON = By.cssSelector("a[title='New']");
    final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public abstract boolean isPageOpened();

    public abstract BasePage open();

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }


    public void waitUntilElementVisible(By locator) {
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitUntilElementClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
