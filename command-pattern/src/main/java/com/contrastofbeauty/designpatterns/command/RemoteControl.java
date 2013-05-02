package com.contrastofbeauty.designpatterns.command;

public class RemoteControl {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
