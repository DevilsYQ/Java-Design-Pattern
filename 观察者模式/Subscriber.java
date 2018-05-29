package com.devil.test;

public interface Subscriber {
    void add(Listener l1);
    void drop(Listener l2);
    void callAll(String status);
}
