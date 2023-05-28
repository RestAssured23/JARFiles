package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class PendingPayment {
    @Getter@Setter
    public static class Alert{
        public int amount;
        public String startDate;
        public String endDate;
        public String frequency;
    }
    @Getter@Setter
    public static class AlertSip{
        public String consumerCode;
        public int tenure;
        public int amount;
        public Date expiresOn;
        public String frequency;
        public String startDate;
        public String endDate;
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
        public String folioGroupId;
        public String bankId;
        public String option;
        public String dividendOption;
    }
    @Getter@Setter
    public static class Data{
        public ArrayList<Transaction> transactions;
        public ArrayList<AlertSip> alertSips;
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
    public static class Oti{
        public int totalAmount;
        public String investmentType;
        public ArrayList<Scheme> schemes;
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
        public String id;
        public String otpReferenceId;
        public String folioGroupId;
        public boolean payment;
        public String schemeName;
        public String amcCode;
        public String schemeCode;
        public String folio;
        public String bankId;
        public int amount;
        public String goalId;
        public String goalType;
        public String option;
        public String dividendOption;
        public String searchCode;
        public String investmentSubType;
        public int sipDate;
        public String sipType;
        public Regular regular;
        public Flexi flexi;
        public Stepup stepup;
        public Alert alert;
        public String code;
        public String name;
    }
    @Getter@Setter
    public static class Sip{
        public int totalAmount;
        public String investmentType;
        public String paymentId;
        public ArrayList<Scheme> schemes;
    }
    @Getter@Setter
    public static class Stepup{
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
    public static class Transaction{
        public String paymentId;
        public Oti oti;
        public Sip sip;
        public PortfolioSip portfolioSip;
        public String transactionStatus;
    }

}
