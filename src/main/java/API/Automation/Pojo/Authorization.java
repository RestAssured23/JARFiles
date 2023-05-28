package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class Authorization {
    @Getter@Setter
    public static class Alert{
        public int amount;
        public String startDate;
        public String endDate;
        public String frequency;
    }
    @Getter@Setter
    public static class Data{
        public ArrayList<Sip> sips;
        public ArrayList<PortfolioSip> portfolioSips;
        public ArrayList<Swp> swps;
        public ArrayList<Stp> stps;
        public ArrayList<Switch> switches;
        public ArrayList<Redemption> redemptions;
    }
    @Getter@Setter
    public static class Error{
        public int productId;
        public String id;
        public String field;
        public int code;
        public String desc;
        public String type;
    }
    @Getter@Setter
    public static class ExtendedPendingAuthorization{
        public boolean status;
        public String message;
    }
    @Getter@Setter
    public static class Flexi{
        public int tenure;
        public int maximumAmount;
        public String consumerCode;
        public int flexiAmount;
        public int amount;
        public Date expiresOn;
        public String frequency;
    }
    @Getter@Setter
    public static class Isip{
        public String urnCode;
        public int amount;
        public String startDate;
        public String endDate;
        public String status;
        public String bank;
        public String bankAccountNo;
        public String frequency;
    }
    @Getter@Setter
    public static class PortfolioSip{
        public String portfolioId;
        public String portfolioName;
        public int sipDate;
        public String bankId;
        public String portfolioSipType;
        public String referenceId;
        public int tenure;
        public int completedInstallments;
        public String nextInstallmentOn;
        public int nextInstallmentAmount;
        public String nextInstallmentAmountFormatted;
        public Date expiresOn;
        public String category;
        public int currentValue;
        public String currentValueFormatted;
        public int totalGain;
        public String totalGainFormatted;
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
        public String extendedMessage;
        public int amount;
        public String frequency;
        public ArrayList<Scheme> schemes;
        public ArrayList<String> actions;
    }
    @Getter@Setter
    public static class Redemption{
        public String holdingProfileId;
        public String id;
        public String folio;
        public String goalId;
        public String goalName;
        public String amcCode;
        public String schemeCode;
        public String schemeName;
        public Date date;
        public int amount;
        public int units;
        public String amountFormatted;
        public String unitsFormatted;
        public String redemptionMode;
        public String dividendOption;
        public String option;
        public String bankId;
        public String redemptionType;
        public ArrayList<String> actions;
    }
    @Getter@Setter
    public static class Regular{
        public String consumerCode;
        public int tenure;
        public int amount;
        public Date expiresOn;
        public String frequency;
    }
    @Getter@Setter
    public static class Root{
        public int code;
        public String desc;
        public boolean success;
        public ArrayList<Error> errors;
        public String type;
        public Data data;
        public String name;
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
        public int units;
        public String unitsFormatted;
        public String goalId;
        public String goalName;
        public int sipDate;
        public String referenceId;
        public String otpReferenceId;
        public String folioGroupId;
        public String bankId;
        public String option;
        public String dividendOption;
        public String sipType;
        public Regular regular;
        public Flexi flexi;
        public Stepup stepup;
        public Alert alert;
        public Isip isip;
        public String sipGroupType;
        public int tenure;
        public int completedInstallments;
        public Date nextInstallmentOn;
        public int nextInstallmentAmount;
        public String nextInstallmentAmountFormatted;
        public String tag;
        public String description;
        public String category;
        public int currentValue;
        public String currentValueFormatted;
        public int totalGain;
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
        public ExtendedPendingAuthorization extendedPendingAuthorization;
        public boolean modified;
        public boolean perpetual;
        public String extendedMessage;
        public ArrayList<String> actions;
        public String subCategory;
    }

    public class Stepup{
        public int amount;
        public int tenure;
        public String stepupFrequency;
        public int stepupAmount;
        public int finalAmount;
        public String consumerCode;
        public Date expiresOn;
        public String frequency;
    }
    @Getter@Setter
    public static class Stp{
        public String referenceId;
        public String schemeCode;
        public String schemeName;
        public String folio;
        public String goalId;
        public String goalName;
        public int units;
        public String unitsFormatted;
        public int amount;
        public String amountFormatted;
        public String frequency;
        public String initialInvestmentFormatted;
        public int initialInvestment;
        public String dividendOption;
        public String dayOrDate;
        public int completedInstallments;
        public int noOfInstallments;
        public Date nextInstallmentOn;
        public String toSchemeCode;
        public String toSchemeName;
        public String toCategory;
        public String toAmcCode;
        public String category;
        public String amcCode;
        public int totalStpAmount;
        public String totalStpAmountFormatted;
        public String stpType;
        public String stpId;
        public int currentValue;
        public int minimumAmount;
        public int maximumAmount;
        public int nominalAmount;
        public int expectedReturn;
        public ArrayList<String> actions;
        public String subCategory;
        public String toSubCategory;
        public Date startDate;
        public Date endDate;
    }
    @Getter@Setter
    public static class Switch{
        public String holdingProfileId;
        public String id;
        public String folio;
        public String goalId;
        public String goalName;
        public String fromSchemeCode;
        public String toSchemeCode;
        public String toSchemeName;
        public String fromSchemeName;
        public int amount;
        public int units;
        public String unitsFormatted;
        public String monthlyAmountFormatted;
        public String fromDividendOption;
        public String fromOption;
        public String toDividendOption;
        public String toOption;
        public String switchDate;
        public String switchType;
        public String switchMode;
        public String bankId;
        public ArrayList<String> actions;
        public String toAmcCode;
        public String fromAmcCode;
    }
    @Getter@Setter
    public static class Swp{
        public String swpId;
        public String schemeCode;
        public String amcCode;
        public String folio;
        public String schemeName;
        public String dayOrDate;
        public String holdingProfileId;
        public String holdingProfileName;
        public int paidInstallments;
        public int numberOfInstallments;
        public Date nextInstallmentOn;
        public int amount;
        public String amountFormatted;
        public String category;
        public String frequency;
        public ArrayList<String> swpAction;
        public String subCategory;
        public Date startDate;
        public Date endDate;
    }

}
