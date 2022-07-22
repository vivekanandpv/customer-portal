package com.example.customerportal.response.interfaces.infra;

public abstract class AbstractServerResponseWithoutBody
        implements
        IServerResponseWithoutBody {
    private int responseCode;
    private String message;
    private boolean isOk;

    public AbstractServerResponseWithoutBody() {
    }

    public AbstractServerResponseWithoutBody(
            int responseCode,
            String message,
            boolean isOk
    ) {
        this.responseCode = responseCode;
        this.message = message;
        this.isOk = isOk;
    }

    @Override
    public int getResponseCode() {
        return responseCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isOk() {
        return isOk;
    }
}
