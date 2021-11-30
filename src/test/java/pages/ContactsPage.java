package pages;

import modals.ContactModal;
import org.openqa.selenium.WebDriver;

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
        return new ContactModal(driver);
    }

    public ContactDetailsPage openDetailsAccount() {
        driver.findElement(DETAILS_TAB).click();
        return new ContactDetailsPage(driver);
    }
}
