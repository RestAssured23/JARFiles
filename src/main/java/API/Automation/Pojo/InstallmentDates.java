package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

public class InstallmentDates {
    @Getter@Setter
    public static class Data{
        public Object ecsDay;
        public String frequency;
        public String feature;
        public Date startDate;
        public Date endDate;
        public int ecsDate;
        public int installments;
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
