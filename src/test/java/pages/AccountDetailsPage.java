package pages;

import elements.LightningFormattedElement;
import enums.AccountIndustry;
import enums.AccountType;
import models.Account;
import org.openqa.selenium.WebDriver;

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
        account.setType(AccountType.fromString(new LightningFormattedElement(driver, "Type")));
        account.setWebsite(new LightningFormattedElement(driver, "Website").getText());
        account.setDescription(new LightningFormattedElement(driver, "Description").getText());
        account.setPhone(new LightningFormattedElement(driver, "Phone").getText());
        account.setIndustry(AccountIndustry.fromString(new LightningFormattedElement(driver, "Industry")));
        account.setEmployees(new LightningFormattedElement(driver, "Employees").getText());
        account.setBillingCountry(new LightningFormattedElement(driver, "Billing Country").getText());
        account.setBillingStateProvince(new LightningFormattedElement(driver, "Billing State/Province").getText());
        account.setBillingCity(new LightningFormattedElement(driver, "Billing City").getText());
        account.setBillingStreet(new LightningFormattedElement(driver, "Billing Street").getText());
        account.setBillingZipPostalCode(new LightningFormattedElement(driver, "Billing Zip/Postal Code").getText());
        account.setShippingCountry(new LightningFormattedElement(driver, "Shipping Country").getText());
        account.setShippingStateProvince(new LightningFormattedElement(driver, "Shipping State/Province").getText());
        account.setShippingCity(new LightningFormattedElement(driver, "Shipping State/Province").getText());
        account.setShippingStreet(new LightningFormattedElement(driver, "Shipping State/Province").getText());
        account.setShippingZipPostalCode(new LightningFormattedElement(driver, "Shipping State/Province").getText());
        return account;
    }
}
