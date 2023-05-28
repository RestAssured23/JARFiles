package API.Automation.Pojo.Nominee;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class ExistingGetDeclaration {

    @Getter@Setter
    public static class Address{
        public String addressLine1;
        public String addressLine2;
        public String city;
        public String state;
        public String pincode;
    }
    @Getter@Setter
    public static class Contact{
        public String type;
        public String mobile;
        public String email;
    }
    @Getter@Setter
    public static class Datum{
        public ArrayList<Nominee> nominees;
        public String status;
        public String remarks;
        public Mf mf;
        public ArrayList<Contact> contacts;
        public String declarationType;
        public boolean hasActiveNomination;
    }
    @Getter@Setter
    public static class Guardian{
        public String firstName;
        public String middleName;
        public String lastName;
        public Date dateOfBirth;
        public String relationship;
    }
    @Getter@Setter
    public static class Mf{
        public String folio;
        public String amc;
        public String amcCode;
    }
    @Getter@Setter
    public static class Nominee{
        public String firstName;
        public String middleName;
        public String lastName;
        public Date dateOfBirth;
        public String relationship;
        public String email;
        public Address address;
        public Guardian guardian;
        public int percentage;
        public String nomineeId;
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
