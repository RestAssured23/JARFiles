package API.Automation.Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter@Setter
public class Redeem {

        public String holdingProfileId;

        public String folio;
        public String goalId;
        public String goalName;
        public String amcCode;
        public String schemeCode;
        public String schemeName;
        public Date date =null;
        public Integer amount =null;
        public Double units= null;
        public String amountFormatted = null;
        public String unitsFormatted=null;
        public String redemptionMode;
        public String dividendOption;
        public String option;
        public String bankId;
        public String redemptionType;
        public String otpReferenceId;
        public String questionnaireReferenceId;
        public Date redeemOn=null;
        public String verifyReferenceId;

    }


