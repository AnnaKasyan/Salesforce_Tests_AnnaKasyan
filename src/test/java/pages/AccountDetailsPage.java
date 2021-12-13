package pages;

import elements.LightningFormattedElement;
import enums.AccountIndustry;
import enums.AccountType;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountDetailsPage extends BasePage {

    public AccountDetailsPage(WebDriver driver) {
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

    public Account getAccountDetailsInfo() {
        Account account = new Account();
        account.setAccountName(new LightningFormattedElement(driver, "Account Name").getText());
        log.info("get text about account name");
        account.setType(AccountType.fromString(new LightningFormattedElement(driver, "Type")));
        log.info("get text about type");
        account.setWebsite(new LightningFormattedElement(driver, "Website").getText());
        log.info("get text about website");
        account.setDescription(new LightningFormattedElement(driver, "Description").getText());
        log.info("get text about description");
        account.setPhone(new LightningFormattedElement(driver, "Phone").getText());
        log.info("get text about phone");
        account.setIndustry(AccountIndustry.fromString(new LightningFormattedElement(driver, "Industry")));
        log.info("get text about industry");
        account.setEmployees(new LightningFormattedElement(driver, "Employees").getText());
        log.info("get text about employees");
        account.setBillingCountry(new LightningFormattedElement(driver, "Billing Country").getText());
        log.info("get text about billing country");
        account.setBillingStateProvince(new LightningFormattedElement(driver, "Billing State/Province").getText());
        log.info("get text about billing state/province");
        account.setBillingCity(new LightningFormattedElement(driver, "Billing City").getText());
        log.info("get text about billing city");
        account.setBillingStreet(new LightningFormattedElement(driver, "Billing Street").getText());
        log.info("get text about billing street");
        account.setBillingZipPostalCode(new LightningFormattedElement(driver, "Billing Zip/Postal Code").getText());
        log.info("get text about billing zip/postal code");
        account.setShippingCountry(new LightningFormattedElement(driver, "Shipping Country").getText());
        log.info("get text about shipping country");
        account.setShippingStateProvince(new LightningFormattedElement(driver, "Shipping State/Province").getText());
        log.info("get text about shipping state/province");
        account.setShippingCity(new LightningFormattedElement(driver, "Shipping City").getText());
        log.info("get text about shipping city");
        account.setShippingStreet(new LightningFormattedElement(driver, "Shipping Street").getText());
        log.info("get text about shipping street");
        account.setShippingZipPostalCode(new LightningFormattedElement(driver, "Shipping Zip/Postal Code").getText());
        log.info("get text about shipping zip/postal code");
        return account;
    }
}
