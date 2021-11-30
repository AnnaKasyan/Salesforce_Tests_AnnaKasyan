package enums;

import elements.LightningFormattedElement;

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

    private String name;

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
        for (AccountType accountType : AccountType.values()) {
            if (accountType.getName().equals(type)) {
                return accountType;
            }
        }
        return null;
    }
}

