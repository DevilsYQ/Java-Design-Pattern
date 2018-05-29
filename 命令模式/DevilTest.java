package com.devil.test;

public class DevilTest {
    public static void main(String[] args) {
        AirConditioning airConditioning = new AirConditioning();
        DownCommand downCommand = new DownCommand(airConditioning);
        UpCommand upCommand = new UpCommand(airConditioning);
        RemoteControl remoteControl = new RemoteControl(downCommand,upCommand);
        remoteControl.up();
        remoteControl.down();
    }
}
