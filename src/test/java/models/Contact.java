package models;


import enums.ContactSalutation;

import java.util.Objects;

public class Contact {

    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String title;
    private String department;
    private String email;
    private String fax;
    private String phone;
    private String mobile;
    private String mailingStreet;
    private String mailingCity;
    private String mailingStateProvince;
    private String mailingZipPostalCode;
    private String mailingCountry;
    private ContactSalutation salutation;
    //Account Name


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) && Objects.equals(middleName, contact.middleName) && Objects.equals(lastName, contact.lastName) && Objects.equals(suffix, contact.suffix) && Objects.equals(title, contact.title) && Objects.equals(department, contact.department) && Objects.equals(email, contact.email) && Objects.equals(fax, contact.fax) && Objects.equals(phone, contact.phone) && Objects.equals(mobile, contact.mobile) && Objects.equals(mailingStreet, contact.mailingStreet) && Objects.equals(mailingCity, contact.mailingCity) && Objects.equals(mailingStateProvince, contact.mailingStateProvince) && Objects.equals(mailingZipPostalCode, contact.mailingZipPostalCode) && Objects.equals(mailingCountry, contact.mailingCountry) && salutation == contact.salutation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, suffix, title, department, email, fax, phone, mobile, mailingStreet, mailingCity, mailingStateProvince, mailingZipPostalCode, mailingCountry, salutation);
    }

    public Contact() {

    }

    public Contact(String firstName, String middleName, String lastName, String suffix, String title, String department, String email, String fax, String phone, String mobile, String mailingStreet, String mailingCity, String mailingStateProvince, String mailingZipPostalCode, String country, ContactSalutation salutation) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.title = title;
        this.department = department;
        this.email = email;
        this.fax = fax;
        this.phone = phone;
        this.mobile = mobile;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingStateProvince = mailingStateProvince;
        this.mailingZipPostalCode = mailingZipPostalCode;
        this.mailingCountry = country;
        this.salutation = salutation;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingStateProvince() {
        return mailingStateProvince;
    }

    public void setMailingStateProvince(String mailingStateProvince) {
        this.mailingStateProvince = mailingStateProvince;
    }

    public String getMailingZipPostalCode() {
        return mailingZipPostalCode;
    }

    public void setMailingZipPostalCode(String mailingZipPostalCode) {
        this.mailingZipPostalCode = mailingZipPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public ContactSalutation getSalutation() {
        return salutation;
    }

    public void setSalutation(ContactSalutation salutation) {
        this.salutation = salutation;
    }
}
