package tests;

import modals.AccountModal;
import models.Account;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.AccountsPage;
import utils.TestAccounts;

import static org.testng.Assert.assertEquals;

public class AccountsTest extends BaseTest {

    protected AccountsPage accountsPage;
    protected AccountDetailsPage accountDetailsPage;
    protected AccountModal accountModal;


    @BeforeMethod
    public void navigate() {
        loginPage.open().login(USERNAME, PASSWORD).isPageOpened();
        accountsPage = new AccountsPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        accountModal = new AccountModal(driver);
    }

    @Test
    public void createAccountWithAllData() {

        accountsPage.open()
                .clickNewButton()
                .fillForm(TestAccounts.testAccountWithAllData())
                .clickSaveButton()
                .messageAboutCreatedAccountOnDisplay();
        Account actualAccountDetailsInfo = accountsPage.openDetailsAccount()
                .getAccountDetailsInfo();
        assertEquals(actualAccountDetailsInfo, TestAccounts.testAccountWithAllData(), "The test account data must be equal to the data in the 'Details' section");
    }
}
