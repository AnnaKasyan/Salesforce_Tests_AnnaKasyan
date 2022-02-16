package modals;

import elements.Dropdown;
import lombok.extern.log4j.Log4j2;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.ContactsPage;

@Log4j2
public class ContactModal extends BaseModal {

    final By SAVE_BUTTON = By.cssSelector("button[name='SaveEdit']");
    final By FIRST_NAME = By.name("firstName");
    final By MIDDLE_NAME = By.name("middleName");
    final By LAST_NAME = By.name("lastName");
    final By SUFFIX = By.name("suffix");
    final By TITLE = By.name("Title");
    final By EMAIL = By.name("Email");
    final By PHONE = By.name("Phone");
    final By MOBILE = By.name("MobilePhone");
    final By DEPARTMENT = By.name("Department");
    final By FAX = By.name("Fax");
    final By MAILING_CITY = By.name("city");
    final By MAILING_STATE_PROVINCE = By.name("province");
    final By MAILING_ZIP_POSTAL_CODE = By.name("postalCode");
    final By MAILING_COUNTRY = By.name("country");
    final By MAILING_STREET = By.xpath("//textarea[@name='street']");
    final By ACCOUNT_NAME = By.xpath("//label[text()= 'Account Name']/following::input[@placeholder='Search Accounts...']");


    public ContactModal(WebDriver driver) {
        super(driver);
    }

    public ContactModal fillForm(Contact contact) {

        write(FIRST_NAME, contact.getFirstName());
        write(MIDDLE_NAME, contact.getMiddleName());
        write(LAST_NAME, contact.getLastName());
        write(SUFFIX, contact.getSuffix());
        write(TITLE, contact.getTitle());
        write(EMAIL, contact.getEmail());
        write(PHONE, contact.getPhone());
        write(MOBILE, contact.getMobile());
        write(DEPARTMENT, contact.getDepartment());
        write(FAX, contact.getFax());
        write(MAILING_CITY, contact.getMailingCity());
        write(MAILING_STATE_PROVINCE, contact.getMailingStateProvince());
        write(MAILING_ZIP_POSTAL_CODE, contact.getMailingZipPostalCode());
        write(MAILING_COUNTRY, contact.getMailingCountry());
        write(MAILING_STREET, contact.getMailingStreet());
        new Dropdown(driver, "Salutation").selectOption(contact.getSalutation().getName());
        selectAccountName();
        return this;
    }

    public void write(By locator, String text) {
        log.info(String.format("setting %s into %s input", text, locator));
        driver.findElement(locator).sendKeys(text);
    }

    public void selectAccountName() {
        log.info("selecting account name");
        Actions builder = new Actions(driver);
        builder.click(driver.findElement(ACCOUNT_NAME)).sendKeys(Keys.ENTER).build();
    }

    public ContactsPage clickSaveButton() {
        log.info("clicking save button");
        driver.findElement(SAVE_BUTTON).click();
        return new ContactsPage(driver);
    }
}
