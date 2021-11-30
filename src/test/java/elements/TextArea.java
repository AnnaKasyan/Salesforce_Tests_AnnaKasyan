package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea extends BaseElement {

    protected String textarea;
    final String textareaElementLocatorForAccounts = "//div[@class='full forcePageBlock forceRecordLayout']//following::span[text() = '%s'] /ancestor::div[contains(@class, 'uiInput')]//textarea";
    final String textareaStreetElementLocator = "//textarea[@name='street']";


    public TextArea(WebDriver driver, String textarea) {
        super(driver);
        this.textarea = textarea;
    }

    public void writeAccountsFields(String text) {
        driver.findElement(By
                .xpath(String.format(textareaElementLocatorForAccounts, textarea))).sendKeys(text);
    }

    public void writeContactsFields(String text) {
        driver.findElement(By
                .xpath(String.format(textareaStreetElementLocator))).sendKeys(text);
    }
}
