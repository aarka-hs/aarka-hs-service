package com.ahs.response;

import lombok.Data;

@Data
public class AhsResponse {

    private boolean isError;
    private Success success;
}
