package API.Automation.Pojo.TwoFA;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class GetCart {
    @Getter@Setter
    public static class Data{
        public String cartId;
        public String holdingProfileId;
        public ArrayList<Group> groups;
    }
    @Getter@Setter
    public static class Folio{
        public String folio;
        public String schemeCode;
        public String schemeName;
        public String amcCode;
    }
    @Getter@Setter
    public static class Group{
        public String groupId;
        public String mobile;
        public String email;
        public ArrayList<Folio> folios;
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
