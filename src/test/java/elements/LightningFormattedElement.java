package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LightningFormattedElement extends BaseElement {

    String visibleTextLocator = "//span[contains(text(), '%s') and @class='test-id__field-label']/ancestor::div[contains(@class, 'test-id__output-root')]//*[@data-output-element-id='output-field']";

    public LightningFormattedElement(WebDriver driver, String label) {
        super(driver);
        this.label = label;
    }

    public String getText() {
        log.info(String.format("getting text about %s", label));
        return driver.findElement(By.xpath(String.format(visibleTextLocator, label))).getText();
    }

}
