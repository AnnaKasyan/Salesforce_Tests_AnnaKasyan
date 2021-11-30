package models;

import enums.ContactSalutation;

public class ContactBuilder {

    private Contact contact = new Contact();

    public ContactBuilder withContactSalutation(ContactSalutation salutation) {
        contact.setSalutation(salutation);
        return this;
    }

    public ContactBuilder withContactFirstName(String firstName) {
        contact.setFirstName(firstName);
        return this;
    }

    public ContactBuilder withContactMiddleName(String middleName) {
        contact.setMiddleName(middleName);
        return this;
    }

    public ContactBuilder withContactLastName(String lastName) {
        contact.setLastName(lastName);
        return this;
    }

    public ContactBuilder withContactSuffix(String suffix) {
        contact.setSuffix(suffix);
        return this;
    }

    public ContactBuilder withContactTitle(String title) {
        contact.setTitle(title);
        return this;
    }

    public ContactBuilder withContactEmail(String email) {
        contact.setEmail(email);
        return this;
    }

    public ContactBuilder withContactPhone(String phone) {
        contact.setPhone(phone);
        return this;
    }

    public ContactBuilder withContactMobile(String mobile) {
        contact.setMobile(mobile);
        return this;
    }

    public ContactBuilder withContactDepartment(String department) {
        contact.setDepartment(department);
        return this;
    }

    public ContactBuilder withContactFax(String fax) {
        contact.setFax(fax);
        return this;
    }

    public ContactBuilder withContactMailingCity(String mailingCity) {
        contact.setMailingCity(mailingCity);
        return this;
    }

    public ContactBuilder withContactMailingStreet(String mailingStreet) {
        contact.setMailingStreet(mailingStreet);
        return this;
    }

    public ContactBuilder withContactMailingStateProvince(String mailingStateProvince) {
        contact.setMailingStateProvince(mailingStateProvince);
        return this;
    }

    public ContactBuilder withContactMailingZipPostalCode(String mailingZipPostalCode) {
        contact.setMailingZipPostalCode(mailingZipPostalCode);
        return this;
    }

    public ContactBuilder withContactMailingCountry(String mailingCountry) {
        contact.setMailingCountry(mailingCountry);
        return this;
    }

    public Contact build() {
        return this.contact;
    }
}
