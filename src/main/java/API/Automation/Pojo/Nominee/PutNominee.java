package API.Automation.Pojo.Nominee;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class PutNominee {
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
    public static class Folio{
        public String folioNo;
        public String amc;
    }
    @Getter@Setter
    public static class Guardian{
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
        public String nomineeId;
        public Guardian guardian;
        public int percentage;
    }
    @Getter@Setter
    public static class Root{
        public String investorId;
        public String holdingProfileId;
        public ArrayList<Folio> folios;
        public String declarationType;
        public String processType;
        public ArrayList<Nominee> nominees;
        public String otpReferenceId;
    }
}
