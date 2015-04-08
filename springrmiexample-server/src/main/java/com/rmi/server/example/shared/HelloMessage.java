package com.rmi.server.example.shared;

import java.io.Serializable;

/**
 * @author Yashprit
 */
public class HelloMessage implements Serializable {
    
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
