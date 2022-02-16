package enums;

import elements.LightningFormattedElement;
import lombok.extern.log4j.Log4j2;

@Log4j2
public enum ContactSalutation {

    MR("Mr."),
    MS("Ms."),
    MRS("Mrs."),
    DR("Dr."),
    PROF("Prof.");

    private final String name;

    ContactSalutation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ContactSalutation fromString(LightningFormattedElement type) {
        log.info("getting text about contact salutation");
        for (ContactSalutation contactSalutation : ContactSalutation.values()) {
            if (contactSalutation.getName().equals(type)) {
                return contactSalutation;
            }
        }
        return null;
    }
}
