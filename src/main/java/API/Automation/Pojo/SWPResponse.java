package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;
import org.testng.annotations.Guice;

import java.util.ArrayList;
import java.util.Date;

public class SWPResponse {
    @Getter@Setter
    public static class Data{
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
        public double amount;
        public String amountFormatted;
        public String category;
        public ArrayList<String> swpAction;
        public String subCategory;
        public Date startDate;
        public Date endDate;
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

}
