package pages;

import lombok.extern.log4j.Log4j2;
import modals.AccountModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
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
        log.info("click new button");
        return new AccountModal(driver);
    }

    public AccountDetailsPage openDetailsAccount() {
        driver.findElement(DETAILS_TAB).click();
        log.info("click open details account");
        return new AccountDetailsPage(driver);
    }

    public AccountsPage messageAboutCreatedAccountOnDisplay() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-aura-class='forceToastMessage']")));
        log.info("wait message about created account on display");
        return new AccountsPage(driver);
    }
}
