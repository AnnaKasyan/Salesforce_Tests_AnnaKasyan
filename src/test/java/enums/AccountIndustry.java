package enums;

import elements.LightningFormattedElement;

public enum AccountIndustry {

    AGRICULTURE("Agriculture"),
    APPAREL("Apparel"),
    BANKING("Banking"),
    BIOTECHNOLOGY("Biotechnology"),
    CHEMICALS("Chemicals"),
    COMMUNICATIONS("Communications"),
    CONSTRUCTION("Construction"),
    CONSULTING("Consulting"),
    EDUCATION("Education"),
    ELECTRONICS("Electronics"),
    ENERGY("Energy"),
    ENGINEERING("Engineering"),
    ENTERTAINMENT("Entertainment"),
    ENVIRONMENTAL("Environmental"),
    FINANCE("Finance"),
    FOOD_AND_BEVERAGE("Food & Beverage"),
    GOVERNMENT("Government"),
    HEALTHCARE("Healthcare"),
    HOSPITALITY("Hospitality"),
    INSURANCE("Insurance"),
    MACHINERY("Machinery"),
    MANUFACTURING("Manufacturing"),
    MEDIA("Media"),
    NOT_FOR_PROFIT("Not For Profit"),
    OTHER("Other"),
    RECREATION("Recreation"),
    RETAIL("Retail"),
    SHIPPING("Shipping"),
    TECHNOLOGY("Technology"),
    TELECOMMUNICATIONS("Telecommunications"),
    TRANSPORTATION("Transportation"),
    UTILITIES("Utilities");


    private String name;

    AccountIndustry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static AccountIndustry fromString(LightningFormattedElement industry) {
        for (AccountIndustry accountIndustry : AccountIndustry.values()) {
            if (accountIndustry.getName().equals(industry)) {
                return accountIndustry;
            }
        }
        return null;
    }
}
