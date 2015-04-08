package com.rmi.server.example.shared;

import java.io.Serializable;

/**
 * @author Yashprit
 */
public class HelloResponse implements Serializable {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
