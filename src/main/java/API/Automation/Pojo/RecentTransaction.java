package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class RecentTransaction {
    @Getter@Setter
    public static class Datum{
        public String holdingProfileId;
        public String holdingProfileName;
        public String product;
        public ArrayList<Mf> mf;
    }
    @Getter@Setter
    public static class Mf{
        public String folio;
        public String amcCode;
        public String schemeCode;
        public String schemeName;
        public String category;
        public String subCategory;
        public String referenceNo;
        public String type;
        public Date date;
        public String status;
        public double amount;
        public String amountFormatted;
        public double units;
        public String unitsFormatted;
        public String dividendType;
        public ArrayList<String> actions;
        public String subTransType;
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
