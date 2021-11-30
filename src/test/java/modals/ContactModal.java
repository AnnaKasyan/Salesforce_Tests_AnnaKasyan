package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ContactsPage;

public class ContactModal extends BaseModal {

    final By SAVE_BUTTON = By.cssSelector("button[name='SaveEdit']");

    public ContactModal(WebDriver driver) {
        super(driver);
    }

    public ContactModal fillForm(Contact contact) {
        new Input(driver, "First Name").writeContactsFields(contact.getFirstName());
        new Input(driver, "Middle Name").writeContactsFields(contact.getMiddleName());
        new Input(driver, "Last Name").writeContactsFields(contact.getLastName());
        new Input(driver, "Suffix").writeContactsFields(contact.getSuffix());
        new Input(driver, "Title").writeContactsFields(contact.getTitle());
        new Input(driver, "Email").writeContactsFields(contact.getEmail());
        new Input(driver, "Phone").writeContactsFields(contact.getPhone());
        new Input(driver, "Mobile").writeContactsFields(contact.getMobile());
        new Input(driver, "Department").writeContactsFields(contact.getDepartment());
        new Input(driver, "Fax").writeContactsFields(contact.getFax());
        new Input(driver, "Mailing City").writeContactsFields(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").writeContactsFields(contact.getMailingStateProvince());
        new Input(driver, "Mailing Zip/Postal Code").writeContactsFields(contact.getMailingZipPostalCode());
        new Input(driver, "Mailing Country").writeContactsFields(contact.getMailingCountry());
        new TextArea(driver, "Mailing Street").writeContactsFields(contact.getMailingStreet());
        new Dropdown(driver, "Salutation").selectOption(contact.getSalutation().getName());
        //Account Name
        return this;
    }

    public ContactsPage clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        return new ContactsPage(driver);
    }
}
