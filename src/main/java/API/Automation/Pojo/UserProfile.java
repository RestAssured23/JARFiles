package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class UserProfile {
    @Getter @Setter
    public static class Address{
        public String addressId;
        public String addressType;
        public String addressLine1;
        public String addressLine2;
        public String city;
        public String cityOthers;
        public String cityId;
        public String stateId;
        public String countryId;
        public String state;
        public String country;
        public String pincode;
        public String landmark;
    }
    @Getter @Setter
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
    public static class Data{
        public int userId;
        public String emailId;
        public String mobile;
        public String name;
        public int plId;
        public String token;
        public String defaultRiskProfileType;
        public ArrayList<Investor> investors;
        public int managementUserId;
        public String managementUserRoles;
        public UserType userType;
    }
    @Getter @Setter
    public static class Investor{
        public String name;
        public int investorId;
        public String pan;
        public String email;
        public String mobile;
        public String type;
        public boolean activated;
        public boolean minor;
        public String dateOfBirth;
        public String gender;
        public String nationality;
        public boolean nri;
        public ArrayList<Bank> banks;
        public int plId;
        public int paymentId;
        public ArrayList<Address> addresses;
    }
    @Getter @Setter
    public static class Root{
        public int code;
        public String desc;
        public ArrayList<Object> errors;
        public boolean success;
        public String type;
        public String name;
        public Data data;
    }
    @Getter @Setter
    public static class UserType{
        public String id;
        public String value;
        public String desc;
    }


}
