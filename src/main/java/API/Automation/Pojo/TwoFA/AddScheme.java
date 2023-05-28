package API.Automation.Pojo.TwoFA;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class AddScheme {
    @Getter @Setter
    public static class Data{
        public boolean result;
        public String cartId;
        public Date addedOn;
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
