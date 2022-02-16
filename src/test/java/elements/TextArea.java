package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextArea extends BaseElement {

    protected String textarea;
    final String textareaElementLocatorForAccounts = "//div[@class='full forcePageBlock forceRecordLayout']//following::span[text() = '%s'] /ancestor::div[contains(@class, 'uiInput')]//textarea";


    public TextArea(WebDriver driver, String textarea) {
        super(driver);
        this.textarea = textarea;
    }

    public void write(String text) {
        log.info(String.format("setting %s into %s input", text, label));
        driver.findElement(By
                .xpath(String.format(textareaElementLocatorForAccounts, textarea))).sendKeys(text);
    }
}
