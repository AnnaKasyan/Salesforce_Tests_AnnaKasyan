package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    final static By NOTIFICATION_BUTTON = By.cssSelector(".headerButtonBody");
    final static By QUARTERLY_PERFORMANCE_DATE = By.cssSelector("[data-aura-class='uiOutputText']");
    final static By ACCOUNTS_MENU_LINK = By.cssSelector("a[title='Accounts']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isElementPresent(QUARTERLY_PERFORMANCE_DATE);
    }

    @Override
    public HomePage open() {
        driver.get(BASE_URL + "lightning/page/home");
        return this;
    }

    public AccountsPage clickAccountMenuLink() {
        driver.findElement(ACCOUNTS_MENU_LINK).click();
        return new AccountsPage(driver);
    }
}
