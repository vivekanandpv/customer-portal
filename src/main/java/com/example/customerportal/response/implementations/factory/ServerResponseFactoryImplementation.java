package com.example.customerportal.response.implementations.factory;

import com.example.customerportal.response.implementations.infra.ServerResponseWithBodyImplementation;
import com.example.customerportal.response.implementations.infra.ServerResponseWithoutBodyImplementation;
import com.example.customerportal.response.interfaces.factory.IServerResponseFactory;
import com.example.customerportal.response.interfaces.infra.IServerResponseWithBody;
import com.example.customerportal.response.interfaces.infra.IServerResponseWithoutBody;
import org.springframework.stereotype.Component;

@Component
public class ServerResponseFactoryImplementation
        implements
        IServerResponseFactory {

    @Override
    public IServerResponseWithoutBody getServerResponseWithoutBody(int responseCode, String message, boolean isOk) {
        return new ServerResponseWithoutBodyImplementation(
                responseCode,
                message,
                isOk
        );
    }

    @Override
    public <T> IServerResponseWithBody<T> getServerResponseWithBody(int responseCode, String message, boolean isOk, T body) {
        return new ServerResponseWithBodyImplementation(
                responseCode,
                message,
                isOk,
                body
        );
    }
}
