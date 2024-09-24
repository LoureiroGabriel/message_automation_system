package com.message.automation.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {

    private String[] receiver;
    private String about;
    private String message;
    private String responseMessage;

    public String[] getReceiver() {
        return receiver;
    }

    public void setReceiver(String[] receiver) {
        this.receiver = receiver; // Aceitar um array de strings
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
