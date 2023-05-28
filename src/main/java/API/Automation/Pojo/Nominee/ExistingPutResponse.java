package API.Automation.Pojo.Nominee;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class ExistingPutResponse {
    @Getter@Setter
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
    @Getter@Setter
    public static class Data{
        public ArrayList<Nominee> nominees;
        public ArrayList<Investor> investors;
    }
    @Getter@Setter
    public static class Error{
        public int productId;
        public String id;
        public String field;
        public int code;
        public String desc;
        public String type;
    }
    @Getter@Setter
    public static class Investor{
        public String investorId;
        public String investorName;
        public String message;
        public String otpReferenceId;
    }
    @Getter@Setter
    public static class Nominee{
        public String firstName;
        public String middleName;
        public String lastName;
        public String dateOfBirth;
        public String relationship;
        public String gender;
        public String email;
        public String mobile;
        public String salutation;
        public Address address;
        public String investorId;
        public String nomineeId;
        public boolean result;
        public String remark;
    }
    @Getter@Setter
    public static class Root{
        public int code;
        public String desc;
        public boolean success;
        public ArrayList<Error> errors;
        public String type;
        public Data data;
        public String name;
    }
}
