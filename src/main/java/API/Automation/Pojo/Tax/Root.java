package API.Automation.Pojo.Tax;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter@Setter
public class Root {
    public int code;
    public String desc;
    public ArrayList<Object> errors;
    public boolean success;
    public String type;
    public String name;
    public ArrayList<Datum> data;

    @Getter
    @Setter
    public static class Datum {
        public CategoryTax categoryTax;
        public ArrayList<Scheme> schemes;
    }

    @Getter
    @Setter
    public static class CategoryTax {
        public String asset;
        public double investmentCost;
        public double redemptionCost;
        public double shortTermGain;
        public int longTermGain;
    }

    @Getter
    @Setter
    public static class Scheme {

        public int amcCode;
        public String folio;
        public String schemeCode;
        public String schemeName;
        public double investmentCost;
        public double redemptionCost;
        public double shortTermGain;
        public int longTermGain;
        public String category;
        public String subCategory;
        public int rating;
        public boolean rated;
        public String assetType;
        public ArrayList<Transaction> transactions;
    }

    @Getter
    @Setter
    public static class Transaction {
        public Date investedOn;
        public Date redeemedOn;
        public double amount;
        public double investmentCost;
        public int afterIndexation;
        public double stt;
        public double tds;
        public double stcg;
        public double stampDuty;
        public int ltcg;
        public int fairValue;
        public double costForTax;
    }
}


