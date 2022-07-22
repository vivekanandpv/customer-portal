package com.example.customerportal.response.implementations.infra;

import com.example.customerportal.response.interfaces.infra.AbstractServerResponseWithBody;

public class ServerResponseWithBodyImplementation<T>
        extends
        AbstractServerResponseWithBody<T> {
    public ServerResponseWithBodyImplementation(
            int responseCode,
            String message,
            boolean isOk,
            T body
    ) {
        super(responseCode, message, isOk, body);
    }
}
