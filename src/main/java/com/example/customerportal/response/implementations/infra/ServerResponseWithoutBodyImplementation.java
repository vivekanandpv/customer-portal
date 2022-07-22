package com.example.customerportal.response.implementations.infra;


import com.example.customerportal.response.interfaces.infra.AbstractServerResponseWithoutBody;

public class ServerResponseWithoutBodyImplementation
        extends
        AbstractServerResponseWithoutBody {
    public ServerResponseWithoutBodyImplementation(
            int responseCode,
            String message,
            boolean isOk
    ) {
        super(responseCode, message, isOk);
    }
}
