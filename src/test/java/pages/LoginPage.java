package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage {

    final static By EMAIL_INOUT = By.id("username");
    final static By PASSWORD_INOUT = By.id("password");
    private static final By LOGIN_BUTTON = By.id("Login");


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
        log.info("input email");
        driver.findElement(PASSWORD_INOUT).sendKeys(password);
        log.info("input password");
        driver.findElement(LOGIN_BUTTON).click();
        log.info("click login button");
        return new HomePage(driver);
    }
}
