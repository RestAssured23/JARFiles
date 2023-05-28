package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class QuestionnaireResponse {
    @Getter@Setter
    public static class Data{
        public String type;
        public String referenceId;
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
