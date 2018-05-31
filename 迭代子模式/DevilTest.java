package com.devil.test;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;

public class DevilTest {
    public static void main(String[] args) {
        DevilList list = new DevilListImpl(ImmutableList.of("1","2","3"));
        Iterator iterator = list.createIterator();
        try {
            while(true)
            {
                iterator.next();
                System.out.println(iterator.getItem());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
