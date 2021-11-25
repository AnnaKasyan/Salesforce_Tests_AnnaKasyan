package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract  class BaseElement {
        WebDriver driver;
        WebDriverWait wait;

        public  BaseElement(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver, 10);
        }
}
