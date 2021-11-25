package modals;

import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModal extends BaseModal {

    final String accountNameLocator = "//lightning-formatted-text[normalize-space()='%s']";
    final String websiteLocator = "//lightning-formatted-url[@data-output-element-id='output-field']//a[normalize-space()='%s']";
    final String phoneLocator = "//lightning-formatted-phone[@data-output-element-id='output-field']//a[contains(text(),'%s')]";
    final String employeesLocator = "//lightning-formatted-number[@data-output-element-id='output-field']";



    public AccountModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm() {
        new Input(driver, "Account Name").write("Anna");
        new Input(driver, "Website").write("my site");
        new Input(driver, "Phone").write("+3445813456");
        new Input(driver, "Employees").write("112");
        new Input(driver, "Billing City").write("Minsk");
        new Input(driver, "Billing State/Province").write("Minsk");
        new Input(driver, "Billing Zip/Postal Code").write("210420");
        new Input(driver, "Billing Country").write("Belarus");
        new Input(driver, "Shipping City").write("Minsk");
        new Input(driver, "Shipping State/Province").write("Minsk");
        new Input(driver, "Shipping Zip/Postal Code").write("210420");
        new Input(driver, "Shipping Country").write("Belarus");
    }

    public String getAccountName(String name) {
        return driver.findElement(By.xpath(String.format(accountNameLocator, name))).getText();
    }

    public String getWebsite(String website) {
        return driver.findElement(By.xpath(String.format(websiteLocator, website))).getText();
    }

    public String getPhone(String phoneNumber) {
        return driver.findElement(By.xpath(String.format(phoneLocator, phoneNumber))).getText();
    }

    public String getEmployees(String numberOfEmployees) {
        return driver.findElement(By.xpath(String.format(employeesLocator, numberOfEmployees))).getText();
    }
}
