package utils;

import com.github.javafaker.Faker;
import enums.AccountIndustry;
import enums.AccountType;
import enums.ContactSalutation;
import models.Account;
import models.Contact;

public class TestDataHelper {

    static Faker faker = new Faker();

    public static Account getTestAccountWithAllData() {
        Account testAccount = Account.builder()
                .accountName(faker.company().name())
                .type(AccountType.CUSTOMER)
                .website(faker.company().url())
                .description(faker.company().catchPhrase())
                .phone(String.valueOf(faker.phoneNumber()))
                .industry(AccountIndustry.FOOD_AND_BEVERAGE)
                .employees(String.valueOf(faker.number()))
                .billingCountry(faker.country().name())
                .billingStateProvince(faker.address().state())
                .billingCity(faker.address().city())
                .billingStreet(faker.address().streetAddress())
                .billingZipPostalCode(faker.address().zipCode())
                .shippingCountry(faker.country().name())
                .shippingStateProvince(faker.address().state())
                .shippingCity(faker.address().city())
                .shippingStreet(faker.address().streetAddress())
                .shippingZipPostalCode(faker.address().zipCode())
                .build();
        return testAccount;
    }

    public static Contact getTestContactWithAllData() {
        Contact testContact = Contact.builder()
                .salutation(ContactSalutation.DR)
                .firstName(faker.name().firstName())
                .middleName(faker.name().nameWithMiddle())
                .lastName(faker.name().lastName())
                .suffix(faker.company().suffix())
                .title(faker.name().title())
                .email(faker.internet().emailAddress())
                .phone(String.valueOf(faker.phoneNumber()))
                .mobile(String.valueOf(faker.phoneNumber()))
                .department(faker.commerce().department())
                .fax(String.valueOf(faker.phoneNumber()))
                .mailingStreet(faker.address().streetAddress())
                .mailingCity(faker.address().city())
                .mailingStateProvince(faker.address().state())
                .mailingZipPostalCode(faker.address().zipCode())
                .mailingCountry(faker.country().name())
                .build();
        return testContact;
    }
}
