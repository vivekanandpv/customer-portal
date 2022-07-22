package com.example.customerportal.response.interfaces.infra;

import com.example.customerportal.response.implementations.infra.ServerResponseWithBodyImplementation;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = ServerResponseWithBodyImplementation.class)
public interface IServerResponseWithBody<T>
        extends
        IServerResponseWithoutBody {
    T getBody();
}
