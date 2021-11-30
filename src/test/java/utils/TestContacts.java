package utils;


import enums.ContactSalutation;
import models.Contact;
import models.ContactBuilder;

public class TestContacts {

    public static Contact testContactWithAllData() {
        Contact testContact = new ContactBuilder()
                .withContactSalutation(ContactSalutation.DR)
                .withContactFirstName("Ivan")
                .withContactMiddleName("Ivanovich")
                .withContactLastName("Ivanov")
                .withContactSuffix("First contact")
                .withContactTitle("First contact")
                .withContactEmail("email.com")
                .withContactPhone("824462456")
                .withContactMobile("+3754126641565")
                .withContactDepartment("emergency department")
                .withContactFax("511566146")
                .withContactMailingStreet("Brovki, 15")
                .withContactMailingCity("Minsk")
                .withContactMailingStateProvince("Minsk")
                .withContactMailingZipPostalCode("420020")
                .withContactMailingCountry("Belarus")
                .build();
        return testContact;
    }
}
