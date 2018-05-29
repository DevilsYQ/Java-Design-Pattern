package com.devil.test;

public class DownCommand implements Command  //具体命令对象
{
    private AirConditioning airConditioning ;

    public DownCommand(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }
    @Override
    public void execute() {
        airConditioning.down();
    }
}
