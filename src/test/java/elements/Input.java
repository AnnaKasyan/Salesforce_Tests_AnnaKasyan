package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends BaseElement {

    protected String inputName;
    final String inputElementLocatorForAccounts = "//div[@role='dialog' and @aria-modal='true']//*[text()= '%s']" + "/ancestor::div[contains(@class, 'uiInput')]//input";
    final String inputElementLocatorForContacts = "//*[text()= '%s']/parent::lightning-input//input";


    public Input(WebDriver driver, String inputName) {
        super(driver);
        this.inputName = inputName;
    }

    public void writeAccountsFields(String text) {
        driver.findElement(By
                .xpath(String.format(inputElementLocatorForAccounts, inputName))).sendKeys(text);
    }

    public void writeContactsFields(String text) {
        driver.findElement(By
                .xpath(String.format(inputElementLocatorForContacts, inputName))).sendKeys(text);
    }

    public void clear() {
        driver.findElement(By
                .xpath(String.format(inputElementLocatorForAccounts, inputName))).clear();
    }
}
