package models;

import enums.AccountIndustry;
import enums.AccountType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {

    private String accountName;
    private String website;
    private String phone;
    private String description;
    private String employees;
    private String billingStreet;
    private String billingCity;
    private String billingStateProvince;
    private String billingZipPostalCode;
    private String billingCountry;
    private String shippingStreet;
    private String shippingCity;
    private String shippingStateProvince;
    private String shippingZipPostalCode;
    private String shippingCountry;
    private AccountType type;
    private AccountIndustry industry;


    public Account() {}

    public Account(String accountName, String website, String phone, String description, String employees, String billingStreet, String billingCity, String billingStateProvince, String billingZipPostalCode, String billingCountry, String shippingStreet, String shippingCity, String shippingStateProvince, String shippingZipPostalCode, String shippingCountry, AccountType type, AccountIndustry industry) {
        this.accountName = accountName;
        this.website = website;
        this.phone = phone;
        this.description = description;
        this.employees = employees;
        this.billingStreet = billingStreet;
        this.billingCity = billingCity;
        this.billingStateProvince = billingStateProvince;
        this.billingZipPostalCode = billingZipPostalCode;
        this.billingCountry = billingCountry;
        this.shippingStreet = shippingStreet;
        this.shippingCity = shippingCity;
        this.shippingStateProvince = shippingStateProvince;
        this.shippingZipPostalCode = shippingZipPostalCode;
        this.shippingCountry = shippingCountry;
        this.type = type;
        this.industry = industry;
    }

}
