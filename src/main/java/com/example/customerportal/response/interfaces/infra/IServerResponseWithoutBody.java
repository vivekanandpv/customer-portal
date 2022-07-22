package com.example.customerportal.response.interfaces.infra;

import com.example.customerportal.response.implementations.infra.ServerResponseWithoutBodyImplementation;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = ServerResponseWithoutBodyImplementation.class)
public interface IServerResponseWithoutBody {
    int getResponseCode();

    String getMessage();

    boolean isOk();
}
