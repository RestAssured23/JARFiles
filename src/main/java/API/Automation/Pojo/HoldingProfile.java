package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class HoldingProfile {
    @Getter@Setter
    public static class Bank{
        public String investorId;
        public String accountHolderName;
        public String neftBankId;
        public String upiBankId;
        public String tpslBankId;
        public String bankId;
        public String bankName;
        public String type;
        public String ifsc;
        public String accountNo;
        public String accountType;
        public String bankAccountType;
        public boolean activated;
        public ArrayList<String> mandateType;
        public String bankLookUpId;
        public String rzpNetBankId;
    }
    @Getter @Setter
    public static class Datum{
        public int userId;
        public String email;
        public String mobile;
        public String plId;
        public String holdingProfileId;
        public String holdingProfileName;
        public String holdingProfilePan;
        public int kyc;
        public boolean activated;
        public boolean joint;
        public boolean nri;
        public boolean minor;
        public boolean individual;
        public String country;
        public int transactionLimit;
        public boolean fatca;
        public String type;
        public ArrayList<Bank> banks;
        public ArrayList<Investor> investors;
    }
    @Getter @Setter
    public static class Guardian{
        public String investorId;
        public String holdingProfileId;
        public String investorName;
    }
    @Getter @Setter
    public static class Investor{
        public String investorId;
        public String holdingProfileId;
        public String investorName;
        public String type;
        public String  clientId;
        public boolean minor;
        public boolean poa;
        public Guardian guardian;
    }
    @Getter    @Setter
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
