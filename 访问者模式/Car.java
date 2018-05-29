package com.devil.test;

import lombok.Data;

@Data
public class Car implements   InterViewee
{
    private Integer speed;

    @Override
    public void accept(Visit visit) {
        visit.visit(this);
    }
}
