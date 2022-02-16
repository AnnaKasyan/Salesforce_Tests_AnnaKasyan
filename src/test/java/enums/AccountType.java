package enums;

import elements.LightningFormattedElement;
import lombok.extern.log4j.Log4j2;

@Log4j2
public enum AccountType {

    ANALYST("Analyst"),
    COMPETITOR("Competitor"),
    CUSTOMER("Customer"),
    INTEGRATOR("Integrator"),
    INVESTOR("Investor"),
    PARTNER("Partner"),
    PRESS("Press"),
    PROSPECT("Prospect"),
    RESELLER("Reseller"),
    OTHER("Other");

    private final String name;

    AccountType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.getName();
    }

    public static AccountType fromString(LightningFormattedElement type) {
        log.info("getting text about account type");
        for (AccountType accountType : AccountType.values()) {
            if (accountType.getName().equals(type)) {
                return accountType;
            }
        }
        return null;
    }
}

