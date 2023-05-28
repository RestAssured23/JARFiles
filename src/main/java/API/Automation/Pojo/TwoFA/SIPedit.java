package API.Automation.Pojo.TwoFA;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class SIPedit {
    @Getter @Setter
    public static class Data{
        public int code;
        public boolean result;
        public String description;
    }
    @Getter @Setter
    public static class Error{
        public int productId;
        public String id;
        public String field;
        public int code;
        public String desc;
        public String type;
    }
    @Getter @Setter
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
