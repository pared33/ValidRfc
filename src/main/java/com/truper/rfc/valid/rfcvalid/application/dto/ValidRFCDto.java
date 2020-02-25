package com.truper.rfc.valid.rfcvalid.application.dto;

public class ValidRFCDto {
    private Boolean response;

    public ValidRFCDto() {
    }

    public ValidRFCDto(Boolean response) {
        this.response = response;
    }

    public Boolean getResponse() {
        return response;
    }

    public void setResponse(Boolean response) {
        this.response = response;
    }
}
