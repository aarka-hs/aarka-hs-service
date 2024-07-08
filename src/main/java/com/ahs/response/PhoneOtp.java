package com.ahs.response;

import lombok.Data;

@Data
public class PhoneOtp {

    private boolean otpGenerated;
    private boolean isExistingUser;
}
