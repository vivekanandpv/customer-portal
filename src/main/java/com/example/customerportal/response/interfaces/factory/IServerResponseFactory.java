package com.example.customerportal.response.interfaces.factory;


import com.example.customerportal.response.interfaces.infra.IServerResponseWithBody;
import com.example.customerportal.response.interfaces.infra.IServerResponseWithoutBody;

public interface IServerResponseFactory {
    IServerResponseWithoutBody getServerResponseWithoutBody(
            int responseCode,
            String message,
            boolean isOk
    );

    <T> IServerResponseWithBody<T> getServerResponseWithBody(
            int responseCode,
            String message,
            boolean isOk,
            T body
    );
}
