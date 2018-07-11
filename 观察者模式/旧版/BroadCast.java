package com.devil.test;

import com.google.common.collect.Sets;

import java.util.Iterator;
import java.util.Set;

public class BroadCast implements Subscriber {
    private Set<Listener> set = Sets.newHashSet();
    @Override
    public void add(Listener l1) {
      set.add(l1);
      callAll("添加"+l1.toString());
    }

    @Override
    public void drop(Listener l2) {
        set.remove(l2);
        callAll("删除"+l2.toString());
    }

    @Override
    public void callAll(String status) {
        Iterator<Listener> iterator = set.iterator();
        while (iterator.hasNext()) {
            Listener next = iterator.next();
            next.change(status);
        }
    }
}
