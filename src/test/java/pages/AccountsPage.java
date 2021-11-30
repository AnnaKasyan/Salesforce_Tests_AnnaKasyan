package pages;

import modals.AccountModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsPage extends BasePage {

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

    public AccountDetailsPage openDetailsAccount() {
        driver.findElement(DETAILS_TAB).click();
        return new AccountDetailsPage(driver);
    }

    public AccountsPage messageAboutCreatedAccountOnDisplay() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-aura-class='forceToastMessage']")));
        return new AccountsPage(driver);
    }
}
