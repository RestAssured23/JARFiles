package API.Automation.Pojo.OTP;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter@Setter
public class VerifyOtpRequest {
    @Getter@Setter
    public static class Root {
        private Otp otp;
        private String otpReferenceId;
    }

    @Getter@Setter
    public static class Otp{
        private String email;
        private String sms;
        private String email_or_sms;
    }


}
