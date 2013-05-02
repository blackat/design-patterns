package com.contrastofbeauty.designpatterns.command;

public class Light {

    private boolean on;

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }
}
