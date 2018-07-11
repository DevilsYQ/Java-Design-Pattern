package com.devil.test;

public class DevilTest {
    public static void main(String[] args) {
        BroadCast broadCast = new BroadCast();
        broadCast.add(new Devil());
        broadCast.add(new Devil());
        Devil devil = new Devil();
        broadCast.add(devil);
        broadCast.drop(devil);


    }
}
