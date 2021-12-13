package pages;

import lombok.extern.log4j.Log4j2;
import modals.ContactModal;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ContactsPage extends BasePage {

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isElementPresent(NEW_BUTTON);
    }

    @Override
    public ContactsPage open() {
        driver.get(BASE_URL + "lightning/o/Contact/home");
        return this;
    }

    public ContactModal clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
        log.info("click new button");
        return new ContactModal(driver);
    }

    public ContactDetailsPage openDetailsContact() {
        driver.findElement(DETAILS_TAB).click();
        log.info("click open details contact");
        return new ContactDetailsPage(driver);
    }
}
