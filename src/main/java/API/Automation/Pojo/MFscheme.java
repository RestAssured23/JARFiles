package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class MFscheme {
    @Getter@Setter
    public static class Amounts{
        public double amount;
        public Object amountFormatted;
        public double units;
        public Object unitsFormatted;
        public int multiples;
        public double minimumAmount;
        public double minimumUnits;
        public Object minimumUnitsFormatted;
        public Object minimumAmountFormatted;
    }
    @Getter@Setter
    public static class Content{
        public String name;
        public String schemeCode;
        public String category;
        public String subCategory;
        public String categoryId;
        public String subCategoryId;
        public String amc;
        public String amcCode;
        public int rating;
        public double nav;
        public String navFormatted;
        public String navAsOn;
        public String expenseRation;
        public double maximumInvestment;
        public String maximumInvestmentFormatted;
        public double minimumInvestment;
        public String minimumInvestmentFormatted;
        public double multiplesOfInvestment;
        public String multiplesOfInvestmentFormatted;
        public double additionalInvestmentMultiples;
        public String additionalInvestmentMinimumFormatted;
        public double additionalInvestmentMinimum;
        public boolean rated;
        public boolean sip;
        public boolean oti;
        public double sipMinimumInvestment;
        public String sipMinimumInvestmentFormatted;
        public double sipMultiplesOfInvestment;
        public String sipMultiplesOfInvestmentFormatted;
        public double oneYearReturns;
        public double threeYearReturns;
        public double fiveYearReturns;
        public String risk;
        public String riskId;
        public boolean watchlist;
        public String exitLoad;
        public String benchmark;
        public String fundType;
        public int position;
        public String id;
        public ArrayList<String> dividendOptions;
        public String option;
        public String ineligibleCountries;
        public String schemeType;
        public int typeCode;
        public int minimumSipTenure;
        public String minimumSipTenureUnit;
        public StpFrequencies stpFrequencies;
        public ArrayList<SwpFrequency> swpFrequencies;
        public ArrayList<Integer> sipDates;
        public ArrayList<Integer> swpDates;
        public ArrayList<Integer> stpDates;
        public boolean stp;
        public ArrayList<String> systematicDays;
        public boolean nri;
        public boolean nfo;
        public boolean superSavings;
        public double minSwitchOutAmount;
        public String minSwitchOutAmountFormatted;
        public double minSwitchOutMultiplesAmount;
        public double minimumRedemptionAmount;
        public String minimumRedemptionAmountFormatted;
        public double multiplesOfRedemption;
        public int fiRank;
        public double alertSipMinimumInvestment;
        public String alertSipMinimumInvestmentFormatted;
        public ArrayList<String> sipTypes;
        public StpInvestment stpInvestment;
        public boolean oe;
        public boolean eligibleNri;
    }
    @Getter@Setter
    public static class Data{
        public ArrayList<Content> content;
        public int page;
        public int totalPages;
        public int size;
        public int count;
        public boolean first;
        public boolean last;
    }
    @Getter@Setter
    public static class In{
        public String frequency;
        public ArrayList<String> days;
        public int minimum;
        public Amounts amounts;
        public boolean enabled;
        public Object amount;
        public Object amountFormatted;
        public double units;
        public Object unitsFormatted;
        public int multiples;
        public double minimumAmount;
        public double minimumUnits;
        public Object minimumAmountFormatted;
        public Object minimumUnitsFormatted;
    }
    @Getter@Setter
    public static class Out{
        public String frequency;
        public ArrayList<String> days;
        public int minimum;
        public Amounts amounts;
        public boolean enabled;
        public Object amount;
        public Object amountFormatted;
        public double units;
        public Object unitsFormatted;
        public int multiples;
        public double minimumAmount;
        public double minimumUnits;
        public Object minimumAmountFormatted;
        public Object minimumUnitsFormatted;
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
    @Getter@Setter
    public static class StpFrequencies{
        public ArrayList<In> in;
        public ArrayList<Out> out;
    }
    @Getter@Setter
    public static class StpInvestment{
        public In in;
        public Out out;
    }
    @Getter@Setter
    public static class SwpFrequency{
        public String frequency;
        public ArrayList<String> days;
        public int minimum;
        public Amounts amounts;
    }
}
