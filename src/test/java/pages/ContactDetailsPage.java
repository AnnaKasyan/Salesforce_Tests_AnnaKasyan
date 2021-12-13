package pages;

import elements.LightningFormattedElement;
import enums.ContactSalutation;
import lombok.extern.log4j.Log4j2;
import models.Contact;
import org.openqa.selenium.WebDriver;

@Log4j2
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
        log.info("get text about first name");
        contact.setMiddleName(new LightningFormattedElement(driver, "Middle Name").getText());
        log.info("get text about middle name");
        contact.setLastName(new LightningFormattedElement(driver, "Last Name").getText());
        log.info("get text about last name");
        contact.setSuffix(new LightningFormattedElement(driver, "Suffix").getText());
        log.info("get text about suffix");
        contact.setTitle(new LightningFormattedElement(driver, "Title").getText());
        log.info("get text about title");
        contact.setEmail(new LightningFormattedElement(driver, "Email").getText());
        log.info("get text about email");
        contact.setPhone(new LightningFormattedElement(driver, "Phone").getText());
        log.info("get text about phone");
        contact.setMobile(new LightningFormattedElement(driver, "Mobile").getText());
        log.info("get text about mobile");
        contact.setDepartment(new LightningFormattedElement(driver, "Department").getText());
        log.info("get text about department");
        contact.setFax(new LightningFormattedElement(driver, "Fax").getText());
        log.info("get text about fax");
        contact.setMailingCity(new LightningFormattedElement(driver, "Mailing City").getText());
        log.info("get text about mailing city");
        contact.setMailingStateProvince(new LightningFormattedElement(driver, "Mailing State/Province").getText());
        log.info("get text about mailing state/province");
        contact.setMailingZipPostalCode(new LightningFormattedElement(driver, "Mailing Zip/Postal Code").getText());
        log.info("get text about mailing zip/postal code");
        contact.setMailingCountry(new LightningFormattedElement(driver, "Mailing Country").getText());
        log.info("get text about mailing country");
        contact.setMailingStreet(new LightningFormattedElement(driver, "Mailing Street").getText());
        log.info("get text about mailing street");
        contact.setSalutation(ContactSalutation.fromString(new LightningFormattedElement(driver, "Salutation")));
        log.info("get text about salutation");
        contact.setAccountName(new LightningFormattedElement(driver, "Account Name").getText());
        log.info("get text about account name");
        return contact;
    }
}
