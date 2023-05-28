package API.Automation.Pojo.Transac_History;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter@Setter
public class History {

    public int code;
    public String desc;
    public ArrayList<Object> errors;
    public boolean success;
    public String type;
    public String name;
    public Data data;

    @Getter
    @Setter
    public static class Data {
        public Info info;
        public Transactions transactions;

    }

    @Getter
    @Setter
    public static class Info {
        public double totalInvestmentCost;
        public String totalInvestmentCostFormatted;
        public double totalRedemptionAmount;
        public String totalRedemptionAmountFormatted;
        public double totalDividendPayoutAmount;
        public String totalDividendPayoutAmountFormatted;
        public double totalDividendReinvestmentAmount;
        public String totalDividendReinvestmentAmountFormatted;

    }
@Getter@Setter
    public static class Transactions {
        public ArrayList<Content> content;
        public int page;
        public int totalPages;
        public int size;
        public int count;
        public boolean first;
        public boolean last;
    }
    @Getter@Setter
    public static class Content {

        public String schemeCode;
        public String schemeName;
        public Date navAsOn;
        public String folio;
        public String holdingProfileId;
        public String goalId;
        public Date transactionDate;
        public String transactionType;
        public double units;
        public String redemptionBank;
        public double nav;
        public String unitsFormatted;
        public double balanceUnits;
        public String balanceUnitsFormatted;
        public double tds;
        public double stt;
        public double amount;
        public String tdsFormatted;
        public String sttFormatted;
        public String amountFormatted;
        public double stampDuty;
        public String stampDutyFormatted;
        public int orderId;
    }
}

