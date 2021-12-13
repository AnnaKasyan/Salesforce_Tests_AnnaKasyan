package models;

import enums.ContactSalutation;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
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
    private String accountName;


    public Contact() {}

    public Contact(String firstName, String middleName, String lastName, String suffix, String title, String department, String email, String fax, String phone, String mobile, String mailingStreet, String mailingCity, String mailingStateProvince, String mailingZipPostalCode, String mailingCountry, ContactSalutation salutation, String accountName) {
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
        this.mailingCountry = mailingCountry;
        this.salutation = salutation;
        this.accountName = accountName;
    }
}
