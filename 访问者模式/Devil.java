package com.devil.test;

public class Devil implements  Visit {
    @Override
    public void visit(Car car) {
        System.out.println(car.getSpeed());
    }

    @Override
    public void visit(Ship ship) {
        System.out.println(ship.getName());
    }
}
