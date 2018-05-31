package com.devil.test;

public interface Iterator<T> {
    void first();
    void last();
    void next();
    T getItem();
}
