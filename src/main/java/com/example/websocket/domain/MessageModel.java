package com.example.websocket.domain;

import lombok.Data;

public class MessageModel {

    private String from;
    private String text;
    private String time;

    public MessageModel(String from, String text, String time){
        this.from = from;
        this.text = text;
        this.time = time;
    }
}
