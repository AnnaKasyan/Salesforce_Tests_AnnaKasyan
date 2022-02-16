package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class Dropdown extends BaseElement {

    private final String dropdownLocator = "//span[text()='%s']/ancestor::div[contains(@class, 'uiInputSelect')]//a[@class= 'select']";
    private final String optionLocator = "//div[contains(@class, 'uiMenuList') and contains(@class, 'visible')]//a[contains(text(), '%s')]";

    public Dropdown(WebDriver driver, String label) {
        super(driver);
        this.label = label;
    }

    public void selectOption(String optionName) {
        log.info(String.format("selecting %s option %s",label, optionName));
        driver.findElement(By.xpath(String.format(dropdownLocator, label))).click();
        WebElement optionToClick = driver.findElement(By.xpath(String.format(optionLocator, optionName)));
        scrollIntoView(optionToClick);
        optionToClick.click();
    }
}
