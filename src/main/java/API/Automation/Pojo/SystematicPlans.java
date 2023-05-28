package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class SystematicPlans {
    @Getter@Setter
    public static class Alert{
        public int amount;
        public String frequency;
        public Date startDate;
        public Date endDate;
    }
    @Getter@Setter
    public static class Data{
        public ArrayList<Sip> sips;
        public ArrayList<PortfolioSip> portfolioSips;
        public ArrayList<Object> extendedSips;
    }
    @Getter@Setter
    public static class Flexi{
        public String consumerCode;
        public int tenure;
        public int amount;
        public String frequency;
        public int maximumAmount;
        public int flexiAmount;
        public String expiresOn;
    }
    @Getter@Setter
    public static class Mandate{
        public String bankAccountNumber;
        public int limit;
        public String status;
        public String limitUnit;
        public String bankName;
        public String consumerCode;
        public Date expiresOn;
        public String type;
    }
    @Getter@Setter
    public static class PortfolioSip{
        public String portfolioId;
        public String portfolioName;
        public int sipDate;
        public String bankId;
        public String portfolioSipType;
        public int tenure;
        public int completedInstallments;
        public Date nextInstallmentOn;
        public int nextInstallmentAmount;
        public String nextInstallmentAmountFormatted;
        public String category;
        public int currentValue;
        public String currentValueFormatted;
        public int totalGain;
        public String totalGainFormatted;
        public RedemptionBank redemptionBank;
        public Mandate mandate;
        public String holdingProfileName;
        public String consumerCode;
        public String expireMessage;
        public String installmentSkippedMessage;
        public boolean skipped;
        public boolean expired;
        public boolean extended;
        public boolean perpetual;
        public int amount;
        public String frequency;
        public ArrayList<Scheme> schemes;
        public ArrayList<String> actions;
    }
    @Getter@Setter
    public static class RedemptionBank{
        public String bankAccountNumber;
        public String bankName;
    }
    @Getter@Setter
    public static class Regular{
        public String consumerCode;
        public int tenure;
        public int amount;
        public String frequency;
        public String expiresOn;
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
    public static class Scheme{
        public String code;
        public String name;
        public String folio;
        public String amcCode;
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
        public String dividendOption;
        public String sipType;
        public Alert alert;
        public String sipGroupType;
        public int tenure;
        public int completedInstallments;
        public int nextInstallmentAmount;
        public String nextInstallmentAmountFormatted;
        public String tag;
        public String description;
        public String category;
        public String subCategory;
        public boolean rated;
        public int ratings;
        public double currentValue;
        public String currentValueFormatted;
        public double totalGain;
        public String totalGainFormatted;
        public RedemptionBank redemptionBank;
        public Mandate mandate;
        public String holdingProfileName;
        public String expireMessage;
        public String installmentSkippedMessage;
        public boolean stepUpFlag;
        public boolean skipped;
        public boolean expired;
        public boolean extended;
        public boolean perpetual;
        public ArrayList<String> actions;
        public Regular regular;
        public Date nextInstallmentOn;
        public Stepup stepup;
        public Flexi flexi;
        public Vip vip;
        public String expiresOn;
    }
    @Getter@Setter
    public static class Vip{
        public int minimumAmount;
        public int maximumAmount;
        public int expectedReturn;
        public String minimumAmountFormatted;
        public String maximumAmountFormatted;

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
        public String expiresOn;
    }
}
