package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    final static By EMAIL_INOUT = By.id("username");
    final static By PASSWORD_INOUT = By.id("password");
    private static final By LOGIN_BUTTON = By.id("Login");
    private static final By REMEMBER_BUTTON = By.name("rememberUn");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    @Override
    public LoginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public HomePage login(String email, String password) {
        driver.findElement(EMAIL_INOUT).sendKeys(email);
        driver.findElement(PASSWORD_INOUT).sendKeys(password);
        driver.findElement(REMEMBER_BUTTON).click();
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }
}
