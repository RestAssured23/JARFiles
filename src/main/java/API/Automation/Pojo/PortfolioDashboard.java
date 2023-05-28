package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class PortfolioDashboard {
    @Getter@Setter
    public static class Content{
        public String amcCode;
        public boolean online;
        public boolean sip;
        public String schemeCode;
        public String schemeName;
        public String navAsOn;
        public String folio;
        public String holdingProfileId;
        public double units;
        public String redemptionBank;
        public String redemptionBankName;
        public double amount;
        public double nav;
        public double investmentCost;
        public String investmentCostFormatted;
        public double gains;
        public double gainPercentage;
        public String gainPercentageFormatted;
        public String gainsFormatted;
        public String annualizedReturnsFormatted;
        public int annualizedReturns;
        public String category;
        public String subCategory;
        public double percentage;
        public ArrayList<String> actions;
        public double navChange;
        public double navChangePercentage;
        public int rating;
        public boolean rated;
        public boolean navDelay;
        public String mobile;
        public String email;
        public ArrayList<Object> tags;
        public double investmentAverageCost;
        public String investmentAverageCostFormatted;
        public double currentAverageCost;
        public String currentAverageCostFormatted;
    }
    @Getter@Setter
    public static class Datum{
        public String id;
        public String name;
        public String type;
        public ArrayList<Content> contents;
        public int orderId;
        public String annualReturns;
        public ArrayList<String> actions;
        public double redeemedAmount;
        public double currentValueOfInvestment;
        public double investedAmount;
        public String currentValueOfInvestmentFormatted;
        public String investedAmountFormatted;
        public double gainAmount;
        public String gainAmountFormatted;
        public double gainPercentage;
        public double changeAmount;
        public String changeAmountFormatted;
        public String changePercentage;
        public double averageCost;
        public String averageCostFormatted;
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
}
