package tests;

import modals.ContactModal;
import models.Contact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ContactsPage;
import pages.HomePage;
import utils.TestContacts;

import static org.testng.Assert.assertEquals;

public class ContactsTest extends BaseTest {

    protected HomePage homePage;
    protected ContactsPage contactsPage;
    protected ContactModal contactModal;


    @BeforeMethod
    public void navigate() {
        loginPage.open().login(USERNAME, PASSWORD).isPageOpened();
        homePage = new HomePage(driver);
        contactsPage = new ContactsPage(driver);
        contactModal = new ContactModal(driver);
    }

    @Test
    public void createContact() {
        contactsPage.open()
                .clickNewButton()
                .fillForm(TestContacts.testContactWithAllData())
                .clickSaveButton();
        Contact actualContactDetailsInfo = contactsPage.openDetailsAccount()
                .getContactDetailInfo();
        assertEquals(actualContactDetailsInfo, TestContacts.testContactWithAllData());
    }
}
