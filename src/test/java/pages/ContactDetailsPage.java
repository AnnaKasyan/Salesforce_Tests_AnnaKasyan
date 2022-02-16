package pages;

import elements.LightningFormattedElement;
import enums.ContactSalutation;
import models.Contact;
import org.openqa.selenium.WebDriver;


public class ContactDetailsPage extends BasePage {

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    @Override
    public BasePage open() {
        return null;
    }

    public Contact getContactDetailInfo() {
        Contact contact = new Contact();
        contact.setFirstName(new LightningFormattedElement(driver, "First Name").getText());
        contact.setMiddleName(new LightningFormattedElement(driver, "Middle Name").getText());
        contact.setLastName(new LightningFormattedElement(driver, "Last Name").getText());
        contact.setSuffix(new LightningFormattedElement(driver, "Suffix").getText());
        contact.setTitle(new LightningFormattedElement(driver, "Title").getText());
        contact.setEmail(new LightningFormattedElement(driver, "Email").getText());
        contact.setPhone(new LightningFormattedElement(driver, "Phone").getText());
        contact.setMobile(new LightningFormattedElement(driver, "Mobile").getText());
        contact.setDepartment(new LightningFormattedElement(driver, "Department").getText());
        contact.setFax(new LightningFormattedElement(driver, "Fax").getText());
        contact.setMailingCity(new LightningFormattedElement(driver, "Mailing City").getText());
        contact.setMailingStateProvince(new LightningFormattedElement(driver, "Mailing State/Province").getText());
        contact.setMailingZipPostalCode(new LightningFormattedElement(driver, "Mailing Zip/Postal Code").getText());
        contact.setMailingCountry(new LightningFormattedElement(driver, "Mailing Country").getText());
        contact.setMailingStreet(new LightningFormattedElement(driver, "Mailing Street").getText());
        contact.setSalutation(ContactSalutation.fromString(new LightningFormattedElement(driver, "Salutation")));
        contact.setAccountName(new LightningFormattedElement(driver, "Account Name").getText());
        return contact;
    }
}
