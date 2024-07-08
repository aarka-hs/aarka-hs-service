package com.ahs.request;

import lombok.Data;

@Data
public class PhoneOtpPayload {

    private String countryId;
    private Customer customer;
    private boolean resend;
    private String source;

}
