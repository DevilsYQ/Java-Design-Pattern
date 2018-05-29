package com.devil.test;

public class UpCommand implements Command //具体命令对象
{
    private AirConditioning airConditioning ;

    public UpCommand(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void execute() {
        airConditioning.up();
    }
}
