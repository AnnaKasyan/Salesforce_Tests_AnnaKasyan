package enums;

import elements.LightningFormattedElement;

public enum ContactSalutation {

    MR("Mr."),
    MS("Ms."),
    MRS("Mrs."),
    DR("Dr."),
    PROF("Prof.");

    private String name;

    ContactSalutation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ContactSalutation fromString(LightningFormattedElement type) {
        for (ContactSalutation contactSalutation : ContactSalutation.values()) {
            if (contactSalutation.getName().equals(type)) {
                return contactSalutation;
            }
        }
        return null;
    }
}
