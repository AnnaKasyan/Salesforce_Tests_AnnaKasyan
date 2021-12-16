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
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipPostalCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingStateProvince());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZipPostalCode());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Dropdown(driver, "Type").selectOption(account.getType().getName());
        new Dropdown(driver, "Industry").selectOption(account.getIndustry().getName());
        return this;
    }

    public AccountsPage clickSaveButton() {
        log.info("clicking save button");
        driver.findElement(SAVE_BUTTON).click();
        return new AccountsPage(driver);
    }

}
