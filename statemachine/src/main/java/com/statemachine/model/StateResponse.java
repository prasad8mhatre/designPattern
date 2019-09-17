package com.statemachine.model;

public class StateResponse {
    private Boolean isSuccess;

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    @Override
    public String toString() {
        return "StateResponse{" +
                "isSuccess=" + isSuccess +
                '}';
    }
}
