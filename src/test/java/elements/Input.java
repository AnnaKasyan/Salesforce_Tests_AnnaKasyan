package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends BaseElement {

    protected String inputName;
    final String inputElementLocator = "//div[@role='dialog' and @aria-modal='true']//*[text()= '%s']" + "/ancestor::div[contains(@class, 'uiInput')]//input";


    public Input(WebDriver driver, String inputName) {
        super(driver);
        this.inputName = inputName;
    }

    public void write(String text) {
        driver.findElement(By
                .xpath(String.format(inputElementLocator, inputName))).sendKeys(text);
    }

    public void clear() {
        driver.findElement(By
                .xpath(String.format(inputElementLocator, inputName))).clear();
    }
}
