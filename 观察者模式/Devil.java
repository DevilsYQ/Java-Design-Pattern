package com.devil.test;

public class Devil implements Listener {
    @Override
    public void change(String status) {
        System.out.println("我们中间发生了一些事  ----     "+status);
    }
}
