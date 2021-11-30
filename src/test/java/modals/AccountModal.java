package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AccountsPage;

public class AccountModal extends BaseModal {

    final By SAVE_BUTTON = By.cssSelector("button[title='Save']");

    public AccountModal(WebDriver driver) {
        super(driver);
    }

    public AccountModal fillForm(Account account) {
        new Input(driver, "Account Name").writeAccountsFields(account.getAccountName());
        new Input(driver, "Website").writeAccountsFields(account.getWebsite());
        new Input(driver, "Phone").writeAccountsFields(account.getPhone());
        new Input(driver, "Employees").writeAccountsFields(account.getEmployees());
        new Input(driver, "Billing City").writeAccountsFields(account.getBillingCity());
        new Input(driver, "Billing State/Province").writeAccountsFields(account.getBillingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").writeAccountsFields(account.getBillingZipPostalCode());
        new Input(driver, "Billing Country").writeAccountsFields(account.getBillingCountry());
        new Input(driver, "Shipping City").writeAccountsFields(account.getShippingCity());
        new Input(driver, "Shipping State/Province").writeAccountsFields(account.getShippingStateProvince());
        new Input(driver, "Shipping Zip/Postal Code").writeAccountsFields(account.getShippingZipPostalCode());
        new Input(driver, "Shipping Country").writeAccountsFields(account.getShippingCountry());
        new TextArea(driver, "Description").writeAccountsFields(account.getDescription());
        new TextArea(driver, "Billing Street").writeAccountsFields(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").writeAccountsFields(account.getShippingStreet());
        new Dropdown(driver, "Type").selectOption(account.getType().getName());
        new Dropdown(driver, "Industry").selectOption(account.getIndustry().getName());
        return this;
    }

    public AccountsPage clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountsPage(driver);
    }

}
