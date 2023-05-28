package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class CurrentSWP {
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
        public int amount;
        public String amountFormatted;
        public String category;
        public String subCategory;
        public String frequency;
        public String goalId;
        public String goalName;
        public ArrayList<String> swpAction;
        public Date startDate;
        public Date endDate;
        public Date nextInstallmentOn;
    }

}
