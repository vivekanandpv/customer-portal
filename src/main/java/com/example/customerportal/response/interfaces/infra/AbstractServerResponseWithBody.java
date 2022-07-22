package com.example.customerportal.response.interfaces.infra;

public abstract class AbstractServerResponseWithBody<T>
        extends
        AbstractServerResponseWithoutBody
        implements IServerResponseWithBody<T> {
    private final T body;

    public AbstractServerResponseWithBody(
            int responseCode,
            String message,
            boolean isOk,
            T body) {
        super(responseCode, message, isOk);
        this.body = body;
    }

    @Override
    public T getBody() {
        return body;
    }
}
