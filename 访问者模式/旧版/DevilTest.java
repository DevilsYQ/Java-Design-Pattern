package com.devil.test;

public class DevilTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(120);
        car.accept(new Devil());
        Ship ship = new Ship();
        ship.setName("刺猬号");
        ship.accept(new Devil());
    }
}
