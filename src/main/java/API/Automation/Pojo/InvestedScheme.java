package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class InvestedScheme {
    @Getter@Setter
    public static class Datum{
    public String holdingProfileId;
    public String schemeName;
    public String schemeCode;
    public String folio;
    public String goalName;
    public String goalId;
    public double units;
    public String unitsFormatted;
    public double currentAmount;
    public String currentAmountFormatted;
    public int investedAmount;
    public String investedAmountFormatted;
    public boolean invest;
    public String bankId;
    public String option;
    public String dividendOption;
    public SwitchOut switchOut;
    public Redemption redemption;
    public Stp stp;
    public Swp swp;
    public boolean instantRedemption;
    public boolean isLockIn;
}
    @Getter@Setter
    public static class Redemption{
        public boolean enabled;
        public double amount;
        public String amountFormatted;
        public double units;
        public String unitsFormatted;
        public int multiples;
        public double minimumAmount;
        public double minimumUnits;
        public String minimumAmountFormatted;
        public String minimumUnitsFormatted;
    }
    @Getter@Setter
    public static class Root{
        public int code;
        public String desc;
        public ArrayList<Object> errors;
        public boolean success;
        public String type;
        public String name;
        public ArrayList<Datum> data;
    }
    @Getter@Setter
    public static class Stp{
        public boolean enabled;
        public double amount;
        public String amountFormatted;
        public double units;
        public String unitsFormatted;
        public int multiples;
        public double minimumAmount;
        public double minimumUnits;
        public String minimumAmountFormatted;
        public String minimumUnitsFormatted;
    }
    @Getter@Setter
    public static class SwitchOut{
        public boolean enabled;
        public double amount;
        public String amountFormatted;
        public double units;
        public String unitsFormatted;
        public int multiples;
        public double minimumAmount;
        public double minimumUnits;
        public String minimumAmountFormatted;
        public String minimumUnitsFormatted;
    }
    @Getter@Setter
    public static class Swp{
        public boolean enabled;
        public double amount;
        public String amountFormatted;
        public double units;
        public String unitsFormatted;
        public int multiples;
        public double minimumAmount;
        public double minimumUnits;
        public String minimumAmountFormatted;
        public String minimumUnitsFormatted;
    }
}
