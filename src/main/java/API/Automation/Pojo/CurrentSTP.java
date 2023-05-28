package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class CurrentSTP {
    @Getter@Setter
    public static class Data{
        public int count;
        public int size;
        public String next;
        public int page;
        public boolean first;
        public boolean last;
        public int totalPages;
        public ArrayList<Scheme> schemes;
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
        public String stpId;
        public String schemeName;
        public String schemeCode;
        public String folio;
        public String goalId;
        public String goalName;
        public double units;
        public String unitsFormatted;
        public int amount;
        public String amountFormatted;
        public String frequency;
        public String initialInvestmentFormatted;
        public int initialInvestment;
        public String dayOrDate;
        public int completedInstallments;
        public int noOfInstallments;
        public String dividendOption;
        public String toSchemeCode;
        public String toSchemeName;
        public String toCategory;
        public String toAmcCode;
        public String category;
        public String subCategory;
        public String toSubCategory;
        public String amcCode;
        public int totalStpAmount;
        public String totalStpAmountFormatted;
        public String stpType;
        public ArrayList<String> action;
        public Date startDate;
        public Date endDate;
        public Date nextInstallmentOn;
        public double minimumAmount;
        public double maximumAmount;
        public double nominalAmount;
        public double expectedReturn;
        public double currentValue;
    }


}
