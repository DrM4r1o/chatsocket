package com.example.chatsocket.model;

public class Message {

    private String from;
    private String text;

    public Message() {}

    public Message(String from, String text) {
        this.from = from;
        this.text = text;
    }

    public String getFrom() {
        return this.from;
    }

    public String getText() {
        return this.text;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setText(String text) {
        this.text = text;
    }
}
