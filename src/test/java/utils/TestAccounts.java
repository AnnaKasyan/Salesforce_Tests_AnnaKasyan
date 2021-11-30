package utils;

import enums.AccountIndustry;
import enums.AccountType;
import models.Account;
import models.AccountBuilder;

public class TestAccounts {

    public static Account testAccountWithAllData() {
        Account testAccount = new AccountBuilder()
                .withAccountName("My Account")
                .withType(AccountType.CUSTOMER)
                .withWebsite("website")
                .withDescription("First account")
                .withPhone("+34455445544")
                .withIndustry(AccountIndustry.FOOD_AND_BEVERAGE)
                .withEmployees("15")
                .withBillingCountry("Belarus")
                .withBillingStateProvince("Minsk")
                .withBillingCity("Minsk")
                .withBillingStreet("Sverdlova, 35")
                .withBillingZipPostalCode("220400")
                .withShippingCountry("Belarus")
                .withShippingStateProvince("Minsk")
                .withShippingCity("Minsk")
                .withShippingStreet("Sverdlova, 35")
                .withShippingZipPostalCode("220400")
                .build();
        return testAccount;
    }
}
