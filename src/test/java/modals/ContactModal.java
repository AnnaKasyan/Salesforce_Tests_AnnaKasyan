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
        log.info("input first name");
        write(MIDDLE_NAME, contact.getMiddleName());
        log.info("input middle name");
        write(LAST_NAME, contact.getLastName());
        log.info("input last name");
        write(SUFFIX, contact.getSuffix());
        log.info("input suffix");
        write(TITLE, contact.getTitle());
        log.info("input title");
        write(EMAIL, contact.getEmail());
        log.info("input email");
        write(PHONE, contact.getPhone());
        log.info("input phone number");
        write(MOBILE, contact.getMobile());
        log.info("input mobile phone number");
        write(DEPARTMENT, contact.getDepartment());
        log.info("input department");
        write(FAX, contact.getFax());
        log.info("input fax");
        write(MAILING_CITY, contact.getMailingCity());
        log.info("input mailing city");
        write(MAILING_STATE_PROVINCE, contact.getMailingStateProvince());
        log.info("input mailing state province");
        write(MAILING_ZIP_POSTAL_CODE, contact.getMailingZipPostalCode());
        log.info("input mailing zip/postal code");
        write(MAILING_COUNTRY, contact.getMailingCountry());
        log.info("input mailing country");
        write(MAILING_STREET, contact.getMailingStreet());
        log.info("input mailing street");
        new Dropdown(driver, "Salutation").selectOption(contact.getSalutation().getName());
        selectAccountName();
        return this;
    }

    public void write(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void selectAccountName() {
        Actions builder = new Actions(driver);
        builder.click(driver.findElement(ACCOUNT_NAME)).sendKeys(Keys.ENTER).build();
        log.info("select account name");
    }

    public ContactsPage clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        log.info("click save button");
        return new ContactsPage(driver);
    }
}
