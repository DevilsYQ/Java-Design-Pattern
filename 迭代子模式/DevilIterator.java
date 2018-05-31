package com.devil.test;

import com.google.common.collect.Lists;

public class DevilIterator<T> implements  Iterator {
    private DevilListImpl<T> list = new DevilListImpl();

    public DevilIterator(DevilListImpl<T> list) {
        this.list = list;
        this.size = list.size();
    }
    private int index = -1;
    private int size = 0 ;

    @Override
    public void first() {
        this.index = 0 ;
    }

    @Override
    public void last() {
        this.index = this.size - 1;
    }

    @Override
    public void next() {
        if(index < size - 1)
        this.index++;
        else{throw new RuntimeException();}
    }

    @Override
    public T getItem() {
        return list.getItem(index);
    }
}
