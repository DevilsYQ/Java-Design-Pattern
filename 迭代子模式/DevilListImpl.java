package com.devil.test;

import com.google.common.collect.Lists;

import java.util.List;

public class  DevilListImpl<T> implements DevilList {
    private List<T> list = Lists.newArrayList();

    public DevilListImpl(List<T> list) {
        this.list = list;
    }

    public DevilListImpl() {
    }

    @Override
    public Iterator createIterator() {
        return new DevilIterator(this);
    }
    //白箱聚集
    public int size()
    {
        return list.size();
    }
    public T getItem(int index)
    {
        return  list.get(index);
    }
}
