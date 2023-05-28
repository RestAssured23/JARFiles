package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class MandateAPI {
    @Getter@Setter
    public static class Bank{
        public String investorId;
        public String accountHolderName;
        public String bankId;
        public String bankName;
        public String type;
        public String ifsc;
        public String micr;
        public String accountNo;
        public String accountType;
        public String bankAccountType;
        public boolean activated;
        public ArrayList<String> mandateType;
    }
    @Getter@Setter
    public static class Datum{
        public String consumerCode;
        public String investorId;
        public String holdingProfileId;
        public String name;
        public String expiresOn;
        public double availableAmount;
        public int maxAmount;
        public String status;
        public String bankNameAccNo;
        public String remarks;
        public boolean activated;
        public String mandateType;
        public Bank bank;
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
