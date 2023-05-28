package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class CurrentSIP {
    @Getter@Setter
    public static class Data{
        public ArrayList<Sip> sips;
        public ArrayList<Object> portfolioSips;

    }
    @Getter@Setter
    public static class Flexi{
        public String consumerCode;
        public int tenure;
        public int amount;
        public String frequency;
        public int maximumAmount;
        public int flexiAmount;
        public Date expiresOn;
    }
    @Getter@Setter
    public static class Regular{
        public String consumerCode;
        public int tenure;
        public int amount;
        public String frequency;
        public Date expiresOn;
    }
    @Getter@Setter
    public static class Root{
        public int code;
        public String desc;
        public ArrayList<Object> errors;
        public boolean success;
        public String type;
        public String name;
        public Data data;
    }
    @Getter@Setter
    public static class Sip{
        public boolean payment;
        public String schemeName;
        public String schemeCode;
        public String amcCode;
        public String folio;
        public double units;
        public String unitsFormatted;
        public String goalId;
        public String goalName;
        public int sipDate;
        public String referenceId;
        public String bankId;
        public String option;
        public String sipType;
        public Regular regular;
        public String sipGroupType;
        public int tenure;
        public int completedInstallments;
        public Date nextInstallmentOn;
        public int nextInstallmentAmount;
        public String nextInstallmentAmountFormatted;
        public String tag;
        public String description;
        public String category;
        public String subCategory;
        public double currentValue;
        public String currentValueFormatted;
        public double totalGain;
        public String totalGainFormatted;
        public boolean stepUpFlag;
        public String bankName;
        public String bankAccountNumber;
        public String holdingProfileName;
        public String consumerCode;
        public String expireMessage;
        public String installmentSkippedMessage;
        public boolean skipped;
        public boolean expired;
        public boolean extended;
        public boolean perpetual;
        public ArrayList<String> actions;
        public String folioGroupId;
        public boolean modified;
        public String dividendOption;
        public Alert alert;
        public Flexi flexi;
        public Stepup stepup;
    }
    @Getter@Setter
    public static class Stepup{
        public String consumerCode;
        public int tenure;
        public int amount;
        public String frequency;
        public String stepupFrequency;
        public int stepupAmount;
        public int finalAmount;
        public Date expiresOn;
    }
    @Getter@Setter
    public static class Alert{
        public int amount;
        public String frequency;
        public String endDate;
        public String startDate;
    }
}
