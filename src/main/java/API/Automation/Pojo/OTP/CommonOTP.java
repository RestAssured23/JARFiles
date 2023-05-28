package API.Automation.Pojo.OTP;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class CommonOTP {
    @Getter@Setter
    public static class Data{
        public String otpReferenceId;
        public String message;
        public boolean triggered;
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
