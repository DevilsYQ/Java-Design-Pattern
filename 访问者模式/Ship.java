package com.devil.test;

import lombok.Data;

@Data
public class Ship implements InterViewee
{
    private String name;

    @Override
    public void accept(Visit visit) {
        visit.visit(this);
    }
}
