package tests;

import modals.AccountModal;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.HomePage;

public class AccountsTest extends BaseTest {

    protected HomePage homePage;
    protected AccountsPage accountsPage;
    protected AccountModal accountModal;


    @BeforeMethod
    public void navigate() {
        loginPage.open().login(USERNAME, PASSWORD).isPageOpened();
        homePage = new HomePage(driver);
        accountsPage = new AccountsPage(driver);
        accountModal = new AccountModal(driver);
    }

    @Test
    public void addAccount() {
        accountsPage.open()
                .clickNewButton()
                .fillForm();
        accountsPage.clickSaveButton()
                .openDetailsAccount();
        Assert.assertEquals(accountModal.getAccountName("Anna"), "Anna");
        Assert.assertEquals(accountModal.getWebsite("my site"), "my site");
        Assert.assertEquals(accountModal.getPhone("+3445813456"), "+3445813456");
        Assert.assertEquals(accountModal.getEmployees("112"), "112");
    }
}
