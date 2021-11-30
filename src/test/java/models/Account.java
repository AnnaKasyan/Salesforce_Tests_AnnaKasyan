package models;

import enums.AccountIndustry;
import enums.AccountType;

import java.util.Objects;

public class Account {

    private String accountName;
    private String website;
    private String phone;
    private String description;
    private String employees;
    private String billingStreet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountName, account.accountName) && Objects.equals(website, account.website) && Objects.equals(phone, account.phone) && Objects.equals(description, account.description) && Objects.equals(employees, account.employees) && Objects.equals(billingStreet, account.billingStreet) && Objects.equals(billingCity, account.billingCity) && Objects.equals(billingStateProvince, account.billingStateProvince) && Objects.equals(billingZipPostalCode, account.billingZipPostalCode) && Objects.equals(billingCountry, account.billingCountry) && Objects.equals(shippingStreet, account.shippingStreet) && Objects.equals(shippingCity, account.shippingCity) && Objects.equals(shippingStateProvince, account.shippingStateProvince) && Objects.equals(shippingZipPostalCode, account.shippingZipPostalCode) && Objects.equals(shippingCountry, account.shippingCountry) && type == account.type && industry == account.industry;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, website, phone, description, employees, billingStreet, billingCity, billingStateProvince, billingZipPostalCode, billingCountry, shippingStreet, shippingCity, shippingStateProvince, shippingZipPostalCode, shippingCountry, type, industry);
    }

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

    public Account() {
    }

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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingStateProvince() {
        return billingStateProvince;
    }

    public void setBillingStateProvince(String billingStateProvince) {
        this.billingStateProvince = billingStateProvince;
    }

    public String getBillingZipPostalCode() {
        return billingZipPostalCode;
    }

    public void setBillingZipPostalCode(String billingZipPostalCode) {
        this.billingZipPostalCode = billingZipPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingStateProvince() {
        return shippingStateProvince;
    }

    public void setShippingStateProvince(String shippingStateProvince) {
        this.shippingStateProvince = shippingStateProvince;
    }

    public String getShippingZipPostalCode() {
        return shippingZipPostalCode;
    }

    public void setShippingZipPostalCode(String shippingZipPostalCode) {
        this.shippingZipPostalCode = shippingZipPostalCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountIndustry getIndustry() {
        return industry;
    }

    public void setIndustry(AccountIndustry industry) {
        this.industry = industry;
    }

}
