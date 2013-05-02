package com.contrastofbeauty.designpatterns.command;

public class Client {
    public static void main(String[] args) {
        // invoker
        RemoteControl remoteControl = new RemoteControl();

        // receiver
        Light light = new Light();

        // create a command and pass the receiver
        Command command = new LightOnCommand(light);

        // pass the command to the invoker
        remoteControl.setCommand(command);

        // press the button
        remoteControl.buttonPressed();
    }
}
