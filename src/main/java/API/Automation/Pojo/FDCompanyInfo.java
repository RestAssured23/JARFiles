package API.Automation.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class FDCompanyInfo {

    @Getter @Setter
    public static class Datum{
        public String name;
        public String id;
        public String image;
        public boolean paperless;
        public String description;
        public String lockInPeriod;
        public String seniorCitizen;
        public String women;
        public int minimumAmount;
        public int multiplesOf;
        public String tenure;
        public String interestRates;
        public ArrayList<Rating> ratings;
        public ArrayList<Faq> faqs;
        public ArrayList<Scheme> schemes;
        public ArrayList<Object> special;
    }
    @Getter @Setter
    public static class Faq{
        public String category;
        public ArrayList<Query> queries;
    }
    @Getter @Setter
    public static class Query{
        public String questionId;
        public String question;
        public String answer;
    }
    @Getter @Setter
    public static class Rating{
        public String category;
        public ArrayList<String> ratings;
    }
    @Getter @Setter
    public static class Root{
        public int code;
        public String desc;
        public ArrayList<Object> errors;
        public boolean success;
        public String type;
        public String name;
        public ArrayList<Datum> data;
    }
    @Getter @Setter
    public static class Scheme{
        public String monthly;
        public String quarterly;
        public String halfYearly;
        public String yearly;
        public String onMaturity;
        public Tenures tenures;
        public String tenure;
        public String tenureUnit;
        public Scheme scheme;
    }
    @Getter @Setter
    public static class Scheme2{
        public Object name;
        public Object id;
    }
    @Getter @Setter
    public static class Tenures{
        public int from;
        @JsonProperty("to")
        public int myto;
    }
}
