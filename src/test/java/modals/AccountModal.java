package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AccountsPage;

@Log4j2
public class AccountModal extends BaseModal {

    final By SAVE_BUTTON = By.cssSelector("button[title='Save']");

    public AccountModal(WebDriver driver) {
        super(driver);
    }

    public AccountModal fillForm(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        log.info("input account name");
        new Input(driver, "Website").write(account.getWebsite());
        log.info("input website");
        new Input(driver, "Phone").write(account.getPhone());
        log.info("input phone");
        new Input(driver, "Employees").write(account.getEmployees());
        log.info("input employees");
        new Input(driver, "Billing City").write(account.getBillingCity());
        log.info("input billing city");
        new Input(driver, "Billing State/Province").write(account.getBillingStateProvince());
        log.info("input billing state/province");
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipPostalCode());
        log.info("input billing zip/postal code");
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        log.info("input billing country");
        new Input(driver, "Shipping City").write(account.getShippingCity());
        log.info("input shipping city");
        new Input(driver, "Shipping State/Province").write(account.getShippingStateProvince());
        log.info("input shipping state/province");
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZipPostalCode());
        log.info("input shipping zip/postal code");
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        log.info("input shipping country");
        new TextArea(driver, "Description").write(account.getDescription());
        log.info("input description");
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        log.info("input billing street");
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        log.info("input shipping street");
        new Dropdown(driver, "Type").selectOption(account.getType().getName());
        log.info("select type");
        new Dropdown(driver, "Industry").selectOption(account.getIndustry().getName());
        log.info("select industry");
        return this;
    }

    public AccountsPage clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        log.info("click save button");
        return new AccountsPage(driver);
    }

}
