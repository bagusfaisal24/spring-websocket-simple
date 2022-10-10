package com.example.websocket.form;

import lombok.Data;

@Data
public class MessageForm {
    private String from;
    private String text;
    private String time;
}
