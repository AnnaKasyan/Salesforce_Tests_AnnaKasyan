package pages;

import modals.AccountModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {

    final By NEW_BUTTON = By.cssSelector("a[title='New']");
    final By SAVE_BUTTON = By.cssSelector("button[title='Save']");
    final By ACCOUNT_DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isElementPresent(NEW_BUTTON);
    }

    @Override
    public AccountsPage open() {
        driver.get(BASE_URL + "lightning/o/Account/list");
        return this;
    }

    public AccountModal clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
        return new AccountModal(driver);
    }

    public AccountsPage clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountsPage(driver);
    }

    public AccountsPage openDetailsAccount() {
        driver.findElement(ACCOUNT_DETAILS_TAB).click();
        return new AccountsPage(driver);
    }
}
